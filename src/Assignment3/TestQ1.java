package Assignment3;



public class TestQ1 {
    public static void main(String[] args) {


            Q1GenerateRandom arrList = new Q1GenerateRandom();
            arrList.insert();
            System.out.print("[ ");
            for (int i = 0; i < arrList.size(); i++) {
                System.out.print(arrList.get(i) + " ");
            }
//            System.out.print("]");
//            System.out.println();

            arrList.removeDuplicates();

//            System.out.println(arrList.size());
//            System.out.println(arrList.get(1));
//
//            int[] result = arrList.subList(1, 3);
//            System.out.print("[ ");
//            for (int i = 0; i < result.length; i++) {
//                System.out.print(result[i] + " ");
//            }
//            System.out.print("]");
//            System.out.println();
//
//
//            System.out.println(arrList.set(4, 0));
//            System.out.print("[ ");
//            for (int i = 0; i < arrList.size(); i++) {
//                System.out.print(arrList.get(i) + " ");
//            }
//            System.out.print("]");
//            System.out.println();
//
//
//            arrList.clear();

        }
    }




