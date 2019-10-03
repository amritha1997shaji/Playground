import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=1;
      int c=2;
      for(int i=1;i<=n;i++)
      {
        if(i%2==1)
        {
          int b=(int)(Math.pow(i,2));
          b=b-a;
         System.out.print(b+" ");             
        }
        else
        {
         int b=(int)(Math.pow(i,2));
         b=b-c;    
         System.out.print(b+" ");  
	}
}
    }
}