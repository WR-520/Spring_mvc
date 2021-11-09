package cn.edu.lingnan.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StudentMapperDynProxy implements InvocationHandler {
//    要代理谁
    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper){
        this.studentMapper = studentMapper;
    }
//    获取代理对象
    public Object getProxy(){
        return  Proxy.newProxyInstance(this.getClass().getClassLoader(),
                studentMapper.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
//        invoke(要代理的对象是什么)
        Object invoke = method.invoke(studentMapper,args);
        return invoke;
    }
    void log(String string){
        System.out.println("[Debug]:执行了" + string + "方法...");
    }
}
