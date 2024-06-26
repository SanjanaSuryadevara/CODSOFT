import java.util.*;
public class sgc 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Let's calculate your grade !!");
        System.out.print("Enter the number of subjects you have : ");
        int No_of_Subjects=sc.nextInt();
        int s=0;
        for(int i=1;i<=No_of_Subjects;i++)
        {
            System.out.print("Subject "+i+" : ");
            int m=sc.nextInt();
            s=s+m;
        }
        int p=s/No_of_Subjects;
        char g;
        if(p>=81 && p<=100)
        {
            g='A';
        }
        else if(p>=61 && p<=80)
        {
            g='B';
        }
        else if(p>=46 && p<=60)
        {
            g='C';
        }
        else if(p>=35 && p<=45)
        {
            g='D';
        }
        else
        {
            g='F';
        }
        System.out.println("Total Marks : "+s);
        System.out.println("Average percentage : "+p);
        System.out.println("Grade : "+g);
    }
}
