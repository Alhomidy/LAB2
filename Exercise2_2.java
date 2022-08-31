import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        double A,C,r;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Radius of Circle");
        r=in.nextDouble();
        C=2*Math.PI*r;
        A=Math.PI*r*r;
        System.out.println("The Area of Circle is "+A);
        System.out.println("The Circumference of Circle "+C);

    }
}
