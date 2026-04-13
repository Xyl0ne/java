package Abstraction;

public class Grades extends Management {

   Grades(double sub1, double sub2, double sub3) {
      this.setGrades(sub1, sub2, sub3);
   }

   public double getGwa() {

      return ((getItpe1() + 3) + (getItpe2() + 3) + (getItpe3() + 3)) / 10;
   }

   public void display() {
      System.out.print("\t" + getItpe1() + "\t" + getItpe2() + "\t" + getItpe3() + "\t" + getGwa());
   }
}
