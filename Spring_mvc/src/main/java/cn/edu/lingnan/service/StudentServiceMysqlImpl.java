package cn.edu.lingnan.service;

public class StudentServiceMysqlImpl implements  StudentService{
    @Override
    public String getStudentName(){
//           这里原应调用Dao层 访问数据库 然后返回学生姓名
        return "zhangsan";
    }

}
