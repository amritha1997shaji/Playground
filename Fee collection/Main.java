import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
         float b=sc.nextFloat();
          int c=sc.nextInt();
         int d=sc.nextInt();
         
          float e;
          
          if((a.equalsIgnoreCase("MSDS")))
          {
            e=b+c;
          System.out.printf("%.2f",e);
          }
          else if((a.equalsIgnoreCase("MSH")))
          {
           e=b+d;
          System.out.printf("%.2f",e);
          }
           else if((a.equalsIgnoreCase("MGSDS")))
          {
           e=(150*b)/100+c;
          System.out.printf("%.2f",e);
          }
          else if((a.equalsIgnoreCase("MGSH")))
          {
           e=(150*b)/100+d;
          System.out.printf("%.2f",e);
          }
        
}
}