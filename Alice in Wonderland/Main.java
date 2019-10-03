import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
     int b=a%10;
      int c=a/10;
      int sum=b+c;
      System.out.println("Alice must go in path-"+sum);
	}
}