import java.util.Scanner;

public class Summation_and_Average {
    public static void main(String[] args) {
        int i=0;
        double sum=0;
        double average=0;
        Scanner scn = new Scanner(System.in);
        int count=0;
        while (i<10){

            int x = scn.nextInt();
            if (x%2!=0){
                sum=sum+x;
                count++;

            }

            i++;



        }average=sum/count;
        System.out.print(sum);
        System.out.print(average);
    }

}
