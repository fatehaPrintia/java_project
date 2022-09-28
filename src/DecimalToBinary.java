import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        String val=" ";
        int remainder;

        while (number>0){
            remainder=number%2;
            val= Integer.toString(remainder)+val;
            number=number/2;

        }
        System.out.print(val);
    }
}
