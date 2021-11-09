package cn.edu.lingnan.service;

import cn.edu.lingnan.pojo.course;
import cn.edu.lingnan.dao.CourseMapper;
import cn.edu.lingnan.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import java.util.List;
import java.util.Map;

public class CourseServiceMysqlImpl implements CourseService{
    @Override
    public List<course> findAllCourses() {
        List<course> v = null;
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        v = courseMapper.findAllCourses();
        return v;
    }

    @Override
    public course findCourseById(String cid) {
        course course = null;
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        course = courseMapper.findCourseById(cid);
        return course;
    }

    @Override
    public int insertCourse(course course) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        int i  = courseMapper.insertCourse(course);
        sqlSession.commit();
        return i;
    }

    @Override
    public int updateCourse(Map map) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        int i = courseMapper.updateCourse(map);
        sqlSession.commit();
        return i;
    }

    @Override
    public int deleteCourse(String cid) {
       SqlSession sqlSession  = MybatisUtil.getSqlSession();
       CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
       int i = courseMapper.deleteCourse(cid);
       sqlSession.commit();
       return i;
    }


}
