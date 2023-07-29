package org.gfg;

public class Teacher extends Person{

    public String course;
    public Teacher(String name, int age) {
        super(name, age);
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void teaching(){
        System.out.println(getName()+" is teaching "+course);
    }
}
