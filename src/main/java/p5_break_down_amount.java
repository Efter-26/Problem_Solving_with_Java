import java.util.Scanner;

public class p5_break_down_amount {
    public static void main(String[] args) {
        int[] notes = {1000,500,200,100,50,20,10,5,2,1};
        int c,i=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        int amount = input.nextInt();

        while(amount!=0)
        {
            if(amount>=notes[i])
            {
                c = amount/notes[i];
                amount = amount - (c * notes[i]);
                System.out.println(notes[i]+ " " +c);
            }
            else
            {
                i++;
            }
        }
    }
}
