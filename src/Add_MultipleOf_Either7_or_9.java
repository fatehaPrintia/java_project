public class Add_MultipleOf_Either7_or_9 {
    public static void main(String[] args) {
        int sum=0;
        int i=0;
        while (i<=600){
            if (i%7==0 || i%9==0){
                sum=sum+i;

            }
            i++;

        }
        System.out.println(sum);
    }
}
