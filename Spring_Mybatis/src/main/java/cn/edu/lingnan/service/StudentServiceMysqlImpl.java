package cn.edu.lingnan.service;

import cn.edu.lingnan.mapper.CourseMapper;
import cn.edu.lingnan.mapper.ScoreMapper;
import cn.edu.lingnan.mapper.StudentMapper;
import cn.edu.lingnan.pojo.Score;
import cn.edu.lingnan.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentServiceMysqlImpl implements StudentService{
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    StudentMapper studentMapper = applicationContext.getBean("studentMapper", StudentMapper.class);
    CourseMapper courseMapper = applicationContext.getBean("courseMapper",CourseMapper.class);
    ScoreMapper  scoreMapper = applicationContext.getBean("scoreMapper", ScoreMapper.class);

    @Override
    public void deleteStudentBySid(String sid) {
     //     查找要删除的那些课程号
        List<String> list = scoreMapper.selectCidFromScoreBySid(sid);
        List<String> list1 = new ArrayList<>();
        for (String cid : list) {
          if( scoreMapper.selectNumberFromScoreByCid(cid) == 1){
              list1.add(cid);
          }
        }
//        删除
        scoreMapper.deleteScoreBySid(sid);
        studentMapper.deleteStudentBySid(sid);
        for (String cid : list1) {
            courseMapper.deleteCourse(cid);
        }
    }

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }

    @Override
    public List<Student> findStudentById(String sid) {
        return studentMapper.findStudentById(sid);
    }

    @Override
    public List<Student> findStudentByNameUseLike(String sname) {
        return studentMapper.findStudentByNameUseLike(sname);
    }

    @Override
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public int updateStudentPassword(Map map) {
        return studentMapper.updateStudentPassword(map);
    }

    @Override
    public List<Student> findStudentUseIf(Map map) {
        return studentMapper.findStudentUseIf(map);
    }

    @Override
    public int updateStudentUseSet(Map map) {
        return studentMapper.updateStudentUseSet(map);
    }

    @Override
    public Student findStudentByNameAndPassword(Map map) {
        return studentMapper.findStudentByNameAndPassword(map);
    }

    @Override
    public List<Student> findStudentUseForeach(Map map) {
        return studentMapper.findStudentUseForeach(map);
    }

}
