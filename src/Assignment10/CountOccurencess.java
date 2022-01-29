package Assignment10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CountOccurencess {
    public static void countDistrictValues(ArrayList<String> list)
    {

        // hash set is created and elements of
        // arraylist are inserted into it
        Set<String> st = new HashSet<String>(list);
        for (String s : st)
            System.out.println(s + ": " + Collections.frequency(list, s));
    }

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Dave");
        list.add("Dean");
        list.add("Jasmine");
        list.add("Jasmine");
        countDistrictValues(list);
    }
}

