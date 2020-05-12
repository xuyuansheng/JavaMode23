package com.immoc.state;

/**
 * 视频上下文
 *
 * @author Mr.Xu
 * @date 2020/5/12 22:41
 */
public class VideoContext {

    private VideoState videoState;

    public VideoContext(VideoState videoState) {
        this.videoState = videoState;
        this.videoState.setVideoContext(this);
    }

    public void setVideoState(VideoState videoState) {
        this.videoState = videoState;
        this.videoState.setVideoContext(this);
    }

    /**
     * 视频播放状态
     */
    public void play() {
        /*  将当前上下文的视频状态转换为播放状态 */
        this.videoState.play();
    }


    /**
     * 视频暂停状态
     */
    public void pause() {
        /*  将当前上下文的视频状态转换为暂停状态 */
        this.videoState.pause();
    }


    /**
     * 视频倍速播放状态
     */
    public void speed() {
        /*  将当前上下文的视频状态转换为倍速播放状态 */
        this.videoState.speed();
    }


    /**
     * 视频停止状态
     */
    public void stop() {
        /*  将当前上下文的视频状态转换为停止状态 */
        this.videoState.stop();
    }


}
