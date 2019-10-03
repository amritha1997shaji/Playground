import java.io.BufferedReader;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
     BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
      char a=br.readLine().charAt(0);
      System.out.printf("%d",(int)a);
      
    }
}