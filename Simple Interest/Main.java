import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
       int b=sc.nextInt();
       Float c=sc.nextFloat();
      Float si=(a*b*c)/100;
      System.out.printf("%.2f",si);
    }
}