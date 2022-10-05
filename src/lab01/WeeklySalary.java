import java.util.Scanner;

public class WeeklySalary {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Worked_hours = scn.nextInt();
        if (Worked_hours <= 40) {
            System.out.println(" Receive salary");
            System.out.println(Worked_hours*200);
        } else {
            System.out.println("Receive salary ");
            int extraHour=Worked_hours-40;
            System.out.println(extraHour*300+8000);

        }
    }
}