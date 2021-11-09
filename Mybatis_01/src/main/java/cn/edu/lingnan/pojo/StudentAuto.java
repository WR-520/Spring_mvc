package cn.edu.lingnan.pojo;

public class StudentAuto {
    private int sid;
    private String sname;
    private String password;
    private int superuser;

    public StudentAuto() {
    }

    public StudentAuto(int sid, String sname, String password, int superuser) {
        this.sid = sid;
        this.sname = sname;
        this.password = password;
        this.superuser = superuser;
    }

    @Override
    public String toString() {
        return "StudentAuto{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", password='" + password + '\'' +
                ", superuser=" + superuser +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
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
}
