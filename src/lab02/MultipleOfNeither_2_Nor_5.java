package lab02;

import java.util.Scanner;

public class MultipleOfNeither_2_Nor_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        System.out.println("Enter x");
        int x=scn.nextInt();

        if( x%2 != 0 && x % 5 != 0){
            System.out.println("it is multiple of neither 2 nor 5!");
        }


    }
}
