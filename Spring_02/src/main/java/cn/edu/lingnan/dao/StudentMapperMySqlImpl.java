package cn.edu.lingnan.dao;


public class StudentMapperMySqlImpl implements StudentMapper {


    @Override
    public void findAllStudent() {
        System.out.println("返回Mysql数据库中的所有学生记录");
    }

    @Override
    public void findStudentByName() {
        System.out.println("返回Mysql数据库中一个对应的学生记录");
    }
}
