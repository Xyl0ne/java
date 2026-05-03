package StudentGradeTracker;

public class Grades extends AcademicPerformance {
    
    Grades(double grade[][]){
        this.setGrades(grade);
    }

    public void print() {
        // Outer loop accesses each row of the 2D array
        for (int i = 0; i < getGrades().length; i++) {
            System.out.print("Row " + (i + 1) + ": ");

            // Inner loop accesses each element within that specific row
            for (int j = 0; j < getGrades()[i].length; j++) {
                System.out.print(getGrades()[i][j] + " ");
            }

            // Moves to the next line after printing all columns in a row
            System.out.println();
        }
    }
}
