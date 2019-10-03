import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
     Float x1=sc.nextFloat();
       Float y1=sc.nextFloat();
     Float x2=sc.nextFloat();
     Float y2=sc.nextFloat();
      Float m;
      m=(x1+x2)/2;
      Float n;
      n=(y1+y2)/2;
      
   
      System.out.println("Binoy's house is located at ("+m+","+n+")");
     
    }
}