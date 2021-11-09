package cn.edu.lingnan.service;

import cn.edu.lingnan.pojo.course;

import java.util.List;
import java.util.Map;

public interface CourseService {
//   查找所有的课程
   List<course> findAllCourses();
//   根据ID查找课程
   course findCourseById(String cid);
//   插入课程记录
   public int insertCourse(course course);
//   根据更新课程信息
   public int updateCourse(Map map);
//   删除一条课程记录
   public int deleteCourse(String cid);

}
