package 第七章运算符重载和约定.集合与区间的约定

/**
 * 日期 : 2020/11/5.
 * 创建 : xin.li
 * 描述 :
 */

data class PointIn(var x : Int ,  var y : Int ){}

class Rectangle (val left : PointIn , val right: PointIn){

    //约定in的实现方式
    operator fun contains(other : PointIn) : Boolean{
        //until 开区间, 不包含结尾元素 , 闭区间使用 ..
        return other.x in left.x until right.x && other.y in left.y .. right.y
    }
}

fun main() {
    val rectangle = Rectangle(PointIn(20, 50), PointIn(40, 100))
    println(PointIn(30 , 100) in rectangle)
    println(PointIn(40 , 100) in rectangle)
}