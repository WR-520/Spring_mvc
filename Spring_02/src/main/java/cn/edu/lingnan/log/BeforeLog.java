package cn.edu.lingnan.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object targetObject) throws Throwable {
        System.out.println(  targetObject.getClass().getName() + "类的" + method.getName() + "方法被调用...");

    }
}
