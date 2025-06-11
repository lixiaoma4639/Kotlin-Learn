package 第十章注解和反射.使用泛型作为注解参数

import jkid.CustomSerializer
import java.util.*

/**
 * 日期 : 2021/2/5.
 * 创建 : xin.li
 * 描述 :
 */
data class Person(
    val name: String ,
    @CustomSerializer(DateSerializer::class) val birthday: Date
)