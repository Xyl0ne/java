package StudentGradeTracker;

public class Student extends Account{
    
    

    Student(String s[]){
        this.setStudent(s);
    }
/*------------------------------------------------------------ */  
    public void print(){

        double studenGrades[][] = AcademicPerformance.getGrades();
        String arr[] = getStudent();
        for(int i =0; i< arr.length; i++){
            System.out.print("|" + "[" + i + "]" + arr[i] + "|");
            for(int j =0; j<studenGrades[i].length; j++){
                System.out.print("    "+studenGrades[i][j]+"    |");
            }                      
            
            System.out.println();
        }
    }
/*------------------------------------------------------------- */
    public void addStudent(String add){
        String temp[] = new String[getStudent().length+1];

        for(int i = 0; i< getStudent().length ; i++){
            temp[i] = getStudent()[i];
        }
        temp[temp.length-1] = add;

        super.setStudent(temp);
        System.out.println();
        
    }

/*------------------------------------------------------------- */
    public void len(){

        String arr[] = getStudent();
        int temp = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i].length() > temp){
                temp = arr[i].length();
                
            }
        }
        setLen(temp);

        for(int i = 0; i< arr.length;i++){
            if(arr[i].length() < temp){
                while (arr[i].length() < temp) {
                    arr[i] = arr[i].concat(" ");
                }
            }
            
        }
        super.setStudent(arr);
        
    }
   
    
}
