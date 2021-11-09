package cn.edu.lingnan.pojo;

public class Student {
    private String name;
    private Address address;
    public Student(){

    }
    public Student(String name,Address address){
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public Address getAddress(){
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
