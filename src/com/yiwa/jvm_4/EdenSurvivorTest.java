package com.yiwa.jvm_4;

/**
 * -Xms600m -Xmx600m
 * -NewRatio: 设置新生代和老年代比例情况 默认1:2
 * -SurvivorRatio: 设置新生代中Eden和Survivor区的比例 默认是8:1
 * -Xmn设置新生代空间大小
 */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("我只来打个酱油");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
