package cn.edu.lingnan.test;

import org.junit.Test;

    public class HelloSpring {
    private String name;

        public HelloSpring(String s) {
            this.setName(s);
        }

        public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public HelloSpring(){
        System.out.println("HelloSpring构造方法被调用");
    }
    public void show(){
        System.out.println("HelloSpring"+name);
    }
}
