package cn.edu.lingnan.dao;

import org.junit.Test;

public class StudentTest {
    public static void main(String []args){
       StudentMapper studentMapper = new StudentMapperMySqlImpl();
       StudentMapperProxy  studentMapperProxy = new StudentMapperProxy();
       studentMapperProxy.setStudentMapper(studentMapper);
       studentMapperProxy.findStudentByName();
    }
    @Test
    public void testStudentDynProxy(){
        StudentMapper studentMapper = new StudentMapperMySqlImpl();
        StudentMapperDynProxy studentMapperDynProxy = new StudentMapperDynProxy();
        studentMapperDynProxy.setStudentMapper(studentMapper);
        StudentMapper studentMapper1 = (StudentMapper)studentMapperDynProxy.getProxy();
        studentMapper1.findStudentByName();
    }
    @Test
    public void testDynProxy(){
//        被代理的对象
        StudentMapper studentMapper = new StudentMapperMySqlImpl();
        MapperDynProxyNew mapperDynProxyNew = new MapperDynProxyNew();
        mapperDynProxyNew.setTarget(studentMapper);
        StudentMapper proxy = (StudentMapper) mapperDynProxyNew.getProxy();
        proxy.findAllStudent();
        proxy.findStudentByName();

    }
    @Test
    public void testDynProxy1(){
//        被代理的对象
        StudentMapper studentMapper = new StudentMapperMySqlImpl();
//        代理类
        StudentMapperDynProxy studentMapperDynProxy = new StudentMapperDynProxy();
        studentMapperDynProxy.setStudentMapper(studentMapper);
//        用这个工厂创建一个代理对象
        StudentMapper studentMapper1 = (StudentMapper)studentMapperDynProxy.getProxy();
        studentMapper1.findAllStudent();

    }
}
