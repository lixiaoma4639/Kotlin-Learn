package 第十章注解和反射.使用泛型作为注解参数

import jkid.ValueSerializer
import java.util.*

/**
 * 日期 : 2021/2/5.
 * 创建 : xin.li
 * 描述 :
 */
class DateSerializer : ValueSerializer<Date> {

    override fun toJsonValue(value: Date): Any? {
        TODO("Not yet implemented")
    }

    override fun fromJsonValue(jsonValue: Any?): Date {
        TODO("Not yet implemented")
    }
}