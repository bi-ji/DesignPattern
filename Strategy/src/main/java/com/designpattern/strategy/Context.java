package com.designpattern.strategy;

/**
 * Created with IntelliJ IDEA.
 *  策略执行者，决定执行那种策略
 * @author Administrator
 * @Date: 2017/4/20
 * @Time: 22:21
 */
public class Context {

    //构造函数，你要使用哪个妙计
    private IStrategy strategy;

    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    //执行策略
    public void operate(){
        strategy.operate();
    }
}
