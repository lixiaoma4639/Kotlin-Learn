package 第七章运算符重载和约定.集合与区间的约定

import java.time.LocalDate

/**
 * 日期 : 2020/11/5.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {
    //此处的in 其实是iterator的约定, 不是contains的约定
    for (c in "abc"){
        println(c)
    }
    //上面的实际执行其实就是下面这样
    val iterator = "abc".iterator()
    while (iterator.hasNext()){
        print("我是${iterator.next()} , ")
    }

    println()

    val now = LocalDate.now()
    val plusDays = now .. now.plusDays(10)
    for (everyDay in plusDays){
        println(everyDay)
    }
}

//实现LocalDate 区间的遍历
operator fun ClosedRange<LocalDate>.iterator() : Iterator<LocalDate> =
    //匿名对象
    object : Iterator<LocalDate> {
        var current = start

        override fun hasNext(): Boolean {
            return current <= endInclusive
        }

        override fun next(): LocalDate = current.apply {
            //当前日期增加一天
            current = plusDays(1)
        }

    }