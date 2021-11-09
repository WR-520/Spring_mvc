package cn.edu.lingnan.dao;

public class ScoreMapperSqlServerImpl implements ScoreMapper {
    @Override
    public void findAllScore() {
        System.out.println("SqlServer:查找所有分数");
    }

    @Override
    public void addAScore() {
        System.out.println("SqlServer:添加一个分数");
    }

    @Override
    public void deleteAScore() {
        System.out.println("SqlServer:删除一个分数");
    }

    @Override
    public void modifyScore() {
        System.out.println("SqlServer:修改一个分数");
    }
}
