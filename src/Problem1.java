import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a");
        int a = input.nextInt();
        System.out.println("Enter b");
        int b = input.nextInt();
        System.out.println("Enter c");
        int c = input.nextInt();
        System.out.println("Enter d");
        int d = input.nextInt();

sum(a,b,c,d);
multiple(a,b,c);
division(a,b);
subtraction(a,b);
    }
    public static int sum(int a ,int b, int c, int d)
    {
        int results = a + b + c+ d;
        System.out.println(a+"+"+b+"+"+c +"+"+d+"="+results);
        return results;
    }
public static int multiple( int a, int b, int c)
        {int results = a * b * c;
            System.out.println(a+"*"+b+"*"+c +"="+results);
        return results;

}public static double division( int a, int b)
    {double results = (double) a / b;
        System.out.println(a+"/"+b +"="+results);
        return results;}
public static int subtraction ( int a, int b)
{int results =  b-a;
    System.out.println(b+"-"+a +"="+results);
    return results;}
}


