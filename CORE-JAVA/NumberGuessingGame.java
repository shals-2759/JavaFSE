import java.util.Scanner; 
import java.util.Random; 
public class NumberGuessingGame { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
Random random = new Random(); 
int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100 
int userGuess = 0; 
int attempts = 0; 
System.out.println("Welcome to the Number Guessing Game!"); System.out.println("Guess a number between 1 and 100."); 
// Loop until the user guesses the correct number 
while (userGuess != numberToGuess) { 
System.out.print("Enter your guess: "); 
userGuess = scanner.nextInt(); 
attempts++; 
if (userGuess < numberToGuess) { 
System.out.println("Too low! Try again."); 
} else if (userGuess > numberToGuess) { 
System.out.println("Too high! Try again."); 
} else { 
System.out.println("Congratulations! You guessed the number in " + attempts + " attempts."); 
} 
} 
scanner.close(); 
} 
}
