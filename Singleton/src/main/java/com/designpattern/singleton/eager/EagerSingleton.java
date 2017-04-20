package com.designpattern.singleton.eager;

/**
 * Created with IntelliJ IDEA.
 * 单例模式Singleton饿汉式
 *     作用
 *          保证整个应用程序中某个实例有且只有一个
 * @author Administrator
 * @Date: 2017/4/9
 * @Time: 11:50
 */
public class EagerSingleton {

    //1:构造方法私有化
    // 保证外界无法通过构造创建多个实例
    private EagerSingleton(){

    }

    //2:唯一实例
    private  static EagerSingleton instance = new EagerSingleton();

    //3:提供获取实例的方法
    public static EagerSingleton getInstance(){
        return instance;
    }
}
