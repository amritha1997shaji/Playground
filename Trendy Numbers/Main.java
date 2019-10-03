import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      int a=0;
      int b=0;
      while(n!=0)
      {
        n=n/10;
        count++;
      }
       if((count==3))
       {
        
       
        if(((n%100)/10)%3==0)
          {
         System.out.println("Trendy Number");
       } 
         else
            {
         System.out.println("Not a Trendy Number");
       }
       }
          else
            {
         System.out.println("Not a Trendy Number");
       }
       }
}