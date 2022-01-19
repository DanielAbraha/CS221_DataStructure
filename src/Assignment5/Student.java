package Assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**Implement Comparable interface to sort the objects of Student ArrayList using score
 field. Write a constructor to initialize the values.
 *
 */

public class Student implements Comparable<Student>{
        private int sId;
        private String sName;
        private int score;

        public Student(int sId, String sName, int score) {
            this.sId = sId;
            this.sName = sName;
            this.score = score;
        }

        public int getSId() {
            return sId;
        }

        public void setSId(int sId) {
            this.sId = sId;
        }

        public String getSName() {
            return sName;
        }

        public void setSName(String sName) {
            this.sName = sName;
        }

        public int getScore() {
            return score;
        }


        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student [id=" + sId + ", name=" + sName + ", score=" + score + "]";
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Student student = (Student) obj;
            return sId == student.sId && score == student.score && Objects.equals(sName, student.sName);
        }
        @Override
        public int compareTo(Student s) {
            if(this.score == s.score) {
                return 0;
            }
            if(this.score > s.score) {
                return 1;
            }
            else if(this.score < s.score) {
                return -1;
            }

            return Integer.compare(this.score,s.score);
        }

        public static void main(String[] args) {

            List<Student> sList = new ArrayList<>();
            sList.add(new Student(1224,"Alexander",95));
            sList.add(new Student(1442,"Charles",85));
            sList.add(new Student(1662,"James",70));
            sList.add(new Student(1882,"Martha",80));
            sList.add(new Student(1080,"Feven",75));

            Collections.sort(sList);
            System.out.println(sList);


        }

    }

