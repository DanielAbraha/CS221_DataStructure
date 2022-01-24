package Assignment8;

public class CountingCharacter {
   public static int countChar(String st, char c) {
        if (st.length() == 0) {
            return 0;
        }
        int count = 0;
        if (st.charAt(0)==(c)) {
            count = 1;
        }
        return count + countChar(st.substring(1),c);
    }

    public static void main(String[] args) {
        System.out.println(countChar("Danny",'n' ));
    }
}
