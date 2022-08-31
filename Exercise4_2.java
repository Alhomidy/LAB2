import java.util.Scanner;

public class Exercise4_2 {
    public static void main(String[] args) {
        double a,b,c,avg;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three Number ");
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        avg=a+b+c/3.0;
        System.out.println("The Average is "+avg);


    }
}
