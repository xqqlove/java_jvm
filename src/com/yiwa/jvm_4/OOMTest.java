package com.yiwa.jvm_4;

import java.util.ArrayList;
import java.util.Random;

public class OOMTest {
    public static void main(String[] args) {
        ArrayList<Pictrue> list=new ArrayList<>();
        while (true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Pictrue(new Random().nextInt(1024*1024)));
        }
    }

}
class Pictrue{
    private byte[]  pixels;
    public Pictrue(int length){
        this.pixels=new byte[length];
    }
}
