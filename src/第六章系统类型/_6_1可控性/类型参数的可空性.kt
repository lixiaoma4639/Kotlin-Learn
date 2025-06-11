package 第六章系统类型._6_1可控性

/**
 * 日期 : 2020/10/31.
 * 创建 : xin.li
 * 描述 :
 */

//泛型类型默认是可空的
fun <T> printHashcode(t : T){
    println(t.hashCode())
}

//指定了泛型上限为Any,则参数就不可为null
fun <T : Any> printHashcode2(t : T){
    println(t.hashCode())
}



fun main() {
    printHashcode(null)
//    printHashcode2(null)
}