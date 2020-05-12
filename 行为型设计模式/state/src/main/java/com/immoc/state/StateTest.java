package com.immoc.state;

/**
 * 测试类
 *
 * @author Mr.Xu
 * @date 2020/5/12 23:03
 */
public class StateTest {

    public static void main(String[] args) {
        VideoContext videoContext = new VideoContext(new PauseState());
        videoContext.play();
        videoContext.speed();
        videoContext.speed();
        videoContext.stop();
        videoContext.stop();
        videoContext.speed();
        videoContext.pause();
        videoContext.play();
        videoContext.play();
        videoContext.pause();

    }

}
