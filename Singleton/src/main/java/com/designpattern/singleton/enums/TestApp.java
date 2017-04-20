package com.designpattern.singleton.enums;

import com.designpattern.singleton.lazy.LazySingleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Administrator
 * @Date: 2017/4/9
 * @Time: 11:50
 */
public class TestApp {



    public static void main(String[] args) throws InterruptedException {
        System.out.println(EnumSingleton.INSTANCE.getInstance());
        System.out.println(EnumSingleton.INSTANCE.getInstance());
        System.out.println(EnumSingleton.INSTANCE.getInstance());


    }
}
