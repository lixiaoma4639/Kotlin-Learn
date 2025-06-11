package 第七章运算符重载和约定.集合与区间的约定

import java.lang.IllegalArgumentException

/**
 * 日期 : 2020/11/5.
 * 创建 : xin.li
 * 描述 :
 */

data class Point(var x : Int ,  var y : Int , var city : String){}

//使用get/set 约定实现 [] 使用
operator fun Point.get(index: Int) : Int{
    return when(index){
        0 -> x
        1 -> y
        else -> throw IllegalArgumentException("输入不合法...")
    }
}
//最后一个元素 放在 = 号之后, 其他元素都是[]中的参数
operator fun Point.set(index : Int , index2 : Int ,  value : Int){
    when (index % index2){
        0 -> x = value
        1 -> y = value
    }
}

fun main() {
    val point = Point(333, 444 , "北京")
    println(point[0])
    println(point[1])

    point[0 , 2] = 555
    point[1 , 2] = 666
    println(point)
}