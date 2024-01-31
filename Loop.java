import java.io.*;
class Loop{

    public static void main(String args[])
    {
      long n=35231;
      String s=n.toString(n);
      long a[]= new long [s.length];
      while(n!=0)
      {
         long digit=n%10;
         for(int i=0;n!=0;i++)
         {
            a[i]=digit;
         }
         n=n/10;

         
      }
      for(int i=0;i<a.length;i++)
      {
      System.out.println(a[i]);
      }
   
    }
}
