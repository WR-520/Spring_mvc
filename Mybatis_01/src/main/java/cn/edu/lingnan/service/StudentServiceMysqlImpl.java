package cn.edu.lingnan.service;
import cn.edu.lingnan.dao.StudentMapper;
import cn.edu.lingnan.pojo.student;
import cn.edu.lingnan.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class StudentServiceMysqlImpl implements  StudentService {
    @Override
    public Vector<student> findAllStudent() {
        Vector<student> v = null;
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        v = studentMapper.findAllStudent();
        return v;
    }

    @Override
    public student findStudentById(String sid) {
     student stu = null;
     SqlSession sqlSession = MybatisUtil.getSqlSession();
     StudentMapper studentMapper =  sqlSession.getMapper(StudentMapper.class);
     stu = studentMapper.findStudentById(sid);
     return stu;
    }

    @Override
    public List<student> findStudentByNameUseLike(String sname) {
        List<student> students = null;
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        students = studentMapper.findStudentByNameUseLike(sname);
        return students;
    }

    @Override
    public int insertStudent(student student) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        int i  = studentMapper.insertStudent(student);
        sqlSession.commit();
        return i;
    }

    @Override
    public int updateStudent(student student) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        int i = studentMapper.updateStudent(student);
        sqlSession.commit();
        return i;
    }

    @Override
    public int updateStudentPassword(Map map) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        int i = studentMapper.updateStudentPassword(map);
        sqlSession.commit();
        return i;
    }

     @Override
    public int deleteStudent(String sid){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        int i = studentMapper.deleteStudentById(sid);
        sqlSession.commit();
        return i;
     }

    @Override
    public List<student> findStudentUseIf(Map map) {
        List<student> list = null;
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        list = studentMapper.findStudentUseIf(map);
        return list;
    }

    @Override
    public int updateStudentUseSet(Map map) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        int i = studentMapper.updateStudentUseSet(map);
        sqlSession.commit();
        return i;
    }

    @Override
    public student findStudentByNameAndPassword(Map map) {
        SqlSession sqlSession  = MybatisUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        student s = studentMapper.findStudentByNameAndPassword(map);
        return s;
    }

    @Override
    public List<student> findStudentUseForeach(Map map) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        return studentMapper.findStudentUseForeach(map);
    }


}
