package 第七章运算符重载和约定.解构声明

/**
 * 日期 : 2020/11/5.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {
    val arrayListOf = hashMapOf("李鑫" to 18, "张三" to 20)
    printEnters(arrayListOf)

    val entries = arrayListOf.entries
    for (enter in entries){
        val key = enter.key
        val value = enter.value
        println("我叫$key , 我今年${value}岁了")
    }
}

fun printEnters(map: MutableMap<String , Int>){
    // (a , b) in 解构语法
    for ((a , b) in map){
        println("我叫$a , 我今年${b}岁了")
    }
}