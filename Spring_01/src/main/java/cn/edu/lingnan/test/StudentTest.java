package cn.edu.lingnan.test;



import cn.edu.lingnan.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void test(){
//        Spring的上下文获取
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = applicationContext.getBean("s5", Student.class);
        Student s1 = applicationContext.getBean("s1",Student.class);
        System.out.println(student == s1);
        System.out.println(student.toString());
//        System.out.println(student.getAddress().toString());
    }
}
