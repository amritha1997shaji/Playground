import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
       int ch=sc.nextInt();
         if(ch==100)
         {
           
          System.out.println("S");
         }
        
         
          else if((ch>=90)&&(ch<=99))
          {
            System.out.println("A");
          }  
            else if((ch>=80)&&(ch<=89))
          {
            System.out.println("B");
          }  
            else if((ch>=70)&&(ch<=79))
          {
            System.out.println("C");
          }  
            else if((ch>=60)&&(ch<=69))
          {
            System.out.println("D");
          }  
            else if((ch>=50)&&(ch<=59))
          {
            System.out.println("E");
          }  
 else  
          {
            System.out.println("F");
          }     
      
        
}
}