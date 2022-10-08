package lab01;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        System.out.println("Enter x");
        int x=scn.nextInt();
        if (x%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

    }
}
