package lab02;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        int sum=0;
        int i =1;
        while (i<number){
            if(number%i == 0){
                sum =sum +i;
            }i++;
        }
        if (sum == number){
            System.out.println("This is a perfect number " );

        }
        else {
            System.out.println("This is not a perfect number " );
        }

    }
}
