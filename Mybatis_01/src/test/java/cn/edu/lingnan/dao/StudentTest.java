package cn.edu.lingnan.dao;

import cn.edu.lingnan.pojo.student;
import cn.edu.lingnan.service.StudentService;
import cn.edu.lingnan.service.StudentServiceMysqlImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentTest{

        @Test
        public void findAllStudent() throws IOException {
            StudentService studentService = new StudentServiceMysqlImpl();
            List<student> students = studentService.findAllStudent();
            for (cn.edu.lingnan.pojo.student student : students)
                System.out.println(student.getSid()+"  "+student.getSname()+
                        "  "+student.getPassword()+"  "+student.getSuperuser());
        }
    @Test
    public void findStudentById() {
        StudentService studentService = new StudentServiceMysqlImpl();
        student student = studentService.findStudentById("s01");
        System.out.println(student.toString());
    }
    @Test
    public void findStudentByNameUseLike() {
        StudentService studentService = new StudentServiceMysqlImpl();
        List<student> students   = null;
        students = studentService.findStudentByNameUseLike("A");
        for (cn.edu.lingnan.pojo.student student : students)
            System.out.println(student.getSid()+"  "+student.getSname()+
                    "  "+student.getPassword()+"  "+student.getSuperuser());
    }
    @Test
    public void insertStudent() {
        StudentService studentService = new StudentServiceMysqlImpl();
        student student = new student("s33","李四","123",0);
        int i = studentService.insertStudent(student);
        System.out.println("插入多少行记录"+ i);
    }
    @Test
    public void updateStudent(){
          StudentService studentService = new StudentServiceMysqlImpl();
          student student = new student("s20","小明","123",1);
          int i = studentService.updateStudent(student);
          System.out.println(i);
    }
    @Test
    public void updateStudentPassword(){
        StudentService studentService = new StudentServiceMysqlImpl();
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("password","1234");
        hashMap.put("sid","s01");
        int i = studentService.updateStudentPassword(hashMap);
        System.out.println(i);
    }
    @Test
    public void deleteStudent(){
        StudentService studentService = new StudentServiceMysqlImpl();
        int i = studentService.deleteStudent("s04");
        System.out.println(i);
    }
    @Test
    public void findStudentUseIf(){
        StudentService studentService = new StudentServiceMysqlImpl();
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("password","578");
        List<student> students = studentService.findStudentUseIf(hashMap);
        for (student student : students) {
            System.out.println(student.toString());
        }
    }
    @Test
    public void updateStudentUseSet(){
      HashMap<String,Object> hashMap = new HashMap<>();
      hashMap.put("sname","lisi");
      hashMap.put("password","1234567");
      hashMap.put("sid","s01");
      StudentService studentService = new StudentServiceMysqlImpl();
      int i = studentService.updateStudentUseSet(hashMap);
        System.out.println(i);
    }
    @Test
    public void findStudentByNameAndPassword(){
           HashMap<String,Object> hashMap = new HashMap<>();
           hashMap.put("sname","lisi");
           hashMap.put("password","1234567");
           StudentService studentService = new StudentServiceMysqlImpl();
           student s = studentService.findStudentByNameAndPassword(hashMap);
           System.out.println(s.toString());
    }
    @Test
    public void findStudentUseForeach(){
            HashMap<String,Object> hashMap = new HashMap<>();
           ArrayList<String>  arrayList = new ArrayList<>();
           arrayList.add("s01");
           arrayList.add("s04");
           arrayList.add("s05");
           hashMap.put("sids",arrayList);
           StudentService studentService = new StudentServiceMysqlImpl();
           List<student> studentUseForeach =  studentService.findStudentUseForeach(hashMap);
           for(student s: studentUseForeach){
               s.toString();
           }
        }
}
