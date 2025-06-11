package 第七章运算符重载和约定.委托属性

/**
 * 日期 : 2020/11/5.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {
    val personBy = PersonBy("李鑫", 18)
//    personBy.email
//    personBy.email
    personBy.email2
    personBy.email2
    personBy.email2
}

//惰性初始化, 就类似java中的懒汉模式
data class PersonBy(val name : String , val age : Int){
    private var _emails : List<Email>? = null

    val email : List<Email>
        get() {
            if (_emails == null){
                _emails = loadEmail(this)
            }
            return _emails!!
        }

    //以上使用惰性初始化 可以使用 kotlin提供的
    val email2 : List<Email> by lazy {
         loadEmail(this)
    }

}

class Email{}

fun loadEmail(personBy: PersonBy) : List<Email>{
    println("我是 ${personBy.name}")
    return emptyList()
}

