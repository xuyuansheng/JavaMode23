package com.immoc.adapter;

/**
 *
 * @author xu
 * @date 2017/9/9
 */
public class NoteBook {

    private ThreePlugInterface plugInterface;

    public NoteBook(ThreePlugInterface plugInterface) {
        this.plugInterface = plugInterface;
    }

    /** 使用插座供电 */
    public void charge() {
        System.out.println("笔记本充电:(需要三相插座)");
        plugInterface.powerWithThree();
    }

    public static void main(String[] args) {

        //笔记本需要的是三相接口  现有的只有二相接口实现类
        //已有的二相插座
        TwoPlugInterface two = new GbTwoPlug();
        //通过适配器  把已有二相插座(two)转换为三相插座(twoPlugAdapter)
        TwoPlugAdapter twoPlugAdapter = new TwoPlugAdapter(two);
        //需要三相插座
        NoteBook noteBook = new NoteBook(twoPlugAdapter);
        noteBook.charge();

        System.out.println("************************分割线***************************");

        TwoPlugAdapterExtends  twoPlugAdapterExtends= new TwoPlugAdapterExtends();
        noteBook = new NoteBook(twoPlugAdapterExtends);
        noteBook.charge();
    }

}
