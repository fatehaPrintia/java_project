package lab01;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int height= scn.nextInt();;
        int length= scn.nextInt();
        String str= "+";
        for (int i=0; i<height;i++){
            for(int j=0; j<length;j++){
                System.out.print(str);
//
            }System.out.println();

        }
    }
}
