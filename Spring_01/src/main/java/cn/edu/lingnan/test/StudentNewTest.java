package cn.edu.lingnan.test;

import cn.edu.lingnan.pojo2.StudentNew;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentNewTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentNew studentnew = applicationContext.getBean("studentnew",StudentNew.class);
        System.out.println(studentnew.toString());

    }
}
