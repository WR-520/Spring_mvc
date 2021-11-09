package cn.edu.lingnan;


// 静态代理
public class Proxy implements Rent {

    private Rent rent;

    public void setRent(Rent rent){
      this.rent = rent;
    }
    @Override
    public void rent() {
        seeHouse();
       rent.rent();
    }
    public void seeHouse(){
        System.out.println("中介先带租客看房子");
    }
}
