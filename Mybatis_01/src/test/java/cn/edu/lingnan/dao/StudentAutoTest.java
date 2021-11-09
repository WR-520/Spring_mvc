package cn.edu.lingnan.dao;

import cn.edu.lingnan.service.StudentAutoServiceMysqlImpl;
import cn.edu.lingnan.pojo.StudentAuto;
import cn.edu.lingnan.service.StudentAutoService;
import org.junit.Test;

public class StudentAutoTest {
    @Test
    public void insertStudent() {
        StudentAutoService studentAutoService = new StudentAutoServiceMysqlImpl();
        StudentAuto student = new StudentAuto(1,"李四","123",0);
        int i = studentAutoService.insertStudent(student);
        System.out.println("插入多少行记录"+ i);
    }
}
