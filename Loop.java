import java.io.*;
class Loop{

    public static void main(String args[])
    {
      long n=35231;
      int i=0;
      int a[]= new int[10];
      a[0]=0;
      a[1]=0;
      a[2]=0;
      a[3]=0;
      a[4]=0;
     
             while(n!=0)
      {
         while(i<5)
         {
          
         long digit=n%10;
         int num= (int)digit;
            a[i]=num;
            i++;
         }
       
         n=n/10;
         System.out.println(n);
      }
      for(int j=0;j<5;j++)
      {
         System.out.println(a[j]);
      }
    }
}
