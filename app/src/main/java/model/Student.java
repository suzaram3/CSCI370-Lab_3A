package model;

public class Student {
    private String firstname, lastname, major;

    public Student(String firstname, String lastname, String major) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.major = major;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMajor() {
        return major;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setMajor(String major){
        this.major = major;
    }

}
