package lab02;

public class Add_MultipleOfBoth_7_and_5 {
    public static void main(String[] args) {
        int sum=0;
        int i=0;
        while (i<=600){
            if (i%7==0 && i%5==0){
                sum=sum+i;

            }
            i++;

        }
        System.out.println(sum);
    }

}
