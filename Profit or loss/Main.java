import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
       float x=sc.nextFloat();
         float y=sc.nextFloat();       
          y=12*y;
          if(x==y)
          {
          System.out.println("No profit nor loss");
          }
          else if(y>x)
          {
           
          System.out.printf("Profit : Rs.%.2f",y-x);
          }
           else
          {
       
          System.out.printf("Loss : Rs.%.2f",x-y);
          }
        
}
}