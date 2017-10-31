package edu.taotao.design.pattern;

/**
 * 下午工作状态
 *
 * @author ZhuTao
 * @create 2017-10-31 20:52
 */
public class AfternoonState extends State {

    @Override
    public void work(Work work) {
        if (work.getHour() < 17) {
            System.out.println("当前时间：" + work.getHour() + "点，下午状态还不错，继续努力。");
        }else {
            // 转入傍晚工作状态
            work.setCurrent(new EveningState());
            work.work();
        }
    }
}
