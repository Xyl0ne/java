package Abstraction;
 public class Student extends Management {
    
   

    Student(String name) {

        
        this.setName(name);

        
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