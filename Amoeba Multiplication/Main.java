import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          int i=1;
          int n=sc.nextInt();
          int t1=0;
          int t2=1;
           while (i < n)
        {
           
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            i++;
          }
           System.out.print(t1);
}
}