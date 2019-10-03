import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=3;
      int d=3;
      int count=1;
      int i=0;
       System.out.print(a);
      for(i=2;i<=n;i++)
      {
        
        
        a=a*d;
         System.out.print(" "+a);
         count=count+1;

        
      }
    // System.out.print(count);
	}
}