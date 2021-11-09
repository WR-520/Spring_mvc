package cn.edu.lingnan.test;


import cn.edu.lingnan.dao.CourseMapper;
import cn.edu.lingnan.pojo2.StudentNew;
import cn.edu.lingnan.service.CourseService;
import cn.edu.lingnan.service.ScoreService;
import cn.edu.lingnan.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void studentTest() {
        StudentService studentService =  applicationContext.getBean("StudentServiceImpl",StudentService.class);
        studentService.modifyStudent();
        studentService.findAllStudent();
        studentService.deleteAStudent();
        studentService.addAStudent();
    }

    @Test
    public void courseTest(){
        CourseService courseService = applicationContext.getBean("CourseServiceImpl",CourseService.class);
        courseService.modifyCourse();
        courseService.addACourse();
        courseService.deleteACourse();
        courseService.findAllCourse();
    }
    @Test
    public void scoreTest(){
        ScoreService scoreService = applicationContext.getBean("ScoreServiceImpl",ScoreService.class);
        scoreService.modifyScore();
        scoreService.deleteAScore();
        scoreService.findAllScore();
        scoreService.addAScore();
    }

}
