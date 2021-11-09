package cn.edu.lingnan.dao;

// 静态代理
public class StudentMapperProxy implements StudentMapper {
    StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper){
        this.studentMapper = studentMapper;
    }

    @Override
    public void findAllStudent() {
        log(Thread.currentThread().getStackTrace()[1].getMethodName());
        studentMapper.findAllStudent();
    }

    @Override
    public void findStudentByName() {
        log(Thread.currentThread().getStackTrace()[1].getMethodName());
       studentMapper.findStudentByName();
    }

    //    提取公共的操作，例如增加一个日志方法
    void log(String string){
        System.out.println("[Debug]:执行了" +string+"方法......");
    }
}
