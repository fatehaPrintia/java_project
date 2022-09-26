import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int i=1;
        int count=0;
        while (i <= number) {
            if (number%i == 0){
                System.out.println(i);
                count++;

            }
            i++;

        }
        System.out.println("Total divisor: " + count);
    }
}
