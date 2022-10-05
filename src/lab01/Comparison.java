import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        System.out.println("Enter x");
        int x=scn.nextInt();
        System.out.println("Enter y");
        int y=scn.nextInt();
        if(x>y){
            System.out.println("X is grater");
        }
        else if (x<y){
            System.out.println("Y is grater");

        }
        else {
            System.out.println(" X and Y are equal");
        }

    }
}
