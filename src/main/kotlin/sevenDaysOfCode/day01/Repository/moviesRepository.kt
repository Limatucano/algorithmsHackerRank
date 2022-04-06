package sevenDaysOfCode.day01.Repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext
import retrofit2.Response
import sevenDaysOfCode.day01.Api.RetrofitBuilder

class moviesRepository {

    suspend fun getTop250Movies(imdbKey:String): Response<Any> {
        return GlobalScope.async(Dispatchers.IO) {
            RetrofitBuilder.service.getTop250Movies(imdbKey)
        }.await()
    }

}