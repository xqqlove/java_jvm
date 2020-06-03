package com.yiwa.jvm_2;

/**
 * 双亲委派机制优势
 *    避免类的重复加载
 *    保护程序安全，防止核心api被随意篡改
 */

public class TestClassLoader {


    public static void main(String[] args) {
        java.lang.String s = new java.lang.String();
        System.out.println("hello");
        TRY t=new TRY();
    }

}
