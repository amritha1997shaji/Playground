import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
    Float a=sc.nextFloat();
     Float a1=sc.nextFloat();
     Float  a2=sc.nextFloat();
      Float  a3=sc.nextFloat();
     Float  a4=sc.nextFloat();
       Float sum;
      sum=a+a1+a2+a3+a4;
     Float avg;
      avg=sum/5;
      System.out.printf("%.2f",avg);
      
    }
}