import java.util.Scanner;

public class p7_lowest_height {
    public static void main(String[] args) {
        int i,j;
        double[] arr= new double[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 10 heights of babies:");
        for (i = 0; i < 10; i++)
        {
            arr[i] = input.nextDouble();
        }

        System.out.print("The 10 heights are: ");
        for (i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        for (i = 0; i < 10; i++)
        {
            for (j = i + 1; j < 10; j++)
            {
                if (arr[i] > arr[j])
                {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("The 2 lowest heights of babies are " + arr[0] + " & " + arr[1] );
    }
}
