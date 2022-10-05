import java.util.Scanner;

public class Meal_Timing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int hour = scn.nextInt();
        if (hour>=0 && hour<=23) {
            if (hour >= 4 && hour <= 6) {
                System.out.println(" Breakfast!");
            } else if (hour >= 12 && hour <= 13) {
                System.out.println(" Lunch!");

            } else if (hour >= 16 && hour <= 17) {
                System.out.println(" Snacks!");
            } else if (hour >= 19 && hour <= 20) {
                System.out.println(" Dinner!");
            } else {
                System.out.println(" Patience is a virtue!");

            }

            }else{
            System.out.println("Wrong time!");
        }
    }
}
