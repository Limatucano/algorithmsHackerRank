package coroutinesCourse.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
//        countDownFlow.collectLatest { time ->
//            println(time.toString())
//        }
//        val reduce = countDownFlow.reduce { accumulator, value ->
//            accumulator + value
//        }
//        println(reduce)
//        val count = countDownFlow.count {
//            it % 2 == 0
//        }
//        println(count)
//        countDownFlow.onEach { time ->
//            println("onEach without other operators: $time")
//        }.launchIn(this)
//
//        countDownFlow.filter { time ->
//            time % 2 == 0
//        }.map { time ->
//            time * time
//        }.onEach { time ->
//            println("onEach with other operators: $time")
//        }.collect{ time ->
//            println("collect: $time")
//        }
//        flow1.flatMapConcat { value ->
//            flow {
//                emit(value + 1)
//                delay(500L)
//                emit(value + 2)
//            }
//        }.collect{value ->
//            println("the value is $value")
//        }

        flow2.collect{value ->
            println(value)
        }
    }
}
val flow2 = (1..10).asFlow()

val flow1 = flow<Int> {
    emit(1)
    delay(500L)
    emit(2)
    delay(500L)
    emit(3)
}

val countDownFlow = flow<Int> {
    val startingValue = 10
    var currentValue = startingValue
    emit(currentValue)

    while (currentValue > 0){
        delay(1000L)
        currentValue--
        emit(currentValue)
    }
}