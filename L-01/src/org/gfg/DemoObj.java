package org.gfg;

import java.sql.SQLOutput;

public class DemoObj {

    public static void main(String[] args) {

        Lecture lecture1=new Lecture("L01","Arpit Chauhan","Live");
        Lecture lecture2=new Lecture("L02","Shanu Chauhan","Upcoming");
        System.out.println(lecture2);

        lecture2.setStatus("Live");

        System.out.println(lecture2);



    }
}
