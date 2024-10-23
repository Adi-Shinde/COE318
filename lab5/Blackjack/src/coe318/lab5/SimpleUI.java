package coe318.lab5;
/**
 *
 * @author Aditya Shinde
 * 501189079
 * 
 */
import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        //FIX THIS
        System.out.println("------------\n"+"House holds: " +"\n------------"+ this.game.getHouseCards().toString());
        
        System.out.println("---------\n"+"You hold: " +"\n---------" + this.game.getYourCards().toString());
        
        System.out.println("\033[1mYour score is: " + this.game.score(this.game.getYourCards()) + "\033[0m"+"\n");

        
    }

  @Override
    public boolean hitMe() {
        //FIX THIS
        System.out.println("\nWould you like to hit? (y/n)");
        String input = user.nextLine();
        System.out.println();
        if(input.equals( "y")){
            return true;
        }
        return false;
    }

  @Override
    public void gameOver() {
        //FIX THIS
        int yourScore = this.game.score(this.game.getYourCards());
        int houseScore = this.game.score(this.game.getHouseCards());
        System.out.println("Game over! Your score was: " + yourScore);
        System.out.println("House score was: " + houseScore);
        if((yourScore) > 21){
            System.out.println("You lose!");
        }
        else if((houseScore) > 21){
            System.out.println("You win!");
        }
        else if(yourScore > houseScore ){
            System.out.println("You win!");
        }
        else if(yourScore < houseScore ){
            System.out.println("You lose!");
        }
        else{
            System.out.println("It's a tie!");
        }
    }

}