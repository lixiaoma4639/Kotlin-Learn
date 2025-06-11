package 第九章泛型.运行时泛型

/**
 * 日期 : 2020/11/10.
 * 创建 : xin.li
 * 描述 :
 */

fun printSum(collection: Collection<*>){
    //泛型在运行时被擦除
    val list = collection as? List<Int> ?: throw IllegalArgumentException("不是list")
    println(list.sum())
}

fun printSum2(collection: Collection<Int>){
    //泛型在运行时被擦除
    if (collection is List<Int> ){
        println(collection.sum())
    }
}

fun main() {
    printSum(listOf(1 , 2 , 3))
    //error
//    printSum(setOf(1 , 2))
//    printSum(listOf("1" , "2"))
//    printSum2(listOf("1" , "2"))
    printSum2(listOf(1 , 2))
}