package edu.taotao.design.pattern;

/**
 * 傍晚工作状态
 *
 * @author ZhuTao
 * @create 2017-10-31 20:55
 */
public class EveningState extends State {

    @Override
    public void work(Work work) {
        // 这里判断工作是否完成了
        if (work.isTaskFinished()){
            // 完成，下班状态
            work.setCurrent(new RestState());
        }else {
            // 未完成，加班状态
            if (work.getHour() < 21){
                System.out.println("当前时间：" + work.getHour() +"点，加班哦，疲累之极");
            }else {
                // 总是要睡觉的，不能超过21点还在加班
                work.setCurrent(new SleepingState());
                work.work();
            }
        }
    }
}
