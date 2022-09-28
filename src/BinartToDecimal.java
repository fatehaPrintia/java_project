import java.util.Scanner;

public class BinartToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String number = scn.nextLine();
        int val = 0;
        int temp = number.length()-1;
        for(int i=0;i<number.length();i++){
            int out =Integer.parseInt(String.valueOf(number.charAt(i)));
            val+=out*((int) Math.pow(2,temp));
            temp-=1;

        }
        System.out.print(val);
    }
}
