package com.yiwa.jvm_4;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**  堆内存 包括 ：年轻代 老年代 元空间
 * 1设置堆空间大小参数
 * -Xms设置堆空间初始内存（年轻代+老年代）
 * -Xmx设置堆空间最大内存（年轻代+老年代）
 * 2 默认堆空间大小
 *   初始内存大小：物理电脑内存大小/64
 *     最大内存大小：物理电脑内存大小/4
 * 3.手动设置： -Xms   -Xmx
 *  开发中建议将初始内存和最大内存设置为相同的值
 *
 *  4 查看设置参数：方式一 ： jps jstat -gc 进程id
 *                  方式二： -XX:PrintGCDetails
 */
public class HeapSpaceInitial {
    public static void main(String[] args) {
        //返回java虚拟机中堆内存总量
        long initialMemory=Runtime.getRuntime().totalMemory()/1024/1024;
        //返回java虚拟机视试图使用的最大内存总量
        long maxMemory=Runtime.getRuntime().maxMemory()/1024/1024;
        System.out.println("-Xms: "+initialMemory+" M");
        System.out.println("-Xmx: "+maxMemory+" M");

        System.out.println("系统内存的大小： "+initialMemory*64.0/1024+" G");
        System.out.println("系统内存的大小： "+maxMemory*4.0/1024+" G");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
