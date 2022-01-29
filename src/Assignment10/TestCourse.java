package Assignment10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestCourse {
    public static void list(List<Course > c){

        HashMap<String,Course > al= new HashMap();
        for (Course s: c) {

            al.put(s.getCID(),s);
        }

        System.out.println(al);
    }


    public static void main(String[] args) {


        Course  c1 = new Course ("CS221", "DataStructure",4);
        Course  c2 = new Course ("CS203", " Procedural Programing",6);
        Course  c3 = new Course ("CS105", "Problem Solving",5);
        Course [] c= {c1,c2,c3};
        List<Course > cc= new ArrayList<>(List.of(c));
        list(cc);
    }
}
