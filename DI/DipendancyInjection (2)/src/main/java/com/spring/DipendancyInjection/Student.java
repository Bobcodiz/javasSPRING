package com.spring.DipendancyInjection;

public class Student {

     private String StudentName;
     private int id;
     private String Family;
     /*public void setStudentName(String studentName) {
          this.StudentName = studentName;
     }
     public void setId(int id) {
          this.id = id;
     }

     public void setFamily(String family) {
          this.Family = family;
     }*/

     public Student(int id, String StudentName, String Family) {
          this.id = id;
          this.StudentName = StudentName;
          this.Family = Family;

     }

     public Student(String StudentName) {
          this.StudentName = StudentName;
     }

     public void DisplayStudentInfo(){
          System.out.println("the student is "+StudentName);
          System.out.println("the id Number is "+id);
          System.out.println("His family members name is "+Family);
     }
}
