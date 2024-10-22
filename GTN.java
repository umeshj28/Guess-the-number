import java.util.Random;
import java.util.Scanner;

public class GTN {
    public static void main(String[] args) {
        Random random = new Random();
        int maxAttempts = 5;
        int currentAttempt = 0;
	int score = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Guess the Number game!");
        System.out.println("I have picked a mystery number between 1 to 100.");
	System.out.println("Can you guess it in " +maxAttempts+ " attempts?");
	System.out.println("Let the guessing game Begin!");
	
	while(true){
		int randomNumber = random.nextInt(100)+1;
		currentAttempt = 0;

        while (currentAttempt < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            currentAttempt++; 

            if (guess == randomNumber) {
                System.out.println("Congratulations! You cracked the correct number.");
		score+= maxAttempts - currentAttempt + 1;
                break;
            } else if (guess < randomNumber) {
                System.out.println("Nope, try going higher!");
            } else {
                System.out.println("Not quite, try going lower!");
            }
		
        }
        if(currentAttempt == maxAttempts){
		System.out.println("Sorry, you have run out of attempts!");
		System.out.println("The mystry number was: " + randomNumber);
		System.out.println("Better Luck Next Time!");
	}
	
	System.out.println("Score: "+ score);
	System.out.print("Want to play again? (Y/N): ");
	String playAgain = scanner.next();

	if(!playAgain.equalsIgnoreCase("Y")){
		break;
	}
}

      
        scanner.close();
    }
}
