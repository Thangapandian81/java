import java.io.*;
import java.util.*;
class Student {
    int roll_no;
    String stud_name;
    int m1,m2,m3,sum;
    float avg;
    Scanner s=new Scanner(System.in);
    void input(){
        System.out.println("Enter the student name");
        stud_name=s.nextLine();
        System.out.println("Enter the student roll_no");
        roll_no=s.nextInt();
        System.out.println("Enter the student mark one by one");
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
    }
    Student cal(Student o){
        Student temp = new Student();
        if(o.roll_no==roll_no && o.stud_name.equalsIgnoreCase(stud_name)){
            temp.roll_no=o.roll_no;
            temp.stud_name=o.stud_name;
            temp.sum=(o.m1+o.m2+o.m3+m1+m2+m3);
            temp.avg=(o.m1+o.m2+o.m3+m1+m2+m3)/3;
        }
        else{
            System.out.println("The student roll_no or student name mismatch please check it");
        }
        return temp;

    }
    public static void main(String args[])
    {
        Student stud= new Student();
        stud.input();
        Student stud1= new Student();
        stud1.input();
        Student stud2 = new Student();
        stud2=stud.cal(stud1);
        System.out.println("The student roll_no is:" + stud2.roll_no);
        System.out.println("The student name is:" + stud2.stud_name);
        System.out.println("The student total is:" + stud2.sum);
        System.out.println("The student average is:" + stud2.avg);
    }
}