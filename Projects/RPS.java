package Projects;
import java.util.*;

public class RPS 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "Yes";

        do
        {
            System.out.println("Enter you move (Rock, Paper, Scissors): ");
            playerChoice = sc.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") &&
           !playerChoice.equals("paper") &&
           !playerChoice.equals("scissors"))
           {
            System.out.println("Invalid Choice");
            break;
           }

           computerChoice = choices[ran.nextInt(3)];
           System.out.println("Computer Choice: " + computerChoice);

           if(playerChoice.equals(computerChoice))
           {
                System.out.println("Its a Tie!");
           }
           else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) || 
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper")))  
            {
                System.out.println("You Win!");
                continue;
            }        
           else 
           {
            System.out.println("You Lose!");
           }

           System.out.println("Do you wanna play again? : ");
           playAgain = sc.nextLine().toLowerCase();

        } while(playAgain.equals("yes"));

        System.out.println("Thank you for Playing!");
        sc.close();
    }
}
