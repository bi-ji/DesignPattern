package com.designpattern.singleton.lazy;

import com.designpattern.singleton.eager.EagerSingleton;

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
        String threadName = Thread.currentThread().getName();
        try {
            System.out.println("线程:" + threadName +">>>>>>>>>>"+ LazySingleton.getInstance().hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
