import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=1;
      System.out.print(i);
  
    for(i=2;i<=n;i++)
      {
         System.out.print(" "+(int)(Math.pow(i,2)));
	}
    
      //stem.out.print(" "+count);
}
}