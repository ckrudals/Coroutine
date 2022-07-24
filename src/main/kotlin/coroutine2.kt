import kotlinx.coroutines.*
import java.io.Closeable

//fun main(args: Array<String>) = runBlocking<Unit> {
//    println("My job is ${coroutineContext[Job]}")
//
//}

//fun main(args: Array<String>) = runBlocking {
//    val job = launch(Dispatchers.Default) {
//        for (i in 1..10) {
//            if (this.isActive)
//            println("I'm sleeping $i ...")
//            Thread.sleep(500L)
//        }
//    }
//
//    delay(1300L)
//    println("main : I'm tired of waiting!")
//    job.cancelAndJoin()
//    println("main : Now I can quit.")
//}

//fun main(args: Array<String>) = runBlocking {
//    val job = launch(Dispatchers.Default) {
//        for (i in 1..10) {
//            if (!isActive) {
//                break
//            }
//            println("I'm sleeping $i ...")
//            Thread.sleep(500L)
//        }
//    }
//
//    delay(1300L)
//    println("main : I'm tired of waiting!")
//    job.cancelAndJoin()
//    println("main : Now I can quit.")
//}

//fun main(args: Array<String>) = runBlocking {
//    val job = launch(Dispatchers.Default) {
//        for (i in 1..10) {
//            yield()
//            println("I'm sleeping $i ...")
//            Thread.sleep(500L)
//        }
//    }
//
//    delay(1300L)
//    println("main : I'm tired of waiting!")
//    job.cancelAndJoin()
//    println("main : Now I can quit.")
//}

//fun main(args: Array<String>) = runBlocking {
//    val job = launch {
//        try {
//            repeat(1000) { i ->
//                println("I'm sleeping $i ...")
//                delay(500L)
//            }
//        } finally {
//            println("main : I'm running finally!")
//        }
//    }
//
//    delay(1300L)
//    println("main : I'm tired of waiting!")
//    job.cancelAndJoin()
//    println("main : Now I can quit.")
//}
//fun main(args: Array<String>) = runBlocking {
//    val job = launch {
//        SleepingBed().use {
//            it.sleep(1000)
//        }
//    }
//
//    delay(1300L)
//    println("main : I'm tired of waiting!")
//    job.cancelAndJoin()
//    println("main : Now I can quit.")
//}
//
//class SleepingBed : Closeable {
//
//    suspend fun sleep(times: Int) {
//        repeat(times) { i ->
//            println("I'm sleeping $i ...")
//            delay(500L)
//        }
//    }
//
//    override fun close() {
//        println("main : I'm running close() in SleepingBed!")
//    }
//
//}

fun main(args: Array<String>) = runBlocking<Unit> {
    withTimeout(1300L) {
        launch {
            try {
                repeat(1000) { i ->
                    println("I'm sleeping $i ...")
                    delay(500L)
                }
            } finally {
                println("main : I'm running finally!")
            }
        }
    }
}