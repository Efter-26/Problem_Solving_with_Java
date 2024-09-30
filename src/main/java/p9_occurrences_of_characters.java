import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p9_occurrences_of_characters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String myStr = input.nextLine();
        char[] chars= myStr.toLowerCase().toCharArray();
        LinkedHashMap<Character,Integer> hashMap=new LinkedHashMap<>();
        for(char c: chars){
            if (c != ' ') {
                hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
            }

        }
        for (HashMap.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
