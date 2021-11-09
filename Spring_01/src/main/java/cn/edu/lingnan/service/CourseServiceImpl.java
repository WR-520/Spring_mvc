package cn.edu.lingnan.service;

import cn.edu.lingnan.dao.CourseMapper;
import cn.edu.lingnan.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseServiceImpl implements CourseService {

    private CourseMapper courseMapper ;


    public CourseMapper getCourseMapper(){
        return courseMapper;
    }

    public void setCourseMapper(CourseMapper courseMapper){
        this.courseMapper = courseMapper;
    }

    @Override
    public void findAllCourse() {

        courseMapper.findAllCourse();

    }

    @Override
    public void addACourse() {
        courseMapper.addACourse();
    }

    @Override
    public void deleteACourse() {
        courseMapper.deleteACourse();
    }

    @Override
    public void modifyCourse() {
        courseMapper.modifyCourse();
    }
}
