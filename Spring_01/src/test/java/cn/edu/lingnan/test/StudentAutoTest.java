package cn.edu.lingnan.test;
import cn.edu.lingnan.auto.Education;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentAutoTest {

      @Test
      public void studentauto(){
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
        Education education = applicationContext.getBean("education", Education.class);
        System.out.println(education.toString());
        education.getTeacher().doSomething();
        education.getStudent().doSomething();
    }
}
