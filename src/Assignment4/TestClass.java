package Assignment4;

import java.util.LinkedList;

public class TestClass {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.addFirst(12);
        list.addFirst(24);
        list.addFirst(57);
        list.addFirst(49);
        list.addFirst(38);
        System.out.println(list);
        System.out.println(list.size());
        list.addFirst(65);
        System.out.println(list);
        System.out.println(list.find(10));
        System.out.println(list.find(57));
        //System.out.println(list.SmallestNumber());
        System.out.println(list.greatestNumber());
    }
}
