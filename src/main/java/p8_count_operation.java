import java.util.LinkedHashSet;
import java.util.Scanner;

public class p8_count_operation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String myStr = input.nextLine();
        String vowels="aeiou";

        String[] words= myStr.split(" ");
        System.out.println("Words: "+ words.length);

        int charCountNoSpaces = myStr.replace(" ", "").length();
        System.out.println("Chars: "+ charCountNoSpaces);

        char[] chars= myStr.toLowerCase().toCharArray();


        int v_count=0;
        int c_count=0;

        for (char c: chars)
        {
            if(Character.isLetter(c))
            {
                if(vowels.indexOf(c)!=-1)
                {
                    v_count++;
                }
                else
                {
                    c_count++;
                }
            }

        }
        System.out.println("Vowel: "+ v_count);
        System.out.println("Consonant: "+ c_count);


    }
}
