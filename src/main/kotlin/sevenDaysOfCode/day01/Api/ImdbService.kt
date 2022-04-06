package sevenDaysOfCode.day01.Api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ImdbService {

    @GET("Top250Movies/{imdbKey}")
    suspend fun getTop250Movies(@Path("imdbKey") imdbKey : String) : Response<Any>
}