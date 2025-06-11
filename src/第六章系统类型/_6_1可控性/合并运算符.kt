package 第六章系统类型._6_1可控性

/**
 * 日期 : 2020/10/29.
 * 创建 : xin.li
 * 描述 :
 */
fun main() {
    println(foo(null))
    println(strLength("fffffff"))
    println(strLength(null))
}

fun foo(string: String?):String{
    return string ?: "xxx"
}


fun strLength(string: String?) : Int{
    return string?.length ?: 0
}