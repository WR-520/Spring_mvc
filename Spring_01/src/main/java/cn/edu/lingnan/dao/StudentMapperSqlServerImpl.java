package cn.edu.lingnan.dao;

public class StudentMapperSqlServerImpl implements StudentMapper{
    @Override
    public void findAllStudent(){
        System.out.println("返回SqlServer数据库中所有学生记录");
    }

    @Override
    public void addAStudent() {
        System.out.println("Sql:增加一个学生");
    }

    @Override
    public void deleteAStudent() {
        System.out.println("Sql:删除一个学生");
    }

    @Override
    public void modifyStudent() {
        System.out.println("Sql:修改一个学生");
    }
}
