import java.util.*;

class GuessTheNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int guess;
        int attempts = 0;

        int randomNumber = ran.nextInt(100)+1;
        
        System.out.println("Welcome to Guess The Number Game");
        System.out.println("I have guess a number between 1 to 100");
        System.out.println("Can you find it?? Let's Play");

        do{
            System.out.print("Enter Your Guess : ");
            guess = sc.nextInt();
            attempts++;

            if(guess > randomNumber){
                System.out.println("The Number is Too high!");
            } else if (guess < randomNumber){
                System.out.println("The Number is Too low");
            } else{
                System.out.println("Correct! You Guessed The Number! in " + attempts + " " +  "Attempts :)");
            }
        } while (guess != randomNumber);
    }
}