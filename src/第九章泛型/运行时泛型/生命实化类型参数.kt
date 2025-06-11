package 第九章泛型.运行时泛型

/**
 * 日期 : 2020/11/10.
 * 创建 : xin.li
 * 描述 :
 */

//fun <T> isA2(value : Any) : Boolean{
//    return value is T
//}
//可以将T作为 类型实参
inline fun <reified T> isA(value : Any) : Boolean{
    return value is T
}

fun main() {
    val list = listOf(1, 2, "3F", 4.0 , "5F")
    //过滤集合中是<Int>的值
    val filterIsInstance = list.filterIsInstance<Int>()
    println(filterIsInstance)
    println(list.filterIsInstance2<String>())
}

//实化 类型形参 使用举例
inline fun <reified R> Iterable<*>.filterIsInstance2(): List<R> {
    val mutableList = mutableListOf<R>()
    for (element in this){
        if (element is R){
            mutableList.add(element)
        }
    }
    return mutableList
}