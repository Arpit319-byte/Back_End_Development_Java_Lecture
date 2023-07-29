package org.gfg;

public class CompositionDemo {

    public static void main(String[] args) {

        Batch batch=new Batch();
        batch.setName("JBDL-46");

        Teacher teacher=new Teacher("Arpit",23);
        batch.setMentor(teacher);

        Student student=new Student();
        batch.getStudentlist().add(student);

        Lecture lecture=new Lecture("Java","Sashi","live");
        batch.getLecturelist().add(lecture);

        System.out.println(batch);

    }

}
