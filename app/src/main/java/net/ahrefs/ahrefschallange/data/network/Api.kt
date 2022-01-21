package net.ahrefs.ahrefschallange.data.network

import net.ahrefs.ahrefschallange.data.entities.SearchItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface Api {

    @GET("ac/?c=list")
    suspend fun getSearchResults(@Query("q") q: String?): Response<List<SearchItem>>
}