package StudentGradeTracker;

public abstract class Account {
    private String name;

    private String student[];
    void setStudent(String student[]){
        this.student = student;
    }
    public String []getStudent(){
        return this.student;
    }
    
    private double grades[][];
    void setGrades(double grades [][]){
        this.grades = grades;
    }
    public double [][]getGrades(){
        return this.grades;
    }

    private String course[];
    void setCourse(String course[]){
        this.course = course;
    }
    public String []getCourse(){
        return this.course;
    }

    private static int leng;
    void setLen(int leng){
        this.leng = leng;
    }
    int getLen(){
        return this.leng;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void display() {
        System.out.print(getName());
    }
}
