package edu.taotao.design.pattern;

/**
 * 工作，触发状态的改变
 *
 * @author ZhuTao
 * @create 2017-10-31 20:45
 */
public class Work {

    private State current;

    private Integer hour;

    private boolean taskFinished;

    public Work() {
        // 默认为上午上班状态
        current = new ForenoonState();
    }

    public void work() {
        this.current.work(this);
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public boolean isTaskFinished() {
        return taskFinished;
    }

    public void setTaskFinished(boolean taskFinished) {
        this.taskFinished = taskFinished;
    }
}
