import java.util.Scanner;

public class SquareOf_N {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x =scn.nextInt();
        String str = "+";
        for (int i=0; i<=x;i++){

            System.out.print(str.repeat(x));
            System.out.println("");

        }
    }
}
