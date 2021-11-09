package cn.edu.lingnan.mapper;

import cn.edu.lingnan.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
//    查询所有学生
   public List<Student> selectAllStudent();
   //   删除对应学号的学生记录
   public void deleteStudentBySid(String sid);

   public List<Student> findStudentById(String sid);
   //    按姓名模糊查询
   public List<Student> findStudentByNameUseLike(String sname);

   //    插入学生记录
   public int insertStudent(Student student);

   //    更新一条学生记录
   public int updateStudent(Student student);

   //    修改学生密码
   public int updateStudentPassword(Map map);

   //    动态sql查询
   public List<Student> findStudentUseIf(Map map);
   //     动态SQL更新，使用set元素、
   public int updateStudentUseSet(Map map);
   public Student findStudentByNameAndPassword(Map map);
   public List<Student> findStudentUseForeach(Map map);
}
