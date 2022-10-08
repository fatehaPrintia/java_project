package lab01;

import java.util.Scanner;

public class PrintAt_a_suddenRange {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println(" enter your favourite car name:");
        String Car_name = scn.nextLine();
        System.out.println(" enter a number:");
        int number = scn.nextInt();
        int count=0;

        while (count<number){
            System.out.println(Car_name);
            count++;

        }


    }
}
