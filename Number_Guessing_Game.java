/**
 * 
 */
//Number Guesssing Game
import java.util.*;
public class Number_Guessing_Game
{
    public static void main(String[] args) 
    {
        int randomNum = (int)(Math.random()*100)+1;
        System.out.println("Random number is: " + randomNum);
        System.out.println("Welcome to Guess Number Game");
        System.out.println("You Will Be Asked To Guess A Number to Win the Game");
        System.out.println("You have Maximum 5 Attempt Limit");
        int k=5;
        while(k>0)
        {
            Scanner sc=new Scanner(System.in);
                //user must enter the guessed  number
                System.out.println("Enter a Guess Number between 1 to 100");
                int num=sc.nextInt();
                if((num==randomNum))
                {
                    System.out.println("\nOhhoooo !!! Congratulations You Won The Game.");
                    break;
                }
                else if(num>randomNum)
                {
                    System.out.println("Your guess was too high, Try Again");
                }
                else if(num<randomNum)
                {
                    System.out.println("Your guess was too low,Try again.");
                }
                else
                {
                    continue; //To avoid error in case of invalid input from user side
                }
            k--;
            if(k<=0)
            {
                System.out.println("Ohhh!! No , You ran out of lives.\n");
            }
        }
    }
}
