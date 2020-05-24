import java.util.*;

public class Guess {
  public void GuessBegin(){
      Scanner keyboard = new Scanner(System.in);
      int correctNum = (int) (Math.random()*10+1);
      int attempts = 1;
      int playerGuess = 0;
      System.out.println(correctNum);
      System.out.println("Welcome to the guessing game. Please enter a number between 1-10");
      while(true){
        if(attempts == 1){
            System.out.println("What is your first guess?");
            playerGuess = keyboard.nextInt();
        }
        else{
            System.out.println("Try again");
            playerGuess = keyboard.nextInt();
        }
        if(playerGuess == correctNum){
            System.out.println("You've guessed correctly! It took you "+ attempts+" tries to get it");
            break;
        } else{
            attempts +=1;
        }
      }
  }
}