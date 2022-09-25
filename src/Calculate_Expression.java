import java.util.Scanner;

public class Calculate_Expression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x= scn.nextInt();
        double sum=0;
        int i=1;
        while (i<=x){
            double y= Math.pow(-1,i+1);
            sum=sum+y*(i*i);
            i++;

        }System.out.print(sum);
    }
}
