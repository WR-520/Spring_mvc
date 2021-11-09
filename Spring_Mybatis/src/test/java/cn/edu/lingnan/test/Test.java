package cn.edu.lingnan.test;
import cn.edu.lingnan.pojo.Student;
import cn.edu.lingnan.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.HashMap;
import java.util.Map;

public class Test {
     @org.junit.Test
     public void StudentTest(){
         System.out.println("---");
     ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//     StudentService studentService =   applicationContext.getBean("studentService", StudentService.class);
     //      增
//     studentService.insertStudent(new Student("s01","王五","123",0));
     //     删
//     studentService.deleteStudentBySid("s02");
//     查
//     studentService.findStudentById("s01");
//     改
//        Map map  = new HashMap();
//        map.put("sid","s02");
//        map.put("sname","小陆");
//        studentService.updateStudentUseSet(map);

    }
}
