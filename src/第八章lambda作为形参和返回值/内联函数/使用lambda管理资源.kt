package 第八章lambda作为形参和返回值.内联函数

import com.sun.corba.se.impl.orbutil.threadpool.ThreadPoolImpl
import java.io.BufferedReader
import java.io.FileReader

/**
 * 日期 : 2020/11/8.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {

}

fun readFirstLineFromFile(path : String) : String{
    BufferedReader(FileReader(path)).use {
        return it.readLine()
    }

    ThreadPoolImpl(5 , 5 , 5L , "hhh" ).use {
        it.getWorkQueue(1)
    }

}