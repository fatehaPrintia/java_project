import java.util.Scanner;

public class Max_Min_Average {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int max=0;
        int min=1000000000;
        double average=0;
        double sum=0;
        double total;
        total=x;
        while (x>0){
            int y = scn.nextInt();
            if(y>max){
                max=y;
            }
            if (y<min){
                min = y;
                
            }
            sum+=y;
            x--;

        }average = sum / total;
        System.out.println("maximum "+max+','+"minimum "+min+','+"average is "+average);

    }
}
