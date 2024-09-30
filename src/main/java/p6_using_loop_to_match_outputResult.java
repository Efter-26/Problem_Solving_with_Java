public class p6_using_loop_to_match_outputResult {
    public static void main(String[] args) {

        int k;
        for(int i=1; i<=4; i++)
        {
            k=1;
            for(int j=i; j<=5; j++)
            {
                System.out.print(k);
                k++;

            }
            System.out.print('\n');
        }


        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);

            }
            System.out.print('\n');
        }
    }
}
