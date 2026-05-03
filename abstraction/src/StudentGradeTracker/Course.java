package StudentGradeTracker;

public class Course extends Account {
    
    Course(String c[]){
        this.setCourse(c);
    }

    void print(){
        String n ="Name";
        int t = getLen();

        while(n.length() < t+3){
           n = n.concat(" ");
        }
        System.out.print("|" + n+"|");
        for(int i =0; i< getCourse().length; i++){
            System.out.print(getCourse()[i]+"   \t|");
        }
    }
}
