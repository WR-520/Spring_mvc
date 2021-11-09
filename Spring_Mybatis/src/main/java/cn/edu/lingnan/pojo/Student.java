package cn.edu.lingnan.pojo;

public class Student {
    private String sid;
    private String sname;
    private String password;
    private int superuser;
    public Student(){

    }

    public Student(String sid, String sname, String password, int superuser) {
        this.sid = sid;
        this.sname = sname;
        this.password = password;
        this.superuser = superuser;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSuperuser() {
        return superuser;
    }

    public void setSuperuser(int superuser) {
        this.superuser = superuser;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", password='" + password + '\'' +
                ", superuser=" + superuser +
                '}';
    }
}
