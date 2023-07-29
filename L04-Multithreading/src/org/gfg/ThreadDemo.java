package org.gfg;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello there-> "+Thread.currentThread().getName());

        MyThread thread=new MyThread();
        thread.setName("Thread-0");
        thread.start();

        MyThread thread1=new MyThread();
        thread1.setName("Thread-1");
        thread1.start();


        thread.join();


        System.out.println("Done");


    }
}
