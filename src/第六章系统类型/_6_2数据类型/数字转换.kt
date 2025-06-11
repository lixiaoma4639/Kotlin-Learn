package 第六章系统类型._6_2数据类型

/**
 * 日期 : 2020/10/31.
 * 创建 : xin.li
 * 描述 :
 */
fun main() {
    val i = 1;
    val ll = 123L
    val l : Long = i.toLong()
    val f : Float = i.toFloat()
    println(l)
    println(f)

    println("55".toInt())

    var nullableInt = try {
        "5h".toInt()
    } catch (e: NumberFormatException) {
        0
    }
    println(nullableInt)

    println("4d".toIntOrNull() ?: 0)
}