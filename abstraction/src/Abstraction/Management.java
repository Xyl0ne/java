package Abstraction;
public abstract class Management {
    private String name;
    private String address;
    private int yearLevel;
    private String course;
    private int age;
    private String gender;

    private double itpe1;
    private double itpe2;
    private double itpe3;

    public void setName(String name) {
        this.name = name;
    }
    
    public void setInfo(String address, int age, String course, int yearLevel, String gender) {
        this.address = address;
        this.age = age;
        this.course = course;
        this.yearLevel = yearLevel;
        this.gender = gender;
    }
    

    public void setGrades(double itpe1, double itpe2, double itpe3) {
        this.itpe1 = itpe1;
        this.itpe2 = itpe2;
        this.itpe3 = itpe3;
    }

    public double getItpe1() {
        return itpe1;
    }

    public double getItpe2() {
        return itpe2;
    }

    public double getItpe3() {
        return itpe3;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public String getGender() {
        return gender;
    }

    public void display() {
        System.out.print(getName());
    }

}
