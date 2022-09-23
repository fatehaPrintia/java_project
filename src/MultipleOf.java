import java.util.Scanner;

public class MultipleOf {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        System.out.println("Enter x");
        int x=scn.nextInt();

        if( x%2 == 0 || x % 5 == 0){
            System.out.println("yes it is multiple of 2 or 5!");
        }
        else{
            System.out.println("No it is not multiple of 2 or 5!");
        }

    }
}
