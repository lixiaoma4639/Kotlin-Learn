package 第四章对象.内部类和嵌套类

/**
 * 日期 : 2020/10/21.
 * 创建 : xin.li
 * 描述 :
 */
class Button2 : View{
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    //这是一个嵌套类,默认就是嵌套类
    class ButtonState : State{}

    //这是一个内部类, 需要inner修饰
    inner class ButtonState2 : State{
        //使用关键字@引用外部类对象
        fun getOuterReference() : Button2 = this@Button2

        fun getHHH(){
            this@Button2.getCurrentState()
        }
    }
}