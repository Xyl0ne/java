package StudentGradeTracker;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String testEmail = "test@gmail.com";
        String testPass = "test1234";

        String email;
        String password;

        String students[] = {
            "Levy S. Poyaoan", "Stephen Tapiador", "Raineier Poquiz", "kurt Mendoza", "Gregor Cajas"
        };
        
        String course[]={
            "subject1", "subjec2", "subject3"
        };
        double grades[][]={
            {1.75, 1.50, 1.00, 1.25,1.25},
            {1.75, 1.50, 1.00, 1.25,1.25},
            {1.75, 1.50, 1.00, 1.25,1.25},
            {1.75, 1.50, 1.00, 1.25,1.25},
            {1.75, 1.50, 1.00, 1.25,1.25},
        };


        Student s = new Student(students);
        Course c = new Course(course);
        Grades g =new Grades(grades);

        boolean isTrue =true;
        
       
        while (true) {
            System.out.println("-----Log In------\n");

            System.out.print("[0] Faculty \n[1] Student\n");

            System.out.print("Input: ");
            int logIn = scan.nextInt(); 

            switch (logIn) {
                case 0:
                    while (true) {
                        System.out.print("\nEmail: ");
                        email = scan.next();
                        System.out.print("Password: ");
                        password = scan.next();

                        if (testEmail.equals(email) && testPass.equals(password)) {
                            while(isTrue){
                                System.out.println("[0]Records \n[1]Students\n[x]Exit");
                                System.out.print("Input: ");
                                char input = scan.next().toLowerCase().charAt(0);
                                switch (input) {
                                    case '0':
                                        System.out.println();
                                        
                                        s.len();
                                        c.print();
                                        System.out.println();
                                        s.print();
                                        
                                        System.out.println();
                                        
                                        System.out.println();
                                        break;
                                    case '1':
                                        while (isTrue) {

                                            System.out.println("Student List");
                                            s.print();
                                            System.out.print("[e]edit\n[x]exit");
                                            char a =scan.next().charAt(0);

                                            if(a == 'e'){
                                                s.len();
                                                s.addStudent("kaido");
                                                s.print();
                                                System.out.println();
                                            }else if(a=='x'){
                                                isTrue=false;
                                            }else{
                                                System.out.println("Invalid input");
                                            }
                                            
                                        }
                                        isTrue =true;
                                        break;
                                    case 'x':
                                        isTrue = false;
                                    default:
                                        System.out.println("Select Properly");
                                        break;
                                }
                            }
                            isTrue = true;
                            
                         } else {

                            System.out.println("Invalid Credentials");
                        }

                    }
                    
                case 1:
                    while (true) {
                        System.out.print("\nEmail: ");
                        email = scan.next();
                        System.out.print("Password: ");
                        password = scan.next();

                        if (testEmail.equals(email) && testPass.equals(password)) {
                            System.out.println("Welcome");
                            break;
                        } else {

                            System.out.println("Invalid Credentials");
                        }
                        
                    }
                    
                    
                default:
                    System.out.println("Select Properly");
                    break;
            }
        }
    }
}
