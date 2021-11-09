package cn.edu.lingnan.mapper;

import cn.edu.lingnan.pojo.Course;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

public class CourseMapperMysqlImpl extends SqlSessionDaoSupport implements CourseMapper {

    @Override
    public List<Course> findAllCourses() {
        return getSqlSession().getMapper(CourseMapper.class).findAllCourses();
    }

    @Override
    public Course findCourseById(String cid) {
        return getSqlSession().getMapper(CourseMapper.class).findCourseById(cid);
    }

    @Override
    public int insertCourse(Course course) {
        return getSqlSession().getMapper(CourseMapper.class).insertCourse(course);
    }

    @Override
    public int updateCourse(Map map) {
        return getSqlSession().getMapper(CourseMapper.class).updateCourse(map);
    }

    @Override
    public int deleteCourse(String cid) {
        return getSqlSession().getMapper(CourseMapper.class).deleteCourse(cid);
    }
}
