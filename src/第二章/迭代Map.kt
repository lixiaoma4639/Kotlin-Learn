package 第二章

import java.util.*

/**
 * 日期 : 2020/10/18.
 * 创建 : xin.li
 * 描述 :
 */

val binaryReps = TreeMap<Char , String>()

fun main(args: Array<String>) {
    for (c in 'A' .. 'F'){
        val toBinaryString = Integer.toBinaryString(c.toInt())
        binaryReps[c] = toBinaryString;
    }
    binaryReps.put('G' , "10000200")

    for ((key , value) in binaryReps){
        println("$key = $value")
    }
}