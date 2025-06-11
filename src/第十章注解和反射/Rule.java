package 第十章注解和反射;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 日期 : 2021/2/5.
 * 创建 : xin.li
 * 描述 :
 */
@Target({ElementType.FIELD , ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface Rule {

}
