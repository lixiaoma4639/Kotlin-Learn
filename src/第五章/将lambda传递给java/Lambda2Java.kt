package 第五章.将lambda传递给java

import 第五章.使用java函数式接口.Button

/**
 * 日期 : 2020/10/29.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {
    val button = Button()
    button.postDelay(1000 ) { println("执行了...")}
    button.postDelay(1000 , object : Runnable{
        override fun run() {
            println("执行了...")
        }
    })
}