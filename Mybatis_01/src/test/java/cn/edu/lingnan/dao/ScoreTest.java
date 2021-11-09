package cn.edu.lingnan.dao;
import cn.edu.lingnan.pojo.score;
import cn.edu.lingnan.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ScoreTest {
    @Test
    public void insertScore() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ScoreMapper ScoreMapper = sqlSession.getMapper(ScoreMapper.class);
        HashMap<String,Object> hm = new HashMap<String,Object>();
        hm.put("cid","c05");
        hm.put("sid","s01");
        hm.put("score",85);
        int i = ScoreMapper. insertScore(hm);
        System.out.println(i);
    }
   @Test
    public void findScoresUseIf(){
      SqlSession sqlSession = MybatisUtil.getSqlSession();
      ScoreMapper ScoreMapper = sqlSession.getMapper(ScoreMapper.class);
      HashMap<String,Object> hm = new HashMap<>();
      hm.put("cid","c04");
      hm.put("sid","s05");
      List<score> list = ScoreMapper.findScoresUseIf(hm);
      for (score score : list) {
          System.out.println(score.toString());
      }
  }
    @Test
    public void deleteScoreBySidAndCid(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ScoreMapper ScoreMapper = sqlSession.getMapper(ScoreMapper.class);
        HashMap<String,Object> hm = new HashMap<>();
        hm.put("cid","c04");
        hm.put("sid","s05");
        int i = ScoreMapper.deleteScoreBySidAndCid(hm);
        System.out.println(i);

    }

      @Test
     public void updateScore(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ScoreMapper ScoreMapper = sqlSession.getMapper(ScoreMapper.class);
        HashMap<String,Object> hm = new HashMap<>();
        hm.put("cid","s05");
        hm.put("sid","c04");
        hm.put("score",94);;
        ScoreMapper.updateScore(hm);

    }


}
