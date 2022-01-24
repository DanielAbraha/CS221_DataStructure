package Assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


 /**   Override the equals() method for the Student class in the previous question. Create a
    Comparator implementation which consists with equals. Write a test class with the
            sample data and print the result in a sorted order using your comparator.*/

 public class StudentEquals implements Comparator<Student> {

     // Consistent with equals, because if salaries are equals, it then considers names
     @Override
     public int compare(Student s1, Student s2) {
         if (s1.getSId() - s2.getSId() != 0)
             return s1.getScore()- s2.getScore();
         else if (s1.getScore()- s2.getScore() != 0)
             return s1.getSName().compareTo(s2.getSName());
         return ( s1.compareTo(s2));
     }




     public static void main(String args[]){
         List<Student> sList = new ArrayList<>();

         Student s1 = new Student(1224,"Alexander",95);
         Student s2 = new Student(1442,"Charles",85);
         Student s3 = new Student(1662,"James",70);
         Student s4 = new Student(1662,"Martha",80);
         Student s5 = new Student(1224,"Feven",95);

         Student[]students = {s1, s2, s3, s4, s5};
         for (int i = 0; i < 5; i++) {
             sList.add(students[i]);
         }

         Collections.sort(sList);
         System.out.println(sList);
         StudentEquals sq = new StudentEquals();
         System.out.println(s1.equals(s5));
         System.out.println(sq.compare(s1,s2));

     }



 }

