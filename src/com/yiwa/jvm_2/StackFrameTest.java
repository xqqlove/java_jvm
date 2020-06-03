package com.yiwa.jvm_2;

public class StackFrameTest {
    public static void main(String[] args) {
        try {
            System.out.println("start main()......");
            StackFrameTest s=new StackFrameTest();
            s.method1();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("stop main().......");
        }
    }

    public void method1() {
        System.out.println("start method1()....");
        method2();
        System.out.println("stop method1.......");
    }

    public void method2() {
        System.out.println("start method2().....");
        method3();
        System.out.println("stop method2().......");
    }

    public void method3() {
        System.out.println("start method3().......");
         int i=10/0;
        System.out.println("stop method3().....");
    }


}
