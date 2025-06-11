package 第四章对象

/**
 * 日期 : 2020/10/21.
 * 创建 : xin.li
 * 描述 :
 */
interface Clickable{
    fun click()
    fun showOff() = println("我是Clickable的showoff...")
}

interface Focusable{
    fun showOff() = println("我是Focusable的showoff...")
}

class Button : Clickable , Focusable {

    override fun click() {
        println("我被点了....")
    }

//    override fun showOff() {
//        super.showOff()
//    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
        println("我是Button的showoff...")
    }

}

fun main() {
    val button = Button()
    button.click()
    button.showOff()
}