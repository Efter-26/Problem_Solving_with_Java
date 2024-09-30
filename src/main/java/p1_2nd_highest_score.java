public class p1_2nd_highest_score {
    public static void main(String[] args) {

        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double highest_cgpa = cgpa[0];
        double second_highest_cgpa = cgpa[0];

        for (int i=0; i<cgpa.length; i++)
        {
            if (cgpa[i] > highest_cgpa)
            {
                second_highest_cgpa = highest_cgpa;
                highest_cgpa = cgpa[i];
            } else if (cgpa[i] > second_highest_cgpa && cgpa[i] != highest_cgpa)
            {
                second_highest_cgpa = cgpa[i];
            }
        }
        System.out.println("The second highest score is: " + second_highest_cgpa);

    }

}
