package cn.edu.lingnan.service;

import cn.edu.lingnan.pojo.Score;

import java.util.List;
import java.util.Map;

public interface ScoreService {
    //    按学号查询该学生选修了几门课，返回课程号
    public List<String> selectCidFromScoreBySid(String sid);
    //    按课程号查询该课程有几个学生选修，返回对应课程号的选课人数
    public int selectNumberFromScoreByCid(String cid);
    //    按学号删除该学生的所有分数
    public void deleteScoreBySid(String sid);
    //  动态sql的查询例子 查成绩
    public List<Score> findScoresUseIf(Map map);

    //  增加一个成绩记录
    public int insertScore(Map map);

    //  删除一个成绩记录
    public int deleteScoreBySidAndCid(Map map);

    //   修改一个成绩记录
    public int updateScore(Map map);

}
