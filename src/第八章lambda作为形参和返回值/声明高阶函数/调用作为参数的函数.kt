package 第八章lambda作为形参和返回值.声明高阶函数

/**
 * 日期 : 2020/11/7.
 * 创建 : xin.li
 * 描述 :
 */

fun main2() {
    twoAndThree { x, y -> x + y }
    twoAndThree { x, y -> x - y }
    twoAndThree { x, y -> x * y }
    twoAndThree { x, y -> x / y }
}

//定义一个形参是 lambda的函数
fun twoAndThree(operation : (Int , Int) -> Int){
    val result = operation(2 , 3)
    println(result)
}


fun main() {
    val value = "abc9D"
    val filter = value.filter { c: Char -> c in 'A' .. 'z' }
    println(filter)

    println(value.filter2 { it in '0' ..  '9' })
}

public fun String.filter2(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length){
        val value = get(index)
        if (predicate(value)){
            sb.append(value)
        }
    }
    return sb.toString()
}