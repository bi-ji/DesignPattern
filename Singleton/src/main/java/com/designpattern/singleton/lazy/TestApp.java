package com.designpattern.singleton.lazy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Administrator
 * @Date: 2017/4/9
 * @Time: 11:50
 */
public class TestApp extends Thread{

    @Override
    public void run() {
        try {
            LazySingleton singleton = LazySingleton.getInstance();
            System.out.println(singleton.hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        LazySingleton instance1 = LazySingleton.getInstance();
//        LazySingleton instance2 = LazySingleton.getInstance();
//        if (instance1 == instance2) {
//            System.out.println("instance1和instance2是同一个实例");
//        } else {
//            System.out.println("instance1和instance2不是同一个实例");
//        }
        for (int i = 0; i < 1000; i++) {
//            Thread thread = new Thread(new TestRunnable(),""+i);
//            thread.start();
            Thread thread = new TestApp();
            thread.start();
        }

    }
}
