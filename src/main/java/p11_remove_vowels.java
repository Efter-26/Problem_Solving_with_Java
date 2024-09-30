import java.util.Scanner;

public class p11_remove_vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String myStr = input.nextLine();
        String str = myStr.toLowerCase();

        String[] arr= str.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String word : arr) {

            String withoutVowels = word.replaceAll("[aeiou]", "");

            sb.append(withoutVowels).append(" ");
        }

        String resultStr = sb.toString().trim().replaceAll("\\s+", " ");
        sb.setLength(0);
        sb.append(resultStr);

        System.out.println("After removing vowels: " + sb.toString() + " ");

    }
}
