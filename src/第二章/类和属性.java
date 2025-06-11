package 第二章;

/**
 * 日期 : 2020/10/17.
 * 创建 : xin.li
 * 描述 :
 */
public class 类和属性 {
    public static void main(String[] args) {
        Person2 person2 = new Person2("李鑫" , 28 , false);
        System.out.println("name = " + person2.getName());
        System.out.println("age = " + person2.getAge());
        System.out.println("isMarried = " + person2.isMarried());
    }
}
