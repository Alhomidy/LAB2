import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        double A,C,l,w;
        Scanner in=new Scanner(System.in);
        System.out.println("Entre the Length of Rectangle ");
        l=in.nextDouble();
        System.out.println("Enter the Width of Rectangle ");
        w=in.nextDouble();
        A=l*w;
        C=2*(l+w);
        System.out.println("The Area of Rectangle is "+A);
        System.out.println("The Circumference of Rectangle is "+C);

    }
}
