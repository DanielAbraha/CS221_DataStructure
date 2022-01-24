package Assignment8;

public class Decimal_Binary {

        public static String decimalToBinary(int value){
            if(value == 0){
                return "";
            }
            else{
                return decimalToBinary(value/2) + "" + (value%2);
            }
        }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(3));
    }
}
