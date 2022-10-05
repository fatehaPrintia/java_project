import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int number= scn.nextInt();
        if(number>=90){
            System.out.println(" Grade A");
        } else if (80 <= number && number <=89){
            System.out.println(" Grade B");

        }else if (70 <= number && number <=79){
            System.out.println(" Grade C");

        }else if (60 <= number && number <=69){
            System.out.println(" Grade D");

        }else if (50 <= number && number <=59){
            System.out.println(" Grade E");

        }else if (50 > number){
            System.out.println(" Grade F");

        }


    }
}
