
// GUESSING GAME!
import java.util.Random;
import java.util.Scanner;

class Game{
    int n;

    Random r = new Random();
    public int generateNum(){// Generates Random number from 1 to 100
       return r.nextInt(1,101);
    }
    public int takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess Here: ");
        n=sc.nextInt();
        return n;
    }
    public boolean isCorrect(int n,int rn) { // Checks the Guessed Number
        if(n==rn) {
            return false;
        }
        else if(n<rn) {
            System.out.println("Too LOW!\n\nGuess Again ");
        }
        else
            System.out.println("Too HIGH!\n\nGuess Again ");
        return true;
    }
    void noOfGuess(int c) { // Counts the number of Guesses 
        System.out.println("You Guessed "+c+" Times");
    }

}//End of Class Game
public class Number_Game{
    public static void main(String[] args) {
        Game g = new Game();
        boolean a= true;
        int n;
        int count=0;
        int rn = g.generateNum();
        System.out.println("Welcome to Guess the Number game \n");

        System.out.println("Guess a number from 1 to 100 \nYou Will WIN! If you guessed right, under 10 attempts");

        while (a){
            n = g.takeUserInput();
            a = g.isCorrect(n,rn);
            count+=1;


        }
        if(count<11) {//Wining Condition
            System.out.println("You WON! Congratulations!");
            g.noOfGuess(count);

        }
        else {
            System.out.println("Nice Try!. \nBetter Luck Next Time! ");

        }

    }// End of main
}// End of Guess
