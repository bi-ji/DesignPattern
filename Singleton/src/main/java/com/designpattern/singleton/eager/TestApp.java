package com.designpattern.singleton.eager;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Administrator
 * @Date: 2017/4/9
 * @Time: 11:50
 */
public class TestApp {

    public static void main(String[] args) {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        if (instance1 == instance2){
            System.out.println("instance1和instance2是同一个实例");
        }else{
            System.out.println("instance1和instance2不是同一个实例");
        }

        Thread thread = new Thread(new TestRunnable());
        thread.start();
        TestThread thread1 = new TestThread();
        thread1.start();
    }
}
