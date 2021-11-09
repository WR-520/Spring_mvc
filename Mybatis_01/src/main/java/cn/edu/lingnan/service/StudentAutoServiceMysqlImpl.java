package cn.edu.lingnan.service;

import cn.edu.lingnan.dao.StudentAutoMapper;
import cn.edu.lingnan.pojo.StudentAuto;
import cn.edu.lingnan.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class StudentAutoServiceMysqlImpl implements StudentAutoService{
    @Override
    public int insertStudent(StudentAuto student) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentAutoMapper StudentAutoMapper = sqlSession.getMapper(StudentAutoMapper.class);
        int i  = StudentAutoMapper.insertStudent(student);
        sqlSession.commit();
        return i;
    }
}
