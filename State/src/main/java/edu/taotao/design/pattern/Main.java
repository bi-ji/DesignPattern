package edu.taotao.design.pattern;

/**
 * 测试客户端
 *
 * @author ZhuTao
 * @create 2017-10-31 21:02
 */
public class Main {

    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.work();
        work.setHour(10);
        work.work();
        work.setHour(12);
        work.work();
        work.setHour(13);
        work.work();
        work.setHour(14);
        work.work();
        work.setHour(17);
        work.work();
        work.setTaskFinished(false);
        work.setHour(19);
        work.work();
        work.setHour(21);
        work.work();
        work.setHour(22);
        work.work();
    }
}
