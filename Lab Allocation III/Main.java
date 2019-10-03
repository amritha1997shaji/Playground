import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          int L1=sc.nextInt();
          int L2=sc.nextInt();
          int L3=sc.nextInt();
        int n=sc.nextInt();
         int count=0;
           
          if(L1>=n)
            
          { 
            count++;
        
          }
         
       if(L2>=n)
          {
            count++;
        
          }
          if(L3>=n)
          {
            count++;
         
          }
          if((n>=L1)||(n>=L2)||(n>=L3))
          {
            count=0;
         
          }
         
            System.out.println(count);
}
}