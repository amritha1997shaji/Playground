import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          int L1=sc.nextInt();
          int L2=sc.nextInt();
          int L3=sc.nextInt();
          int n=sc.nextInt();
          int a=n-L1;
         int b=n-L2;
          int c=n-L3;
          if((a<b)&&(a<c))
          {
          System.out.println("L1");
          }
         
          else if((b<c)&&(b>a))
          {
          System.out.println("L2");
          }
          else 
          {
          System.out.println("L3");
          }

        }
}