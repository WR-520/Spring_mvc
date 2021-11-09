package cn.edu.lingnan.dao;

import cn.edu.lingnan.pojo.score;

import java.util.List;
import java.util.Map;

public interface ScoreMapper {
//  动态sql的查询例子 查成绩
   public List<score> findScoresUseIf(Map map);

//  增加一个成绩记录
    public int insertScore(Map map);

//  删除一个成绩记录
    public int deleteScoreBySidAndCid(Map map);

    //   修改一个成绩记录
    public int updateScore(Map map);

}
