package cn.edu.lingnan.log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationLog {
    @Before("execution(* cn.edu.lingnan..*(..))")
    public void before(){
        System.out.println("AnnotationLog类中的before方法被执行...");
    }
    @After("execution(* cn.edu.lingnan..*(..))")
    public void after(){
        System.out.println("AnnotationLog类中的after方法被执行...");
    }
}
