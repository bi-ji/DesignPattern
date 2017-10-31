package edu.taotao.design.pattern;

/**
 * 上午工作状态
 *
 * @author ZhuTao
 * @create 2017-10-31 20:46
 */
public class ForenoonState extends State {

    @Override
    public void work(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间：" + work.getHour() + "点，上午工作，精神百倍。");
        }else {
            // 超过12点，则转入中午工作状态
            work.setCurrent(new NoonState());
            work.work();
        }
    }
}
