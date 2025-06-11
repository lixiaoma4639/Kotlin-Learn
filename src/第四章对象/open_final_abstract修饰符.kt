package 第四章对象

/**
 * 日期 : 2020/10/21.
 * 创建 : xin.li
 * 描述 :
 */

open class RichButton : Clickable{
    override fun click() {
        println("我是一个可以被继承的方法...")
    }

    final override fun showOff() {
        super.showOff()
        println("不能再被继承的方法...")
    }

    fun disable(){} //默认是final的,不可用被继承

    open fun animate(){} // open可以被继承
}

class ChildButton : RichButton() {
    override fun click() {
        super.click()
    }

    override fun animate() {
        super.animate()
    }


}

fun main() {
}