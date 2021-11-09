package cn.edu.lingnan.log;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object result, Method method,Object [] args,Object targetObject) throws Throwable{
        System.out.println(targetObject.getClass().getName() + "类的" + method.getName() + "方法被调用");
    }
}
