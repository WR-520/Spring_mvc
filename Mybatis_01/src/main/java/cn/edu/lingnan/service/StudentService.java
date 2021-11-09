package cn.edu.lingnan.service;

import cn.edu.lingnan.pojo.student;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public interface StudentService {
//  查找全部学生
   public Vector<student> findAllStudent() throws IOException;
//  按学号查找学生
   public student findStudentById(String sid);
//   按姓名模糊查询
   public List<student> findStudentByNameUseLike(String sname);
//   插入学生记录
   public int insertStudent(student student);
//   更新学生信息
   public int updateStudent(student student);
//   更新学生密码
   public int updateStudentPassword(Map map);
   // 删除一条学生记录
   public int deleteStudent(String sid);
//   动态sql
   public List<student> findStudentUseIf(Map map);
   public int updateStudentUseSet(Map map);
   public student findStudentByNameAndPassword(Map map);
   public List<student> findStudentUseForeach(Map map);
}
