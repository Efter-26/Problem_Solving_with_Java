import java.util.Scanner;

public class p4_max_min_from_randomNumber {
    public static void main(String[] args) {

        int i,j;
        int[] arr= new int[10];
        for (i = 0; i<10; i++)
        {
            double random = Math.random() * 100;
            int random_number = (int) random;
            arr[i] = random_number;
        }
        System.out.print("Generated random numbers: ");
        for(int v:arr)
        {
            System.out.print(v + " ");
        }
        System.out.println();
        int max=arr[0];
        int min=arr[0];
        for (j=0; j < arr.length; j++)
        {
            if (arr[j] >= max)
            {
                max = arr[j];
            }
        }
        System.out.print("The Maximum number is: ");
        System.out.print(max);

        for (j=0; j < arr.length; j++)
        {
            if (arr[j] <= min)
            {
                min = arr[j];
            }
        }
        System.out.println();
        System.out.print("The Minimum number is: ");
        System.out.print(min);

    }
}
