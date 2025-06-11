package 第四章对象

/**
 * 日期 : 2020/10/24.
 * 创建 : xin.li
 * 描述 :
 */
class CountingSet<T>(val innerSet: MutableCollection<T> = HashSet<T>()) : MutableCollection<T>
by innerSet {

    override fun contains(element: T): Boolean {
        return false;
    }
}

fun main() {
    val countingSet = CountingSet<String>(hashSetOf<String>("1", "2", "3"))
    val contains = countingSet.contains("3")
    println(contains)
}


class DelegateCollection<T> ( innerList : Collection<T> = ArrayList()) : Collection<T> by innerList{
    override fun isEmpty(): Boolean {
        return false
    }
}