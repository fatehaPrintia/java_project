package lab01;

import java.util.Scanner;

public class Display_OddNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter starting number:");
        int start = scn.nextInt();
        System.out.println(" Enter starting number:");
        int end= scn.nextInt();
        int i=start;
        while (start<=i && i<=end){
            if (i%2!=0){
                System.out.println(i);

            }i++;


        }

    }
}
