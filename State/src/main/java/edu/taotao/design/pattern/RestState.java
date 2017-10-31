package edu.taotao.design.pattern;

/**
 * 下班状态
 *
 * @author ZhuTao
 * @create 2017-10-31 20:59
 */
public class RestState extends State {

    @Override
    public void work(Work work) {
        System.out.println("当前时间：" + work.getHour() +"点，下班回家了。");
    }
}
