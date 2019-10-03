import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          int factorial=1;
          int n=sc.nextInt();
          int i=1;
           while (factorial < n)
        {
           i=i+1;
             factorial=factorial*i;
           }
           if(factorial==n)
           {
           System.out.print("Yes");
           }
          else
          
             {
           System.out.print("No");
           }
            
}
}