package cn.edu.lingnan.service;

import cn.edu.lingnan.pojo.Course;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface CourseService {
    public List<Course> findAllCourses();
    public Course findCourseById(String cid);
    //   插入课程记录
    public int insertCourse(Course course);
    //   根据更新ID课程信息
    public int updateCourse(Map map);
    //   删除一条课程记录
    public int deleteCourse(String cid);
}
