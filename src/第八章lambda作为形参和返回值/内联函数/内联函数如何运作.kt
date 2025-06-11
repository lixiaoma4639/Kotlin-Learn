package 第八章lambda作为形参和返回值.内联函数

import java.util.concurrent.locks.Lock

/**
 * 日期 : 2020/11/8.
 * 创建 : xin.li
 * 描述 :
 */

/**
 * 内联函数  就是在被其他A函数调用时, 将内联函数的方法体copy进 那个调用的函数体中,
 * 而不是在那个调用的A函数中创建匿名函数式接口对象
 */
inline fun <T> synchronized(lock: Lock , action: () -> T) : T{
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

fun foo (lock: Lock){
    println("Before sync")
    synchronized(lock){
        println("action...")
    }
    println("after sync...")
}

fun main() {

}