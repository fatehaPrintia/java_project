package lab02;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int exp = scn.nextInt();

        int result = (int) Math.pow(10,exp);
        System.out.println(result);
    }
}
