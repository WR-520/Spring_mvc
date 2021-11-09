package cn.edu.lingnan.dao;

public class CourseMapperSqlServerImpl implements  CourseMapper{
    @Override
    public void findAllCourse() {
        System.out.println("SqlServer:返回所有课程");
    }

    @Override
    public void addACourse() {
        System.out.println("SqlServer:添加一门课程");
    }

    @Override
    public void deleteACourse() {
        System.out.println("SqlServer:删除一门课程");
    }

    @Override
    public void modifyCourse() {
        System.out.println("SqlServer:修改课程");
    }
}
