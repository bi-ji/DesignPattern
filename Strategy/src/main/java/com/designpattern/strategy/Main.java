package com.designpattern.strategy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Administrator
 * @Date: 2017/4/20
 * @Time: 22:23
 */
public class Main {

    public static void main(String[] args) {
        Context context;
        System.out.println("--------使用策略One-------------------");
        context = new Context(new StrategyOne());
        context.operate();
        System.out.println("--------使用策略Two-------------------");
        context = new Context(new StrategyTwo());
        context.operate();
        System.out.println("--------使用策略Three-------------------");
        context = new Context(new StrategyThree());
        context.operate();
    }
}
