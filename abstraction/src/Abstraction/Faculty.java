package Abstraction;

public class Faculty extends Management{
  
   String sub;
   String sched;

   Faculty(String name, String sub, String sched) {
      this.setName(name);
      this.sub = sub;
      this.sched = sched;
   }

}