package com.designpattern.singleton.eager;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Administrator
 * @Date: 2017/4/9
 * @Time: 12:13
 */
public class TestThread extends Thread {

    @Override
    public void run() {
        this.setName("Thead2");
        for (int i = 0; i < 100; i++) {
            EagerSingleton instance = EagerSingleton.getInstance();
            System.out.println(this.getName()+instance);
        }
    }
}
