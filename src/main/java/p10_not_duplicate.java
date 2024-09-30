import java.util.LinkedHashMap;
import java.util.Scanner;

public class p10_not_duplicate {
    public static void main(String[] args) {

        int i;
        int[] array= new int[30];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total numbers:");
        int n = input.nextInt();
        System.out.println("Enter Numbers:");
        for (i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }

        LinkedHashMap<Integer, Integer> repeatNumber = new LinkedHashMap<>();

        for (int num : array)
        {
            repeatNumber.put(num, repeatNumber.getOrDefault(num, 0) + 1);
        }

        System.out.print("non duplicate numbers are: ");
        boolean isFirst = true;
        for (int num : array)
        {
            if (repeatNumber.get(num) == 1)
            {
                if (!isFirst) {
                    System.out.print(",");
                }
                System.out.print(num);
                isFirst = false;
            }
        }
    }
}
