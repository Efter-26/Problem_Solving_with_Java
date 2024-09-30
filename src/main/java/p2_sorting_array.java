public class p2_sorting_array {
    public static void main(String[] args) {

        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        int i,j;

        for (i = 0; i <= cgpa.length-1; i++)
        {
            for (j = i + 1; j <= cgpa.length-1; j++)
            {
                if (cgpa[i] < cgpa[j])
                {
                    double temp = cgpa[i];
                    cgpa[i] = cgpa[j];
                    cgpa[j] = temp;
                }
            }
        }

        System.out.println("After sorting according to the order of highest CGPA:");
        for (double v : cgpa)
        {
            System.out.print(v+ " ");
        }

    }
}
