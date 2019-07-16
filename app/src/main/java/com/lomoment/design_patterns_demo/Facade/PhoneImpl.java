package com.lomoment.design_patterns_demo.Facade;

/**
 * @author panyz
 * @date 2019/7/16
 * @Description
 */
public class PhoneImpl implements Phone {
    @Override
    public void dail() {
        System.out.println(">>>打电话<<<");
    }

    @Override
    public void hangup() {
        System.out.println(">>>挂断电话<<<");
    }
}
