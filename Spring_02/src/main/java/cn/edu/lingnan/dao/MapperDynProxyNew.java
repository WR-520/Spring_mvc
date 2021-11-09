package cn.edu.lingnan.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MapperDynProxyNew implements InvocationHandler {
    //    要代理谁
    private Object target;

    public void setTarget(Object target){
        this.target = target;
    }
    //    获取代理类
    public Object getProxy(){
        return  Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object invoke = method.invoke(target,args);
        return invoke;
    }
    void log(String string){
        System.out.println("[Debug]:执行了" + string + "方法...");
    }
}
