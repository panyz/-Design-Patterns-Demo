package com.lomoment.design_patterns_demo.Facade;

/**
 * @author panyz
 * @date 2019/7/16
 * @Description
 */
public class MobilePhone {

    private Phone mPhone = new PhoneImpl();
    private Camera mCamera = new CameraImpl();

    public void dail() {
        mPhone.dail();
    }

    public void videoChat() {
        System.out.println("视频聊天接通中");
        mCamera.open();
        mPhone.dail();
    }

    public void hangup() {
        mPhone.hangup();
    }

    public void takePicture() {
        mCamera.open();
        mCamera.takePicture();
    }

    public void closeCamera() {
        mCamera.close();
    }


}
