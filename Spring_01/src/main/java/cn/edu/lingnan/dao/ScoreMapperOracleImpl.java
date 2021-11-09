package cn.edu.lingnan.dao;

public class ScoreMapperOracleImpl implements  ScoreMapper {
    @Override
    public void findAllScore() {
        System.out.println("Oracle:查找所有分数");
    }

    @Override
    public void addAScore() {
        System.out.println("Oracle:添加一个分数");
    }

    @Override
    public void deleteAScore() {
        System.out.println("Oracle:删除一个分数");
    }

    @Override
    public void modifyScore() {
        System.out.println("Oracle:修改一个分数");
    }
}
