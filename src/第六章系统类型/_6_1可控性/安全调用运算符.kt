package 第六章系统类型._6_1可控性

/**
 * 日期 : 2020/10/29.
 * 创建 : xin.li
 * 描述 :
 */

fun main() {
    println(printAllCase(null))
    println(printAllCase("abc"))

    val employee = Employee("李鑫", Employee("张三", null))
    println(managerName(employee))
}

fun printAllCase(string: String?) : String?{
    //如果string不为空则执行后面语句, 如果为空则返回一个null不执行后面语句
    return string?.toUpperCase()
}

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name