package 第九章泛型.泛型和子类型化

/**
 * 日期 : 2020/11/10.
 * 创建 : xin.li
 * 描述 :
 */

fun addA(list : MutableList<Any>){
    list.add(1)
}

fun main() {
    val mutableList : MutableList<String> = mutableListOf("1", "AB")
    // MutableList<String> 不是 MutableList<Any> 的子类型 , 此处称为 不变型
//    addA(mutableList)

}