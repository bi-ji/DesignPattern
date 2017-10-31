package edu.taotao.design.pattern;

/**
 * 睡眠状态
 *
 * @author ZhuTao
 * @create 2017-10-31 21:00
 */
public class SleepingState extends State {

    @Override
    public void work(Work work) {
        System.out.println("当前时间：" + work.getHour() +"点，撑不住了，睡觉。");
    }
}
