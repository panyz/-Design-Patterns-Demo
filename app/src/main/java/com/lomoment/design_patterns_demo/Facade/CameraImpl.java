package com.lomoment.design_patterns_demo.Facade;

/**
 * @author panyz
 * @date 2019/7/16
 * @Description
 */
public class CameraImpl implements Camera{
    @Override
    public void open() {
        System.out.println(">>>打开相机<<<");
    }

    @Override
    public void takePicture() {
        System.out.println(">>>拍照<<<");
    }

    @Override
    public void close() {
        System.out.println(">>>关闭相机<<<");
    }
}
