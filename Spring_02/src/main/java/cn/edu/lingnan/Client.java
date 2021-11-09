package cn.edu.lingnan;
//租客
public class Client {
    public static void main(String []args){
        Landlord landlord = new Landlord();
        Proxy proxy = new Proxy();
        proxy.setRent(landlord);
        proxy.rent();
    }

}
