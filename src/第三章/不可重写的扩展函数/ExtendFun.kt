package 第三章.不可重写的扩展函数

/**
 * 日期 : 2020/10/19.
 * 创建 : xin.li
 * 描述 :
 */

/**
 * 扩展函数, 尽量避开和接收者对象成员函数重名
 */
fun View.showOff() = println("i am view ...")
fun Button.showOff() = println("i am button ...")

fun main(args: Array<String>) {
    val view : View = Button();
    view.click()
    view.showOff()

    val viewBtn  = Button();
    viewBtn.showOff()
}