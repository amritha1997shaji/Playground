import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
        int i=0;
      int t1=0;
      int t2=0;
      int t3=1;
       System.out.print(+t1);
       System.out.print(" "+t2);
       System.out.print(" "+t3);
      int s=0;
     for(i=3;i<a;i++)
      {
      s=t1+t2+t3;
        t1=t2;
        t2=t3;
        t3=s;
        System.out.print(" "+s);
      }
     
      }
    }
