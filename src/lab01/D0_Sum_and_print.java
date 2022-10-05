import java.util.Scanner;

public class D0_Sum_and_print {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int i=0;
        int sum=0;
        while (i<10){
            System.out.println("Enter number");
            int x = scn.nextInt();
            sum=sum+x;
            System.out.println(sum);
            i++;
        }
    }
}
