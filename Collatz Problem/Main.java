import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       System.out.println(n);
      int i=0;
    while(n!=1)
    {
      if(n%2==1)
      {
        n=3*n+1;
     i++;
      }
        else
        {
          n=n/2;
           i++;
    }
      System.out.println(n);
}
       System.out.println(i);
      }
    
}