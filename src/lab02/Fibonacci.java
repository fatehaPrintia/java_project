package lab02;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int range = scn.nextInt();
        int fib=0;
        int sum=1;
        System.out.print(fib+" "+sum+" ");
        while(fib+sum <=range){
            int temp = fib+sum;
            System.out.print(temp);
            System.out.print(" ");
            fib=sum;
            sum=temp;
        }
    }
}
