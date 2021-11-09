package cn.edu.lingnan;
//地主
public class Landlord implements Rent{
    @Override
    public void rent() {
        System.out.println("地主在出租房子");
    }

}
