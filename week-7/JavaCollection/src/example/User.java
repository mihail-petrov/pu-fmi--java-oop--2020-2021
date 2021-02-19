package example;

public class User {

    private String fname;
    private String lname;
    private int age;
    private String email;

    public User(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public User(String fname, String lname, int age, String email) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
