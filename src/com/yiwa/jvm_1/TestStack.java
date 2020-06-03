package com.yiwa.jvm_1;

import java.lang.String;

public class TestStack {

    private String name;
    private int age;
    static int a=5;

    public TestStack() {
    }

    public TestStack(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        int i=2;
        int j=3;
        int k=i+j;
        System.out.println(a);
        System.out.println(TestStack.class.getClassLoader());
        System.out.println(TestStack.class.getClassLoader().getParent());
        System.out.println(TestStack.class.getClassLoader().getParent().getParent());
        System.out.println(Thread.currentThread().getContextClassLoader());
    }
}
