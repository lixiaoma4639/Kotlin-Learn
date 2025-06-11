package 第四章对象

/**
 * 日期 : 2020/10/21.
 * 创建 : xin.li
 * 描述 :
 *
 *
 * public / internal / protected /private
 * 参考书本4.1.3节
 */

internal open class TalkButton : Focusable{
    private fun yell() = println("hey.")
    protected fun whisper() = println("let us talk...")
}

fun main() {
    val talkButton = TalkButton()
    talkButton.showOff()
}

/**
 * 扩展函数需要和扩展的类的访问权限级别一致或者更低
 */
private fun TalkButton.giveSpeech(){

//    yell()

//    whisper()
}

