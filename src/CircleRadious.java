import java.util.Scanner;
public class CircleRadious {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in);
        System.out.println("Enter Radious");
        int radious = scn.nextInt();
        System.out.println("Area of the circle is:");
        System.out.println(Math.PI*Math.pow(2,radious));
        System.out.println("Area of the circle is:");
        System.out.println(2*Math.PI*radious);

    }
}
