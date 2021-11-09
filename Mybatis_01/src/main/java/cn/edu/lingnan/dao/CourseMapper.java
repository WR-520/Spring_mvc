package cn.edu.lingnan.dao;

import cn.edu.lingnan.pojo.course;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface CourseMapper {

    @Select("select * from school.course")
    public List<course> findAllCourses();

    @Select("select * from school.course where cid = #{ccid}")
    public course findCourseById(@Param("ccid") String cid);

    //   插入课程记录
    public int insertCourse(course course);
    //   根据更新ID课程信息
    public int updateCourse(Map map);
    //   删除一条课程记录
    public int deleteCourse(String cid);
}
