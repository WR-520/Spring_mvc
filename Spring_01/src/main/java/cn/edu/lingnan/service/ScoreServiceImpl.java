package cn.edu.lingnan.service;

import cn.edu.lingnan.dao.CourseMapper;
import cn.edu.lingnan.dao.ScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ScoreServiceImpl implements ScoreService{
    @Autowired
    private ScoreMapper scoreMapper ;


    public ScoreMapper getScoreMapper(){
        return scoreMapper;
    }
    @Autowired
    public void setScoreMapper(ScoreMapper scoreMapper){
        this.scoreMapper = scoreMapper;
    }

    @Override
    public void findAllScore() {

        scoreMapper.findAllScore();

    }

    @Override
    public void addAScore() {
        scoreMapper.addAScore();
    }

    @Override
    public void deleteAScore() {
        scoreMapper.deleteAScore();
    }

    @Override
    public void modifyScore() {
        scoreMapper.modifyScore();
    }
}
