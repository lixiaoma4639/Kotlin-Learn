package 第七章运算符重载和约定.委托属性

/**
 * 日期 : 2020/11/7.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {
    val personM = PersonM()
    val map = mapOf("name" to "李鑫", "company" to "波士顿动力")
    for ((key , value) in map){
        personM.setAttributes(key , value)
    }
    println(personM.name)
    println(personM.company)
}

class PersonM{
    private val mAttributes = hashMapOf<String , String>()

    //实际可发中, 可以使用json 或者数据库读取的数据替代该方法
    fun setAttributes(attrName : String  ,  value : String){
        mAttributes[attrName] = value
    }

    val name : String
        get() = mAttributes["name"]!!

    //使用属性委托从 数据中读取 想要的结果
    val company by mAttributes
}