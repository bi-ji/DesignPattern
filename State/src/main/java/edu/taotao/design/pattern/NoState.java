package edu.taotao.design.pattern;

/**
 * 没有使用状态模式之前
 *
 * @author ZhuTao
 * @create 2017-10-31 20:23
 */
public class NoState {
    /**
     * 时间点
     */
    private static int hour = 0;
    /**
     * 工作是否完成的标记
     */
    private static boolean workFinished = false;


    private static void work(){
        if (hour < 12){
            System.out.println("当前时间：" + hour + "点,上午工作，精神百倍");
        }else if (hour < 13){
            System.out.println("当前时间：" + hour + "点，饿了，午饭，犯困，午休。");
        }else if (hour < 17){
            System.out.println("当前时间：" + hour + "点，下午状态不错，继续努力。");
        }else {
            if (workFinished){
                System.out.println("当前时间：" + hour + "点，下班回家了。");
            }else {
                if (hour < 21){
                    System.out.println("当前时间：" + hour + "点，加班哦，疲累之极。");
                }else {
                    System.out.println("当前时间：" + hour + "点，不行了，睡着了。");
                }
            }

        }
    }

    public static void main(String[] args) {
        hour = 9;
        work();
        hour = 10;
        work();
        hour = 13;
        work();
        hour = 14;
        work();
        hour = 17;
        work();
//        workFinished = true;
        // 加班状态
        workFinished = false;
        work();
        hour = 19;
        work();
        hour = 22;
        work();
    }
}
