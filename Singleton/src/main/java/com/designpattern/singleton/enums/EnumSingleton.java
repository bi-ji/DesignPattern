package com.designpattern.singleton.enums;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Administrator
 * @Date: 2017/4/11
 * @Time: 7:33
 */
public enum  EnumSingleton {

    INSTANCE;

    private Singleton instance;

    private EnumSingleton(){
        instance = new Singleton();
    }

    public Singleton getInstance(){
        return instance;
    }



}
