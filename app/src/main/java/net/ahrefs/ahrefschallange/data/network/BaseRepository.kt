package net.ahrefs.ahrefschallange.data.network

import retrofit2.Response
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton
import net.ahrefs.ahrefschallange.data.entities.Result

@Singleton
class BaseRepository @Inject constructor(private val api: Api) {

    suspend fun getSearchResults(query: String?) =
        handleErrors { api.getSearchResults(query) }

    private suspend fun <T> handleErrors(func: suspend () -> Response<T>): Result<T> {
        return try {
            val response = func()
            if (response.isSuccessful) {
                Result.Successful(response.body()!!)
            } else {
                when (response.code()) {
                    400 -> Result.ClientError(response.code())
                    401 -> Result.AuthenticationError()
                    in 500..599 -> Result.ServerError()
                    404 -> Result.ServerError()
                    else -> Result.ServerError()
                }
            }
        } catch (ex: IOException) {
            Result.NetworkError()
        } catch (ex: Exception) {
            ex.printStackTrace()
            Result.ServerError()
        }
    }
}