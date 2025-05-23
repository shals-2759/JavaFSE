import java.util.Scanner; 
public class Calculator { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first number: "); double num1 = scanner.nextDouble(); 
System.out.print("Enter the second number: "); double num2 = scanner.nextDouble();
System.out.println("Choose the operation:"); System.out.println("1. Add"); 
System.out.println("2. Subtract"); 
System.out.println("3. Multiply"); 
System.out.println("4. Divide"); 
System.out.print("Enter your choice (1/2/3/4): "); int choice = scanner.nextInt(); 
double result; 
String operation;
switch (choice) { 
case 1: 
result = num1 + num2; 
operation = "Addition"; 
break; 
case 2: 
result = num1 - num2; 
operation = "Subtraction"; 
break; 
case 3: 
result = num1 * num2; 
operation = "Multiplication"; 
break; 
case 4: 
if (num2 != 0) { 
result = num1 / num2; 
operation = "Division"; 
} else { 
System.out.println("Error: Cannot divide by zero."); scanner.close(); 
return; 
} 
break; 
default: 
System.out.println("Invalid choice."); 
scanner.close(); 
return; 
} 
System.out.println(operation + " result: " + result); 
scanner.close(); 
} 
}
