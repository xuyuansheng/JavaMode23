package com.immoc.state;

/**
 * 视频状态
 *
 * @author Mr.Xu
 * @date 2020/5/12 22:41
 */
public abstract class VideoState {

    protected VideoContext videoContext;

    public void setVideoContext(VideoContext videoContext) {
        this.videoContext = videoContext;
    }

    /**
     * 将 当前状态 转换为 播放状态
     */
    public abstract void play();

    /**
     * 将 当前状态 转换为 暂停状态
     */
    public abstract void pause();

    /**
     * 将 当前状态 转换为 快速播放状态
     */
    public abstract void speed();

    /**
     * 将 当前状态 转换为 停止状态
     */
    public abstract void stop();

}
