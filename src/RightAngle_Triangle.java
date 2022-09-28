import java.util.Scanner;

public class RightAngle_Triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int height = scn.nextInt();
        ;

        for (int i = 0; i <=height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
    }
}
