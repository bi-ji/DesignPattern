package com.designpattern.singleton.eager;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Administrator
 * @Date: 2017/4/9
 * @Time: 12:09
 */
public class TestRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            EagerSingleton instance = EagerSingleton.getInstance();
            System.out.println("Thread1:"+instance);
        }
    }
}
