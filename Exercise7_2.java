public class Exercise7_2 {
    public static void main(String[] args) {
        String Text="Hello world";
        int n=Text.length();
        System.out.println("The fist char of string is "+Text.charAt(0));
        System.out.println("The last char of string is "+Text.charAt(n-1));
        System.out.println(Text.substring(1,n));
        System.out.println(Text.substring(0,n-1));
    }
}
