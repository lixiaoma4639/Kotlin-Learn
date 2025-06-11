package 第十章注解和反射

/**
 * 日期 : 2021/2/5.
 * 创建 : xin.li
 * 描述 : kotlin中的注解 Retention默认就是RUNTIME, 如果是RUNTIME可以省略
 */
@Target(AnnotationTarget.PROPERTY , AnnotationTarget.FIELD)
@Retention(AnnotationRetention.BINARY)
annotation class JsonName (val name : String)