package 第九章泛型.泛型和子类型化

/**
 * 日期 : 2020/11/12.
 * 创建 : xin.li
 * 描述 :
 */

interface Comparator2<in T> {
    fun compare(el: T, e2: T): Int {
        return el.hashCode() - e2.hashCode()
    }
}

fun main() {
    val anyComparator = Comparator<Any> {
            el, e2 -> el.hashCode() - e2.hashCode()
    }
    val list = listOf("a", "b", "c")
    list.sortedWith(anyComparator)

    enumerateCats(Animal::getIndex)
    enumerateCats{
        ChinaCat().getIndex()
    }
}

class ChinaCat : Cat(){}

fun enumerateCats (f : (Cat) -> Number) {
    f(ChinaCat())
}
fun Animal.getIndex() : Int = 1
