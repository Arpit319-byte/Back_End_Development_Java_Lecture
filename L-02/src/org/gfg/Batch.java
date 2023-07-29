package org.gfg;
import java.util.ArrayList;
import java.util.List;

public class Batch {

    private String name;
    private Teacher mentor;
    private List<Student> studentlist;
    private List<Lecture> lecturelist;

    public Batch() {
        studentlist=new ArrayList<>();
        lecturelist=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getMentor() {
        return mentor;
    }

    public void setMentor(Teacher mentor) {
        this.mentor = mentor;
    }

    public List<Student> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(List<Student> studentlist) {
        this.studentlist = studentlist;
    }

    public List<Lecture> getLecturelist() {
        return lecturelist;
    }

    public void setLecturelist(List<Lecture> lecturelist) {
        this.lecturelist = lecturelist;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "name='" + name + '\'' +
                ", mentor=" + mentor +
                ", studentlist=" + studentlist +
                ", lecturelist=" + lecturelist +
                '}';
    }
}
