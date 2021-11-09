package cn.edu.lingnan.dao;

public class ScoreMapperMysqlImpl implements  ScoreMapper{
    @Override
    public void findAllScore() {
        System.out.println("mysql:查找所有分数");
    }

    @Override
    public void addAScore() {
        System.out.println("mysql:添加一个分数");
    }

    @Override
    public void deleteAScore() {
        System.out.println("mysql:删除一个分数");
    }

    @Override
    public void modifyScore() {
        System.out.println("mysql:修改一个分数");
    }
}
