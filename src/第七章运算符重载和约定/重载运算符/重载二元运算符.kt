package 第七章运算符重载和约定.重载运算符

/**
 * 日期 : 2020/11/3.
 * 创建 : xin.li
 * 描述 :
 */

data class Point(val x : Int , val y : Int){
    //这种情况和扩展函数是一致的
//    operator fun plus(other : Point) : Point{
//        return Point(x + other.x , y + other.y)
//    }
}

//乘法
operator fun Point.times(other : Point) : Point {
    return Point(x * other.x , y * other.y)
}

//加法
operator fun Point.plus(other : Point) : Point {
    return Point(x + other.x , y + other.y)
}

//+=
//operator fun Point.plusAssign(other : Point) : Unit {
//}

fun main1() {
    var point = Point(1, 2)
    val point2 = Point(1, 2)

    point += point2
    println(point)

    println(point + point2)
    println(point * point2)

    //只要java的方法名满足kotlin语法的运算符规则也可以直接使用重载运算符
    val 运算符test = 运算符test(2, 3)
    val 运算符test2 = 运算符test(2, 3)
    println(运算符test + 运算符test2)
}

fun main() {
    val array= arrayListOf(1, 2)
    array += 3
    println(array)

    val array2 = arrayListOf(4, 5)
//    array2 += array
    //返回了新的集合
    val list = array + array2
    println(list)

    var list1 = listOf(1, 2, 3)
    val list2 = listOf(4, 5, 6)
    //等价于 list1 + list2
    list1 += list2
    println(list1)
}

