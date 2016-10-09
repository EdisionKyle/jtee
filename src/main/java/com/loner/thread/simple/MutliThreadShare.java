package com.loner.thread.simple;
/*实现Runnable接口相对于扩展Thread类来说，具有无可比拟的优势。这种方式不仅有利于程序的健壮性，
 * 使代码能够被多个线程共享，而且代码和数据资源相对独立，从而特别适合多个具有相同代码的线程去
 * 处理同一资源的情况。这样一来，线程、代码和数据资源三者有效分离，很好地体现了面向对象程序
 * 设计的思想。因此，几乎所有的多线程程序都是通过实现Runnable接口的方式来完成的。
 * 
 * 适合多个相同的程序代码的线程去处理同一个资源
 * 可以避免java中的单继承的限制
 * 增加程序的健壮性，代码可以被多个线程共享，代码和数据独立。
 * 
 * 在java中，每次程序运行至少启动2个线程。一个是main线程，一个是垃圾收集线程。
 * 因为每当使用java命令执行一个类的时候，实际上都会启动一个JVM，每一个JVM实习在就是在操作系统中启动了一个进程。
 * */
public class MutliThreadShare {
    public static void main(String [] args){
    	MutliThread2 m=new MutliThread2();
        Thread t1=new Thread(m,"Window 1");
        Thread t2=new Thread(m,"Window 2");
        Thread t3=new Thread(m,"Window 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class MutliThread2 implements Runnable{
    private int ticket=100;//每个线程都拥有100张票
    public void run(){
        while(ticket>0){
            System.out.println(ticket--+" is saled by "+Thread.currentThread().getName());
        }
    }
}