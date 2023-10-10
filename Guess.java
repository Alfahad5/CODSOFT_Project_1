package Games;
// GUESSING GAME!
import java.util.Random;
import java.util.Scanner;

class Game{
    int n;

    Random r = new Random();
    public int generateNum(){
       return r.nextInt(1,100);
    }
    public int takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess Here: ");
        n=sc.nextInt();
        return n;
    }
    public boolean isCorrect(int n,int rn) {
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
    void noOfGuess(int c) {
        System.out.println("You Guessed "+c+" Times");
    }

}
public class Guess {
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
        if(count<11) {
            System.out.println("You WON! OMEDETO!");
            g.noOfGuess(count);

        }
        else {
            System.out.println("SED! You Loose. \nBetter Luck Next Time! ");

        }

    }
}
