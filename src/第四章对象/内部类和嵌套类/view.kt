package 第四章对象.内部类和嵌套类

import java.io.Serializable

/**
 * 日期 : 2020/10/21.
 * 创建 : xin.li
 * 描述 :
 */
interface State : Serializable

interface View {
    fun getCurrentState() : State
    fun restoreState(state: State){}
}