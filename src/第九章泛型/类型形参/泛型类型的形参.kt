package 第九章泛型.类型形参

/**
 * 日期 : 2020/11/9.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {
    //kotlin中必须显示的生命泛型或者可以推导出泛型,不允许出现没有泛型的语句
    val mutableListOf = mutableListOf<String>()
    val mutableList : MutableList<String> = mutableListOf()
    val mutableList2 = mutableListOf(1 , 2 , 3)
}