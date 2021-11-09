package cn.edu.lingnan.service;

import cn.edu.lingnan.dao.StudentMapper;

public class StudentServiceImpl implements StudentService {

    private StudentMapper studentMapper ;

    public StudentMapper getStudentMapper(){
        return studentMapper;
    }
    public void setStudentMapper(StudentMapper studentMapper){
        this.studentMapper = studentMapper;
    }

    @Override
    public void findAllStudent() {

       studentMapper.findAllStudent();

    }

    @Override
    public void addAStudent() {
        studentMapper.addAStudent();
    }

    @Override
    public void deleteAStudent() {
        studentMapper.deleteAStudent();
    }

    @Override
    public void modifyStudent() {
        studentMapper.modifyStudent();
    }
}
