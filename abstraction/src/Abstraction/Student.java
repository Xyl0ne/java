package Abstraction;
 public class Student extends Management {
    
   

    Student(String name, String address, int yearLevel, int age, String course, String gender) {

        
        this.setName(name);
        this.setInfo(address, age, course, yearLevel, gender);

        
    }

    public void displayName(){
        System.out.print(getName());
    }

    @Override
    public void display() {
        super.display();
        System.out.print("\t\t"+getAddress()+"\t\t"+getAge()+"\t"+getCourse()+"\t\t"+getYearLevel()+"\t\t"+getGender());
        
    }

    
    
}