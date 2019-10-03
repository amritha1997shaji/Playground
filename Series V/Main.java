import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=4;
     int b=11;
      int i=0;
      for(i=0;i<n;i++)
      {
        int c=b*b;
       
        System.out.print(c+" ");
        b=b+a;
        
	}
}
}