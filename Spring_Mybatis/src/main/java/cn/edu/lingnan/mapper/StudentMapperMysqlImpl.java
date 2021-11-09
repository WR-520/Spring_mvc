package cn.edu.lingnan.mapper;

import cn.edu.lingnan.pojo.Student;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

public class StudentMapperMysqlImpl extends SqlSessionDaoSupport implements StudentMapper {
//   第一种实现方式
//    private SqlSessionTemplate sqlSessionTemplate;
//    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate){
//        this.sqlSessionTemplate =  sqlSessionTemplate;
//    }
//
//    @Override
//    public List<Student> selectAllStudent() {
//        StudentMapper studentMapper = sqlSessionTemplate.getMapper(StudentMapper.class);
//
//        return    studentMapper.selectAllStudent();
//    }
//    第二种实现方式
    @Override
    public List<Student> selectAllStudent(){
      return  getSqlSession().getMapper(StudentMapper.class).selectAllStudent();
    }

    @Override
    public void deleteStudentBySid(String sid) {
     getSqlSession().getMapper(StudentMapper.class).deleteStudentBySid(sid);
  }

    @Override
    public List<Student> findStudentById(String sid) {
        return getSqlSession().getMapper(StudentMapper.class).findStudentById(sid);
    }

    @Override
    public List<Student> findStudentByNameUseLike(String sname) {
        return getSqlSession().getMapper(StudentMapper.class).findStudentByNameUseLike(sname);
    }

    @Override
    public int insertStudent(Student student) {
        return getSqlSession().getMapper(StudentMapper.class).insertStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return getSqlSession().getMapper(StudentMapper.class).updateStudent(student);
    }

    @Override
    public int updateStudentPassword(Map map) {
        return 0;
    }

    @Override
    public List<Student> findStudentUseIf(Map map) {
        return null;
    }

    @Override
    public int updateStudentUseSet(Map map) {
        return 0;
    }

    @Override
    public Student findStudentByNameAndPassword(Map map) {
        return null;
    }

    @Override
    public List<Student> findStudentUseForeach(Map map) {
        return null;
    }
}
