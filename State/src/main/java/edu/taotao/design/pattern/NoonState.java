package edu.taotao.design.pattern;

/**
 * 中午状态
 *
 * @author ZhuTao
 * @create 2017-10-31 20:50
 */
public class NoonState extends State{


    @Override
    public void work(Work work) {
        if (work.getHour() < 13){
            System.out.println("当前时间：" + work.getHour()+"点，饿了，午饭；犯困，午休。");
        }else{
            // 超过13点，转入下一个状态：下午工作状态
            work.setCurrent(new AfternoonState());
            work.work();
        }
    }
}
