package com.designpattern.strategy;

/**
 * Created with IntelliJ IDEA.
 *     策略一：找A帮忙
 * @author Administrator
 * @Date: 2017/4/20
 * @Time: 22:16
 */
public class StrategyOne implements IStrategy {

    public void operate() {
        System.out.println("策略一：找A帮忙");
    }
}
