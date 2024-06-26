import java.util.*;
import java.util.Random;
public class ngg
{
    public static void main(String[] args)
    {
        Random r=new Random();
        int n=r.nextInt(200)+1;
        Scanner sc=new Scanner(System.in);
        int g,c=0;
        System.out.println("Welcome to the Number Guessing Game !!");
        System.out.println("Guess the Number between 1 and 200 : ");
        while(true)
        {
            g=sc.nextInt();
            if(g==n)
            {
                System.out.println("Yes, your guess is correct !! Good !!");
                System.out.println();
                System.out.println("You have taken "+c+" attempts to guess the number.");
                break;
            }
            else if(g<n)
            {
                System.out.println("Your guess is too low . Try again !!");
                c++;
            }
            else
            {
                System.out.println("Your guess is too high . Try again !!");
                c++;
            }
        }
    }
}