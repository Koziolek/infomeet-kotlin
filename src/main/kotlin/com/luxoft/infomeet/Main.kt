package com.luxoft.infomeet

import com.google.common.base.Stopwatch
import com.luxoft.infomeet.petclinic.model.Pet
import java.util.concurrent.TimeUnit

/**
 * Created by BKuczynski on 2016-06-08.
 */
fun main(args: Array<String>) {
    println(l(null))
}

fun l(name:String?) : Int?{
    return name!!.length
}

fun <T, U, R> timingLog(a: T, b: U, f: (T, U) -> R): R {
    val watch = Stopwatch.createStarted()
    try {
        return f(a, b)
    } finally {
        println("call in μs: " + watch.elapsed(TimeUnit.MICROSECONDS))
    }
}

fun <T, U, R> curr(f: (T, U) -> R): (T) -> (U) -> R {
    return fun(t: T): (U) -> R {
        return fun(u: U): R {
            return f(t, u)
        }
    }
}