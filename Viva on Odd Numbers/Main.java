import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
   float score=0.0f;
      int count=0;
      int n;
      do
      {
         n=sc.nextInt();
        if(n%2==1)
        {
          count++;
          score++;
        }
       else if(n<0)
        {
          score=(float)(score-1);
        }
        else
        {
        score=(float)(score-0.5);
      } 
      }while (n>0&&count!=3);
          System.out.println(score);
      }
    }

        
        