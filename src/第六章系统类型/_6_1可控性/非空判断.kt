package 第六章系统类型._6_1可控性

/**
 * 日期 : 2020/10/31.
 * 创建 : xin.li
 * 描述 :
 */

fun isNull(string: String?){
    //!!表示非空断言 认为string不可能为空, 如果为空则抛出异常吧
    val str: String = string!!
    println(str.length)
}

fun main() {
    isNull(null)
}