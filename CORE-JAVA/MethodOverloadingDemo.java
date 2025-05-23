import java.util.Scanner; 
public class MethodOverloadingDemo { 
public void add(int a, int b) { 
int sum = a + b;
System.out.println("Sum of two ints: " + sum); 
} 
public void add(float a, float b) { 
float sum = a + b; 
System.out.println("Sum of two floats: " + sum); 
} 
public void add(int a, int b, int c) { 
int sum = a + b + c; 
System.out.println("Sum of three ints: " + sum); 
} 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
MethodOverloadingDemo obj = new MethodOverloadingDemo(); 
System.out.println("Choose the type of addition:"); 
System.out.println("1. Add two integers"); 
System.out.println("2. Add two floats"); 
System.out.println("3. Add three integers"); 
System.out.print("Enter your choice (1/2/3): "); 
if (scanner.hasNextInt()) { 
int choice = scanner.nextInt(); 
scanner.nextLine(); 
switch (choice) { 
case 1: 
System.out.print("Enter first integer: "); 
while (!scanner.hasNextInt()) { 
System.out.println("Invalid input! Please enter an integer."); scanner.next(); 
} 
int int1 = scanner.nextInt();
System.out.print("Enter second integer: "); 
while (!scanner.hasNextInt()) { 
System.out.println("Invalid input! Please enter an integer."); scanner.next(); 
} 
int int2 = scanner.nextInt(); 
obj.add(int1, int2); 
break; 
case 2: 
System.out.print("Enter first float: "); 
while (!scanner.hasNextFloat()) { 
System.out.println("Invalid input! Please enter a float number."); scanner.next(); 
} 
float float1 = scanner.nextFloat(); 
System.out.print("Enter second float: "); 
while (!scanner.hasNextFloat()) { 
System.out.println("Invalid input! Please enter a float number."); scanner.next(); 
} 
float float2 = scanner.nextFloat(); 
obj.add(float1, float2); 
break; 
case 3: 
System.out.print("Enter first integer: "); 
while (!scanner.hasNextInt()) { 
System.out.println("Invalid input! Please enter an integer."); scanner.next(); 
} 
int int3 = scanner.nextInt(); 
System.out.print("Enter second integer: "); 
while (!scanner.hasNextInt()) {
System.out.println("Invalid input! Please enter an integer."); 
scanner.next(); 
} 
int int4 = scanner.nextInt(); 
System.out.print("Enter third integer: "); 
while (!scanner.hasNextInt()) { 
System.out.println("Invalid input! Please enter an integer."); 
scanner.next(); 
} 
int int5 = scanner.nextInt(); 
obj.add(int3, int4, int5); 
break; 
default: 
System.out.println("Invalid choice! Please run the program again."); } 
} else { 
System.out.println("Invalid input! Please enter a number (1, 2, or 3)."); } 
scanner.close(); 
} 
} 
