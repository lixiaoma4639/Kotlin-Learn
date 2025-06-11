package 第七章运算符重载和约定.重载运算符;

/**
 * 日期 : 2020/11/3.
 * 创建 : xin.li
 * 描述 :
 */
class 运算符test {

    private int x ;
    private int y ;

    public 运算符test(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public 运算符test plus(运算符test test){
        return new 运算符test(this.x + test.x , this.y + test.y);
    }

    @Override
    public String toString() {
        return "运算符test(x=" + x + ", y=" + y + ")";
    }
}
