package 第六章系统类型.集合

/**
 * 日期 : 2020/11/1.
 * 创建 : xin.li
 * 描述 :
 */

fun main1() {
    val list : List<Int?> = listOf(1, 2, 3, null, 4, null, 5)
    val filterNotNull = list.filterNotNull()
    println(filterNotNull.sum())
    println("有 ${list.size - filterNotNull.size} 个空元素")

    val arrayListOf = arrayListOf(1, 2, 3, 4, 5)
    //元素可变集合
    val changeList : MutableCollection<Int> = arrayListOf
    //根据变量类型确定 , 元素不可变集合
    val notChangeList : Collection<Int> = arrayListOf
    changeList.add(6)
    changeList.remove(1)
    println(changeList)

    //注意陷阱, 此处的notChangeList不可变元素已经被修改
    println(notChangeList)
}

fun main() {
    //不可变的字典
    val mapOf = mapOf("1" to 1, "2" to 2)
}