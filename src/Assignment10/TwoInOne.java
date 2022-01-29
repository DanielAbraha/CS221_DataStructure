package Assignment10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TwoInOne {
    public static Map<String, Integer> mergeLists(List<String> list1, List<Integer> list2){
        Map<String, Integer> map = new TreeMap<>();
        int size = (list1.size() < list2.size()) ? list1.size(): list2.size();
        for (int i = 0; i < size; i++){
            map.put(list1.get(i), list2.get(i));
        }
        return map;
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add("Dean");
        list1.add("Dave");
        list1.add("Zaineh");
        list2.add(90);
        list2.add(80);
        list2.add(94);
//        System.out.println(list1);
//        System.out.println(list2);
        System.out.println(mergeLists(list1,list2));
    }
}
