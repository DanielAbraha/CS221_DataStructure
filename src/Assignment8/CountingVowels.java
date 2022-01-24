package Assignment8;

public class CountingVowels {
    public static int countVowels( String str)
    {
        if ( str.length() == 0 )
        {
            return 0;
        }

        if ( "aeiouAEIOU".indexOf(str.substring( 0, 1 )) < 0)
        {
            return countVowels(str.substring( 1 ) );
        }
        else
        {

            return 1 + countVowels(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Daniel"));
    }
}
