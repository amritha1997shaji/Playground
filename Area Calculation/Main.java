import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       Float d=sc.nextFloat();
      int a1=a*a;
      int b1=b*c;
      d=d*d;
     double d1=3.14*d;
      System.out.println(a1);
      System.out.println(b1);
      System.out.printf("%.3f",d1);
    }
}