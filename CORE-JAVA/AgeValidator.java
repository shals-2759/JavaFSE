import java.util.Scanner; 
class InvalidAgeException extends Exception { 
public InvalidAgeException(String message) { 
super(message); 
} 
}
public class AgeValidator { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter your age: "); 
try { 
int age = scanner.nextInt(); 
if (age < 18) { 
throw new InvalidAgeException("Age must be 18 or above to proceed."); 
} 
System.out.println("Access granted. You are eligible."); 
} catch (InvalidAgeException e) { 
System.out.println("Custom Exception Caught: " + e.getMessage()); } catch (Exception e) { 
System.out.println("Invalid input. Please enter a valid integer."); } finally { 
scanner.close(); 
} 
} 
} 
