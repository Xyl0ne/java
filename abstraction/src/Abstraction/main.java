package Abstraction;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Faculty f[] = {
                new Faculty("Alrich Michael", "ITPE1", "8:00am"),
                new Faculty("Maynard Carse", "ITPE2", "10:00am"),
                new Faculty("Carl Michael ", "ITPE3", "1:00pm"),
        };

        Student s[] = {
                new Student("Levy", "Baug", 3, 20, "IT", "Male"),
                new Student("Stephen", "Balite", 3, 20, "IT", "male"),
                new Student("Rainier", "Sapinit", 3, 20, "IT", "male"),
                new Student("Kurt", "Pasibe", 3, 20, "IT", "male"),
                new Student("Kievid", "Pagal", 3, 20, "IT", "male"),
                new Student("Joles", "Baug", 3, 20, "IT", "male"),
                new Student("Adrian", "Real", 3, 20, "IT", "male"),
                new Student("Jennie", "Balite", 3, 20, "IT", "male"),
                new Student("Khriza", "Balite", 3, 20, "IT", "male"),
                new Student("Rose", "Balite", 3, 20, "IT", "male"),
                new Student("Mariela", "Bayaoas", 3, 20, "IT", "male"),
                new Student("Denise", "Bayaoas", 3, 20, "IT", "male"),
                new Student("Oddette", "Land", 3, 20, "IT", "male"),
                new Student("Vexana", "of", 3, 20, "IT", "male"),
                new Student("Lolita", "Dawn", 3, 20, "IT", "male"),

        };
        Grades g[] = {
                new Grades(1, 1, 1),
                new Grades(2.00, 2.50, 2.25),
                new Grades(1.25, 1.5, 1.25),
                new Grades(1.5, 1.25, 1.5),
                new Grades(1.25, 1.75, 1.5),
                new Grades(1.25, 1.25, 2.00),
                new Grades(1.75, 1.25, 1.5),
                new Grades(1.25, 1.75, 1.5),
                new Grades(1, 1.25, 1.5),
                new Grades(1.25, 1.25, 1.5),
                new Grades(1.25, 1.25, 1.5),
                new Grades(1.25, 1.25, 1.5),
                new Grades(1.25, 1.25, 1.5),
                new Grades(1.25, 1.25, 1.5),
                new Grades(1.5, 1.5, 1.75),

        };

        boolean isTrue = true;

        while (isTrue) {

            System.out.println("[1] Faculty");
            System.out.println("[2] Students");
            System.out.println("[3] Subjects");
            System.out.println("[4] Add");

            System.out.print("input: ");
            int choice = scan.nextInt();
            System.out.println();
            if (choice == 1) {
                System.out.println("Id\tName");
                for (int i = 0; i < f.length; i++) {
                    System.out.print("[" + (i + 1) + "]\t");
                    f[i].display();
                    ;
                    System.out.println();
                }
                System.out.println();

            } else if (choice == 2) {
                while (isTrue) {
                    System.out.println("[0] Student Information");
                    System.out.println("[1] Student Grades");
                    System.out.println("[2] Student Subject");

                    System.out.println("[3] Exit");

                    System.out.print("Input: ");
                    int c = scan.nextInt();
                    System.out.println();
                    switch (c) {
                        case 0:
                            System.out.println("Id\tName\t\tAddress\t\tage\tCourse\t\tYearLevel\tGender");
                            for (int i = 0; i < s.length; i++) {
                                System.out.print("[" + (i + 1) + "]\t");
                                s[i].display();
                                System.out.println();
                            }
                            System.out.println();
                            break;
                        case 1:
                            System.out.println("ID\tName\t\t" + f[0].sub + "\t" + f[1].sub + "\t" + f[2].sub + "\tGwa");
                            for (int i = 0; i < s.length; i++) {
                                System.out.print("[" + i + "]" + "\t" + s[i].getName() + "\t");
                                g[i].display();
                                System.out.println();
                            }
                            System.out.println();

                            break;
                        case 2:
                            System.out.println("Subject");
                            for (int i = 0; i < f.length; i++) {
                                System.out.println(f[i].sub);
                            }
                            System.out.println();
                            break;
                        case 3:
                            isTrue = false;
                            break;
                        default:
                            break;
                    }
                }

            } else if (choice == 3) {
                System.out.println("Name\t\tSubject\t\tSchedule");
                for (int i = 0; i < f.length; i++) {
                    System.out.print(f[i].getName() + "\t" + f[i].sub + "\t\t" + f[i].sched + "\n");
                }
                System.out.println();
            }

            else if (choice == 4) {
                int len = s.length-1;
                String name = scan.next();
                String address = scan.next();
                int yearLevel = scan.nextInt();
                int age = scan.nextInt();
                String course = scan.next();
                String gender = scan.next();
                
                s[len ] = new Student(name, address, yearLevel, age, course, gender);
                len++;
                
            }
            isTrue = true;
        }
    }
}
