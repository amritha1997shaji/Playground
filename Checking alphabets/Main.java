import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
        char ch=sc.nextLine().charAt(0);
         if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
         {
           
          System.out.println("Vowel");
         }
         
          else if(((ch>='a')||(ch>='A'))&&((ch<='z')||(ch<='Z')))
          {
            System.out.println("Consonant");
          }     
 else 
          {
            System.out.println("Not an alphabet");
          }     
        }
}