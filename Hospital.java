public class Hospital {
   public static void main(String[] args) {
      Nurse nurse = new Nurse("Sonny", 789, 6);
      Doctor doctor1 = new Doctor("Michael", 234, "Heart");
      Doctor doctor2 = new Surgeon("Vincent", 645, "Brain", true);
      HospitalEmployee employee = new HospitalEmployee("Vito", 123);


      System.out.println(employee);
      System.out.println(doctor1);
      System.out.println(doctor2);
      System.out.println(nurse);

      employee.work();
      doctor1.work();
      doctor2.work();
      nurse.work();
   }
}
//