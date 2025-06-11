package 第七章运算符重载和约定.委托属性

import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * 日期 : 2020/11/7.
 * 创建 : xin.li
 * 描述 :
 */

/**
 * 实现四
 */
class CCCC(val name : String , age : Int , salary: Int) : PropertyChangeAware() {

    private val observable = {
            prop : KProperty<*> , oldValue : Int , newValue: Int -> changeSupport.firePropertyChange(prop.name , oldValue ,newValue)
    }

    var age : Int by Delegates.observable(age , observable)
    var salary : Int by Delegates.observable(salary , observable)

}


public inline fun <T> observable(initialValue: T, crossinline onChange: (property: KProperty<*>, oldValue: T, newValue: T) -> Unit)
        :   ReadWriteProperty<Any?, T> = object : ObservableProperty<T>(initialValue) {
                override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) = onChange(property, oldValue, newValue)
            }