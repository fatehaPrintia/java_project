package lab02;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int i = 2;
        int count=0;

        if (number>1){
            while (i<number){
                if (number % i ==0){
                    count++;
                }
                i++;

            }if(count>0){
                System.out.println("This is not a prime number ");

            }else{
                System.out.println("This is a prime number ");

            }
        }
        else {
            System.out.println("This is not a prime number ");
        }

    }
}
