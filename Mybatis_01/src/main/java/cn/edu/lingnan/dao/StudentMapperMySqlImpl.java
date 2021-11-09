package cn.edu.lingnan.dao;

import cn.edu.lingnan.pojo.student;

import java.util.List;
import java.util.Map;
import java.util.Vector;

public class StudentMapperMySqlImpl implements StudentMapper {

    @Override
    public Vector<student> findAllStudent() {
        return null;
    }

    @Override
    public student findStudentById(String sid) {
        return null;
    }

    @Override
    public List<student> findStudentByNameUseLike(String sname) {
        return null;
    }

    @Override
    public int insertStudent(student student) {
        return 0;
    }

    @Override
    public int updateStudent(student student) {
        return 0;
    }

    @Override
    public int updateStudentPassword(Map map) {
        return 0;
    }

    @Override
    public int deleteStudentById(String sid) {
        return 0;
    }

    @Override
    public List<student> findStudentUseIf(Map map) {
        return null;
    }

    @Override
    public int updateStudentUseSet(Map map) {
        return 0;
    }

    @Override
    public student findStudentByNameAndPassword(Map map) {
        return null;
    }
   @Override
   public List<student> findStudentUseForeach(Map map){
        return null;
   }


}
