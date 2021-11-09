package cn.edu.lingnan.service;

import cn.edu.lingnan.mapper.CourseMapper;
import cn.edu.lingnan.mapper.ScoreMapper;
import cn.edu.lingnan.mapper.StudentMapper;
import cn.edu.lingnan.pojo.Score;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class ScoreServiceMysqlImpl implements ScoreService {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    StudentMapper studentMapper = applicationContext.getBean("studentMapper", StudentMapper.class);
    CourseMapper courseMapper = applicationContext.getBean("courseMapper",CourseMapper.class);
    ScoreMapper scoreMapper = applicationContext.getBean("scoreMapper", ScoreMapper.class);

    @Override
    public List<String> selectCidFromScoreBySid(String sid) {
        return scoreMapper.selectCidFromScoreBySid(sid);
    }

    @Override
    public int selectNumberFromScoreByCid(String cid) {
        return scoreMapper.selectNumberFromScoreByCid(cid);
    }

    @Override
    public void deleteScoreBySid(String sid) {
        scoreMapper.deleteScoreBySid(sid);
    }

    @Override
    public List<Score> findScoresUseIf(Map map) {
        return scoreMapper.findScoresUseIf(map);
    }

    @Override
    public int insertScore(Map map) {
        return scoreMapper.insertScore(map);
    }

    @Override
    public int deleteScoreBySidAndCid(Map map) {
      return scoreMapper.deleteScoreBySidAndCid(map);
    }

    @Override
    public int updateScore(Map map) {
        return scoreMapper.updateScore(map);
    }
}
