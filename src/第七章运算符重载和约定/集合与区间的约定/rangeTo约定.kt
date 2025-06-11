package 第七章运算符重载和约定.集合与区间的约定

import java.time.LocalDate

/**
 * 日期 : 2020/11/5.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {
    val now = LocalDate.now()
    //.. 是 rangeTo 的约定
    //未来10的一个闭区间
    val closedRange = now .. now.plusDays(10)
    //判断未来一周是否在该区间中
    println(now.plusWeeks(1) in closedRange)
}