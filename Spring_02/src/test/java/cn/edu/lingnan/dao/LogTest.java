package cn.edu.lingnan.dao;

import cn.edu.lingnan.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LogTest {
   public static void main(String []args){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
       studentService.query();
       studentService.delete();
   }
}
