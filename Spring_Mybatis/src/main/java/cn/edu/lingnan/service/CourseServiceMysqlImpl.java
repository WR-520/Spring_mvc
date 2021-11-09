package cn.edu.lingnan.service;

import cn.edu.lingnan.mapper.CourseMapper;
import cn.edu.lingnan.mapper.ScoreMapper;
import cn.edu.lingnan.mapper.StudentMapper;
import cn.edu.lingnan.pojo.Course;
import cn.edu.lingnan.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseServiceMysqlImpl implements CourseService {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    StudentMapper studentMapper = applicationContext.getBean("studentMapper", StudentMapper.class);
    CourseMapper courseMapper = applicationContext.getBean("courseMapper",CourseMapper.class);
    ScoreMapper scoreMapper = applicationContext.getBean("scoreMapper", ScoreMapper.class);
    @Override
    public List<Course> findAllCourses() {
        return courseMapper.findAllCourses();
    }

    @Override
    public Course findCourseById(String cid) {
        return courseMapper.findCourseById(cid);
    }

    @Override
    public int insertCourse(Course course) {
        return courseMapper.insertCourse(course);
    }

    @Override
    public int updateCourse(Map map) {
        return courseMapper.updateCourse(map);
    }

    @Override
    public int deleteCourse(String cid) {

        return courseMapper.deleteCourse(cid);
    }

}
