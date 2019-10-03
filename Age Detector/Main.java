import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          int b=sc.nextInt();
         int c=sc.nextInt();
            int a;
          if(c>b)
          {
            a=c-b;
          System.out.println(a);
          }
         
          else 
          {
           a=(100-b)+c;
          System.out.println(a);
          }
        
}
}