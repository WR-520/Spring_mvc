package cn.edu.lingnan.dao;

import cn.edu.lingnan.pojo.course;
import cn.edu.lingnan.service.CourseService;
import cn.edu.lingnan.service.CourseServiceMysqlImpl;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class CourseTest {
    @Test
    public void findAllCourses(){
        CourseServiceMysqlImpl courseServiceMysql = new CourseServiceMysqlImpl();
        List<course> allCourses = courseServiceMysql.findAllCourses();

        for(course course:allCourses){
            course.toString();
        }
    }
    @Test
    public void findCourseById(){
        CourseServiceMysqlImpl courseServiceMysql = new CourseServiceMysqlImpl();
        course c = courseServiceMysql.findCourseById("c05");
        System.out.println(c.toString());
    }
   @Test
    public void  insertCourse(){
       CourseServiceMysqlImpl courseServiceMysql = new CourseServiceMysqlImpl();
       course c = new course("c03","英语");
       int i =  courseServiceMysql.insertCourse(c);

       System.out.println(i);
    }
   @Test
    public void updateCourse(){
      CourseServiceMysqlImpl courseServiceMysql = new CourseServiceMysqlImpl();
      HashMap<String,Object> hashMap = new HashMap<>();
      hashMap.put("cid","c03");
      hashMap.put("cname","数学");
      CourseService courseService = new CourseServiceMysqlImpl();
      int i = courseService.updateCourse(hashMap);
       System.out.println(i);
   }
   @Test
    public void deleteCourse(){
     CourseServiceMysqlImpl courseServiceMysql = new CourseServiceMysqlImpl();
     int i = courseServiceMysql.deleteCourse("c03");
       System.out.println(i);
   }

}
