import java.io.*;
import java.util.*;
public class OddorEven{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        if(num%2==0)
        {
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given number in odd");
        }
    }
}