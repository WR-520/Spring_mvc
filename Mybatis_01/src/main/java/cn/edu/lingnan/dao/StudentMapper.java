package cn.edu.lingnan.dao;
import cn.edu.lingnan.pojo.student;
import java.util.List;
import java.util.Map;
import java.util.Vector;
// 原来的StudentDao类
public interface StudentMapper {
    //    查找全部学生
    public Vector<student> findAllStudent();

    //    按学号查找学生
    public student findStudentById(String sid);

    //    按姓名模糊查询
    public List<student> findStudentByNameUseLike(String sname);

    //    插入学生记录
    public int insertStudent(student student);

    //    更新一条学生记录
    public int updateStudent(student student);

    //    修改学生密码
    public int updateStudentPassword(Map map);

    //删除一条学生记录
    public int deleteStudentById(String sid);

    //    动态sql查询
    public List<student> findStudentUseIf(Map map);
//     动态SQL更新，使用set元素、
    public int updateStudentUseSet(Map map);
    public student findStudentByNameAndPassword(Map map);
    public List<student> findStudentUseForeach(Map map);
}