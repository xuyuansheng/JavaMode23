package com.immoc.state;

/**
 * 视频状态
 *
 * @author Mr.Xu
 * @date 2020/5/12 22:41
 */
public class SpeedState extends VideoState {
    @Override
    public void play() {
        super.videoContext.setVideoState(new PlayState());
        System.out.println("视频已从 快速播放状态 转换为了 播放状态");
    }

    @Override
    public void pause() {
        super.videoContext.setVideoState(new PauseState());
        System.out.println("视频已从 快速播放状态 转换为了 暂停状态");
    }

    @Override
    public void speed() {
        System.out.println("\033[31;4m" + "视频已经是 快速播放状态" + "\033[0m");

    }

    @Override
    public void stop() {
        super.videoContext.setVideoState(new StopState());
        System.out.println("视频已从 快速播放状态 转换为了 停止状态");

    }

}
