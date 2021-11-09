package cn.edu.lingnan.test;

import cn.edu.lingnan.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void test(){
//         获取spring上下文
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student student = applicationContext.getBean("s5",Student.class);
        Student student1 = applicationContext.getBean("s1",Student.class);
//        System.out.println(student == student1);
        System.out.println(student1.toString());
    }
}
