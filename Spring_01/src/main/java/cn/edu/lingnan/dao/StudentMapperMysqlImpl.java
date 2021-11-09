package cn.edu.lingnan.dao;

public class StudentMapperMysqlImpl implements StudentMapper{

    @Override
    public void findAllStudent() {
        System.out.println("返回mysql数据库中的所有学生记录");
    }

    @Override
    public void addAStudent() {
        System.out.println("mysql:增加一个学生");
    }

    @Override
    public void deleteAStudent() {
        System.out.println("mysql:删除一个学生");
    }

    @Override
    public void modifyStudent() {
        System.out.println("mysql:修改一个学生");
    }
}
