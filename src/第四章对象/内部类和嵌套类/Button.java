package 第四章对象.内部类和嵌套类;

/**
 * 日期 : 2020/10/21.
 * 创建 : xin.li
 * 描述 :
 */
class Button implements View{

    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(State state) {

    }

    public class ButtonState implements State{

    }
}
