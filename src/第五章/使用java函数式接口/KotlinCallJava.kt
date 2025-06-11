package 第五章.使用java函数式接口

/**
 * 日期 : 2020/10/29.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {
    val listener2 = object : OnClickListener{
        override fun onClickListener(view: View?) {
            when (view?.id) {
                1 -> println("点击了第1个按钮...")
                2 -> println("点击了第2个按钮...")
            }
        }
    }
    //上面和下面表达的是一个意思
    val listener = OnClickListener { view ->
        when (view.id) {
            1 -> println("点击了第1个按钮...")
            2 -> println("点击了第2个按钮...")
        }
    }

    val button1 = Button()
    val button2 = Button()
    button1.setOnClickListener { listener }
    button2.setOnClickListener { listener }
}

fun main1() {
    /*
        这种方式可以工作的原因是 OnClickListener 接口只有一个抽象方法。这种
        接口被称为函数式接口，或者SAM接口， SAM代表单抽象方法。 Java API 中随处
        可见像 Runnable Callback 这样的函数式接口，以及支持它们的方法。 Kotlin
        允许你在调用接收函数式接口作为参数的方法时使用 lambda ，来保证你的 Katlin
        码既整洁又符合习惯。
    */
    val button = Button()
    button.setOnClickListener { view -> println("我被点击了...") }
    button.setOnClickListener { println("我被点击了...") }
}