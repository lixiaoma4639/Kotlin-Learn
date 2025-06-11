package 第三章.不可重写的扩展函数;

/**
 * 日期 : 2020/10/19.
 * 创建 : xin.li
 * 描述 :
 */
class ExtendFunTest {
    public static void main(String[] args) {
        View view = new Button();
        view.click();
        ExtendFunKt.showOff(view);
    }
}
