import java.util.Scanner;

public class rockpaperscissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int player_Points = 0;
        int computer_Points = 0;

        System.out.println("How many rounds would you like to play?");
        double rounds = input.nextInt();
        double points_To_Win = Math.ceil(rounds/2);


        while (rounds != 0) {
            if (player_Points >= points_To_Win || computer_Points >= points_To_Win) {
                break;
            }
            System.out.println("Current Score: You " + player_Points + " - " + computer_Points
                    + " Computer");
            System.out.println("Choose your hand: \n(Enter the corresponding number.)"
                    + "\n0- Rock\n1- Paper\n2- Scissors");
            int user_Choice = input.nextInt();

            int computer_Choice = (int) ((Math.random() * 1000)%3);

            System.out.println("Computer hand: " + computer_Choice);

            if (computer_Choice == user_Choice) {
                System.out.println("It's a draw!");
            }
            else if (user_Choice == 0 && computer_Choice == 2) {
                System.out.println("You have this round!");
                player_Points++;
                rounds--;
            }
            else if (user_Choice == 1 && computer_Choice == 0) {
                System.out.println("Congratulation, you got this round!");
                player_Points++;
                rounds--;
            }
            else if (user_Choice == 2 && computer_Choice == 1) {
                System.out.println("Your point");
                player_Points++;
                rounds--;
            }
            else {
                System.out.println("My round!");
                computer_Points++;
                rounds--;
            }

        }

        if (player_Points > computer_Points) {
            System.out.println("You won the game! \nFinal Score: You "
                    + player_Points + " - " + computer_Points + " Computer");
        }
        else if (player_Points < computer_Points) {
            System.out.println("You lost! Better luck next time. \nFinal Score: Computer "
                    + computer_Points + " - " + player_Points + " You");
        }
        else {
            System.out.println("This match ended in a draw. \nFinal Score: You "
                    + player_Points + " - " + computer_Points + " Computer");
        }

    }

}