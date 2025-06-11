package 第三章

/**
 * 日期 : 2020/10/20.
 * 创建 : xin.li
 * 描述 :
 */
fun main() {
    //使用字符串分隔
    println("12.345-6.A".split("."))
    println("12.345-6.A".split("." , "-"))
    //使用正则分隔
    println("12.345-6.A".split(regex = "\\.|-".toRegex()))
}