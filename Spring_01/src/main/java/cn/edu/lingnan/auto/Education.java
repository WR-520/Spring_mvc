package cn.edu.lingnan.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Education {

    @Autowired
    private Student student;
    @Autowired
    private Teacher teacher;

    public Education() {
    }

    public Education(Student student, Teacher teacher) {
        this.student = student;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Education{" +
                "student=" + student +
                ", teacher=" + teacher +
                '}';
    }

    public Student getStudent() {
        return student;
    }
    @Autowired
    public void setStudent(Student student) {
        this.student = student;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
