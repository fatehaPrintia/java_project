import java.util.Scanner;

public class Rectangle_IncrementNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int height= scn.nextInt();;
        int length= scn.nextInt();
        for (int i=0; i<height;i++){
            for(int j=1; j<=length;j++){
                System.out.print(j);

            }System.out.println();

        }
    }
}
