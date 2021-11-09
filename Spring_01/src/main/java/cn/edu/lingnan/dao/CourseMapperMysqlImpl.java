package cn.edu.lingnan.dao;

import cn.edu.lingnan.service.CourseService;

public class CourseMapperMysqlImpl implements CourseMapper {

    @Override
    public void findAllCourse() {
        System.out.println("mysql:返回所有课程");
    }

    @Override
    public void addACourse() {
        System.out.println("添加一门课程");
    }

    @Override
    public void deleteACourse() {
        System.out.println("删除一门课程");
    }

    @Override
    public void modifyCourse() {
        System.out.println("修改课程");
    }
}
