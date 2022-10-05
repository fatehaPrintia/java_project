import java.util.Scanner;

public class Hours_Minutes_Seconds {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int time=scn.nextInt();
        int hours= time/3600;
        int minutes=(time % 3600)/60;
        int second=(time % 3600)%60;
        System.out.println(hours+" hours "+minutes+" minutes "+second+" seconds");


    }
}
