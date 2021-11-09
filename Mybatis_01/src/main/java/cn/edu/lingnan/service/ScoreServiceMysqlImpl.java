package cn.edu.lingnan.service;

import cn.edu.lingnan.dao.ScoreMapper;
import cn.edu.lingnan.pojo.score;
import cn.edu.lingnan.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class ScoreServiceMysqlImpl implements ScoreService {


    @Override
    public List<score> findScoresUseIf(Map map) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ScoreMapper ScoreMapper =  sqlSession.getMapper(ScoreMapper.class);
        List<score> scores = ScoreMapper.findScoresUseIf(map);

        return scores;
    }

    @Override
    public int insertScore(Map map) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ScoreMapper ScoreMapper =  sqlSession.getMapper(ScoreMapper.class);
        int i = ScoreMapper.insertScore(map);
        sqlSession.commit();
        return i;
    }

    @Override
    public int deleteScoreBySidAndCid(Map map) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ScoreMapper ScoreMapper =  sqlSession.getMapper(ScoreMapper.class);
        int i = ScoreMapper.deleteScoreBySidAndCid(map);
        return i;
    }

    @Override
    public int updateScore(Map map) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        ScoreMapper ScoreMapper =  sqlSession.getMapper(ScoreMapper.class);
        int i = ScoreMapper.updateScore(map);
        return i;
    }


}
