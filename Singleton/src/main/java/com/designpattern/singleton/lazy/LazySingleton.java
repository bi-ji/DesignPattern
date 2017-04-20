package com.designpattern.singleton.lazy;

/**
 * Created with IntelliJ IDEA.
 * 单例模式Singleton懒汉式
 * 作用
 * 保证整个应用程序中某个实例有且只有一个
 * 缺点：
 * 线程不安全
 *
 * @author Administrator
 * @Date: 2017/4/9
 * @Time: 11:50
 */
public class LazySingleton {


    private static int count = 0;

    //1:构造方法私有化
    // 保证外界无法通过构造创建多个实例
    private LazySingleton() {

    }

    //2:唯一实例
    private static LazySingleton instance = null;

    //3:提供获取实例的方法
    public static LazySingleton getInstance() throws InterruptedException {
        if (instance == null) {
            Thread.sleep(1000);
            count++;
            System.out.println("count" + count);
            instance = new LazySingleton();
        }
        return instance;
    }
}
