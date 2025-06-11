package 第七章运算符重载和约定.委托属性

import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * 日期 : 2020/11/5.
 * 创建 : xin.li
 * 描述 :
 */

open class PropertyChangeAware{
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeAwareListener(listener : PropertyChangeListener){
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeAwareListener(listener : PropertyChangeListener){
        changeSupport.removePropertyChangeListener(listener)
    }
}

/**
 * 实现一
 */
class Person(val name : String , age : Int , salary: Int) : PropertyChangeAware() {
    // field 在这里就代指的是属性本身
    var age : Int = age
        set(value) {
            val oldValue = field
            field = value
            changeSupport.firePropertyChange("age" , oldValue , value)
        }

    var salary : Int = salary
        set(value) {
            val oldValue = field
            field = value
            changeSupport.firePropertyChange("salary" , oldValue , value)
        }


}

/**
 * 进化实现二
 */
class Person22(val name : String , age : Int , salary: Int) : PropertyChangeAware() {

    val _ageObj = ObservableProperty("age" , age , changeSupport)
    var age : Int
        get() = _ageObj.getValue()
        set(value) {
            _ageObj.setValue(value)
        }

    val _salaryObj = ObservableProperty("salary" , age , changeSupport)
    var salary : Int
        get() = _salaryObj.getValue()
        set(value) {
            _salaryObj.setValue(value)
        }

}

/**
 * @param propName 老数据
 */
class ObservableProperty(val propName: String, var propValue: Int, val changeSupport: PropertyChangeSupport){
    fun getValue(): Int = propValue
    fun setValue(newValue : Int){
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(propName , oldValue , newValue)
    }
}

fun main1() {
    val person = Person("李鑫", 18, 30000)
    person.addPropertyChangeAwareListener(PropertyChangeListener {
        event  ->  println("${event.propertyName}由 ${event.oldValue} 变成了 ${event.newValue}")
    })

    person.age = 30
    person.salary = 32000
}

/**
 * 实现三
 */
fun main() {
    val person = Person33("李鑫", 18, 30000)
    person.addPropertyChangeAwareListener(PropertyChangeListener {
            event  ->  println("${event.propertyName}由 ${event.oldValue} 变成了 ${event.newValue}")
    })

    person.age = 29
    person.salary = 32000
}

// by 是 operator  getValue/setValue  的约定
class Person33(val name : String , age : Int , salary: Int) : PropertyChangeAware() {

    var age : Int by ObservableProperty33( age , changeSupport)

    var salary : Int by ObservableProperty33(salary , changeSupport)

}

class ObservableProperty33( var propValue: Int, val changeSupport: PropertyChangeSupport){
    operator fun getValue(person33: Person33, property: KProperty<*>): Int = propValue
    operator fun setValue(person33: Person33 , property : KProperty<*> , newValue: Int){
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(property.name , oldValue , newValue)
    }
}


fun main44() {
    val person = Person44("李鑫", 18, 30000)
    person.addPropertyChangeAwareListener(PropertyChangeListener {
            event  ->  println("${event.propertyName}由 ${event.oldValue} 变成了 ${event.newValue}")
    })

    person.age = 28
    person.salary = 32000
}

/**
 * 实现四
 */
class Person44(val name : String , age : Int , salary: Int) : PropertyChangeAware() {

    private val observable = {
        prop : KProperty<*> , oldValue : Int , newValue: Int -> changeSupport.firePropertyChange(prop.name , oldValue ,newValue)
    }

    var age : Int by Delegates.observable(age , observable)
    var salary : Int by Delegates.observable(salary , observable)

}

