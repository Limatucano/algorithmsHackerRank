package sevenDaysOfCode.day01

import kotlinx.coroutines.*
import sevenDaysOfCode.IMDB_KEY
import sevenDaysOfCode.day01.Repository.moviesRepository
import java.util.*

suspend fun main(args : Array<String>){
    getTop250Movies(moviesRepository())

}

suspend fun getTop250Movies(moviesRepository: moviesRepository){
    val response = moviesRepository.getTop250Movies(IMDB_KEY)
}