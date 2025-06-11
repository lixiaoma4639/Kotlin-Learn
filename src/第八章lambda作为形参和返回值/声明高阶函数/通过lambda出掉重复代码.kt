package 第八章lambda作为形参和返回值.声明高阶函数

/**
 * 日期 : 2020/11/7.
 * 创建 : xin.li
 * 描述 :
 */

data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)

enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }

//求某个平台的平均值
fun List<SiteVisit>.averageDurationFor(os: OS): Double =
    this.filter {
        it.os == os
    }.map(SiteVisit::duration).average()

//根据用户给出的 条件 求平均值
fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean): Double =
    filter(predicate).map(SiteVisit::duration).average()

fun main() {
    val listOf = listOf(
        SiteVisit("/", 2.0, OS.ANDROID),
        SiteVisit("/", 3.0, OS.WINDOWS),
        SiteVisit("/", 9.0, OS.WINDOWS),
        SiteVisit("/", 4.0, OS.IOS),
        SiteVisit("/", 5.0, OS.LINUX),
        SiteVisit("/", 6.0, OS.MAC),
        SiteVisit("/", 4.0, OS.MAC)
    )

    val average = listOf.filter {
        it.os == OS.WINDOWS
    }.map(SiteVisit::duration)
        .average()
    println(average)

    //根据平台求平均值
    println(listOf.averageDurationFor(OS.MAC))

    println(listOf.averageDurationFor{
        it.os == OS.MAC
    })

    //根据我给出的条件求平均值
    println(listOf.averageDurationFor {
        it.os in setOf(OS.ANDROID, OS.IOS)
    })
}