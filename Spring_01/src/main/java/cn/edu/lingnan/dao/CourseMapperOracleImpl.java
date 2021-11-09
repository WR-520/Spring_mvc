package cn.edu.lingnan.dao;

public class CourseMapperOracleImpl implements CourseMapper {
    @Override
    public void findAllCourse() {
        System.out.println("Oracle:返回所有课程");
    }

    @Override
    public void addACourse() {
        System.out.println("Oracle:添加一门课程");
    }

    @Override
    public void deleteACourse() {
        System.out.println("Oracle:删除一门课程");
    }

    @Override
    public void modifyCourse() {
        System.out.println("Oracle:修改课程");
    }
}
