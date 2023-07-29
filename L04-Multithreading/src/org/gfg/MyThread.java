package org.gfg;

import java.util.Scanner;

public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Hello from MyThread-> "+Thread.currentThread().getName());

        System.out.println("Enter your name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Hello "+name+"->"+Thread.currentThread().getName());


    }
}
