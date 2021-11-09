package cn.edu.lingnan.mapper;

import cn.edu.lingnan.pojo.Score;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

public class ScoreMapperMysqlImpl extends SqlSessionDaoSupport implements  ScoreMapper{


    @Override
    public List<String> selectCidFromScoreBySid(String sid) {
        return getSqlSession().getMapper(ScoreMapper.class).selectCidFromScoreBySid(sid);
    }

    @Override
    public int selectNumberFromScoreByCid(String cid) {
        return getSqlSession().getMapper(ScoreMapper.class).selectNumberFromScoreByCid(cid);
    }

    @Override
    public void deleteScoreBySid(String sid) {
        getSqlSession().getMapper(ScoreMapper.class).deleteScoreBySid(sid);
    }

    @Override
    public List<Score> findScoresUseIf(Map map) {
        return getSqlSession().getMapper(ScoreMapper.class).findScoresUseIf(map);
    }

    @Override
    public int insertScore(Map map) {
        return getSqlSession().getMapper(ScoreMapper.class).insertScore(map);
    }

    @Override
    public int deleteScoreBySidAndCid(Map map) {
        return 0;
    }

    @Override
    public int updateScore(Map map) {
        return 0;
    }
}
