package cn.edu.lingnan.service;

public class StudentServiceMysqlImpl implements  StudentService{
   @Override
    public void query(){
       System.out.println("执行了mysql数据库的查询操作");
   }

    @Override
    public void insert() {
        System.out.println("执行了Mysql数据库的插入操作");
    }

    @Override
    public void update() {
        System.out.println("执行了Mysql数据库的更新操作");
    }

    @Override
    public void delete() {
        System.out.println("执行了Mysql数据库的删除操作");
    }
}
