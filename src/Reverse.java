import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        while (1<=n){
            int digit=n%10;
            n=n/10;
            System.out.println(digit);


        }
    }
}
