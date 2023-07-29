package org.gfg;

public class InheritanceDemo {

    public static void main(String[] args) {

        Object obj =new Object();
        Lecture lect=new Lecture();

        Lecture lect1=lect;
        Lecture lect2=lect;

        System.out.println(lect1.equals(lect2));

        Person person=new Person("Shashi",30);
        person.walking();

        Person student=new Student();
        student.setName("Arpit Chauhan");
        student.setAge(23);

        student.walking();

        Teacher teacher=new Teacher("Shanu Chauhan",23);
        teacher.setCourse("Java");
        teacher.walking();
        teacher.teaching();

    }
}
