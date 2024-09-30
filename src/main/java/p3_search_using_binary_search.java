import java.util.Scanner;

public class p3_search_using_binary_search {
    public static void main(String[] args) {

        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        int i,j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter CGPA:");
        double input_cgpa = input.nextDouble();

        for (i = 0; i <= cgpa.length-1; i++)
        {
            for (j = i + 1; j <= cgpa.length-1; j++)
            {
                if (cgpa[i] > cgpa[j])
                {
                    double temp = cgpa[i];
                    cgpa[i] = cgpa[j];
                    cgpa[j] = temp;
                }
            }
        }
        int left = 0;
        int right = cgpa.length-1;
        boolean flag = false;

        while(right>=left)
        {
            int mid = (right + left) /2;

            if(cgpa[mid] == input_cgpa)
            {
                flag = true;
                break;
            }
            if(input_cgpa > cgpa[mid])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }

        }
        if(flag)
        {
            System.out.println("CGPA found");
        }
        else
        {
            System.out.println("CGPA not found");
        }
    }
}
