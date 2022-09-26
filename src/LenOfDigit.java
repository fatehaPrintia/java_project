import java.util.Scanner;

public class LenOfDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count =0;

        int number = scn.nextInt();
        while(0<number){
            count+=1;
            number = number /10;
        }System.out.println("Length of the digit is:"+count);
    }
}
