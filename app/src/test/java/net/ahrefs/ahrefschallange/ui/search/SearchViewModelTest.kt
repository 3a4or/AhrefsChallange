package net.ahrefs.ahrefschallange.ui.search

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import net.ahrefs.ahrefschallange.CoroutineTestRule
import net.ahrefs.ahrefschallange.data.network.BaseRepository
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import net.ahrefs.ahrefschallange.data.entities.Result
import net.ahrefs.ahrefschallange.data.entities.SearchItem
import net.ahrefs.ahrefschallange.getOrAwaitValue


class SearchViewModelTest {

    @ExperimentalCoroutinesApi
    @get:Rule
    var mainCoroutineRule = CoroutineTestRule()

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @Mock
    lateinit var baseRepository: BaseRepository

    private lateinit var restaurantsViewModel: SearchViewModel

    @Before
    fun init() {
        MockitoAnnotations.openMocks(this)
        restaurantsViewModel = SearchViewModel(baseRepository)
    }

    @Test
    fun getSearchData_successWithData() {
        runBlocking {
            val returnList = listOf(SearchItem("fully"))
            Mockito.`when`(baseRepository.getSearchResults("fu")).thenReturn(Result.Successful(returnList))
        }
        restaurantsViewModel.getData("fu")
        Assert.assertEquals(restaurantsViewModel.resultsList.getOrAwaitValue().size, 1)
    }

    @Test
    fun getSearchData_successWithoutData() {
        runBlocking {
            val returnList = listOf<SearchItem>()
            Mockito.`when`(baseRepository.getSearchResults(null)).thenReturn(Result.Successful(returnList))
        }
        restaurantsViewModel.getData(null)
        Assert.assertEquals(restaurantsViewModel.resultsList.getOrAwaitValue().size, 0)
    }

    @Test
    fun getSearchData_failBecauseOfAuthenticationError() {
        runBlocking {
            Mockito.`when`(baseRepository.getSearchResults(null)).thenReturn(Result.AuthenticationError())
        }
        restaurantsViewModel.getData(null)
        val errorValue = restaurantsViewModel.error.getOrAwaitValue()
        Assert.assertTrue(errorValue is Result.AuthenticationError)
    }

    @Test
    fun getSearchData_failBecauseOfServerError() {
        runBlocking {
            Mockito.`when`(baseRepository.getSearchResults(null)).thenReturn(Result.ServerError())
        }
        restaurantsViewModel.getData(null)
        val errorValue = restaurantsViewModel.error.getOrAwaitValue()
        Assert.assertTrue(errorValue is Result.ServerError)
    }
}