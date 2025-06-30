import java.util.*;
public class fibonnaciloopwhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number upto?");
        int number=sc.nextInt();
        int first=0;
        int second=1;
        System.out.println(first+" "+second);
        int sum=first+second;
        while(sum<=number){
            System.out.println(sum);
            first=second;
            second=sum;
            sum=first+second;
        }

    }
}
