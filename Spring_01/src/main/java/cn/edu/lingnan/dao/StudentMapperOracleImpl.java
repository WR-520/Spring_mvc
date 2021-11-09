package cn.edu.lingnan.dao;

public class StudentMapperOracleImpl  implements StudentMapper{
    @Override
    public void findAllStudent(){
        System.out.println("返回Oracle数据库中所有学生记录");
    }

    @Override
    public void addAStudent() {
        System.out.println("Oracle:增加一个学生");
    }

    @Override
    public void deleteAStudent() {
        System.out.println("Oracle:删除一个学生");
    }

    @Override
    public void modifyStudent() {
        System.out.println("Oracle:修改一个学生");
    }
}
