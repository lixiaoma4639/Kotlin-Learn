package 第八章lambda作为形参和返回值.声明高阶函数.在java中

/**
 * 日期 : 2020/11/7.
 * 创建 : xin.li
 * 描述 :
 */

fun processTheAnswer (f: (Int) -> Int) {
    println(f(42))
}