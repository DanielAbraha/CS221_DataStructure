package Assignment3;

import java.util.Random;

public class Q1GenerateRandom {


    private Integer[] arr;
    private int size = 0;


    public Q1GenerateRandom(){

    }



    //To insert random integers
    public void insert() {
        Random random = new Random();
        arr = new Integer[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100 - 0) + 1;
            size++;
        }

    }

    // To remove duplicate array and print the distinct list
    public void removeDuplicates() {
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];

            }
        }
        temp[j++] = arr[arr.length - 1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        System.out.print("[ ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    // Removing all the elements
    public void clear() {
        Integer[] temp = new Integer[0];
        arr = temp;
    }

    // The size of the array
    public int size() {
        return size;
    }

    // Value by passing index
    public int get(int index) {
        if (index < 0 && index >= size)
            throw new ArrayIndexOutOfBoundsException();
        return arr[index];
    }

    //Getting sublist
    public int[] subList(int start, int end) {
        int[] subListArray;
        int index = 0;
        if ((start < 0 && start >= size) || (end < 0 && end >= size))
        throw new ArrayIndexOutOfBoundsException();
        subListArray = new int[(end - start) + 1];
        for (int i = start; i <= end; i++) {
            subListArray[index] = arr[i];
            index++;
        }

        return subListArray;

    }

    //set a new value and return old
    public int set(int index, int newValue) {
        int oldValue;
        if (index < 0 || index >= size)
        throw new ArrayIndexOutOfBoundsException();

        oldValue = arr[index];
        arr[index] = newValue;
        return oldValue;

    }
}




