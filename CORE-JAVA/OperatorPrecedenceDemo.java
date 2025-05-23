public class OperatorPrecedenceDemo { 
public static void main(String[] args) { 
int a = 10; 
int b = 5; 
int c = 2; 
int d = 8; 
int result = a + b * c - d / c; 
System.out.println("Expression: a + b * c - d / c"); 
System.out.println("Values: a=10, b=5, c=2, d=8"); 
System.out.println("Result: " + result); 
System.out.println(); 
System.out.println("Explanation of order of operations:"); 
System.out.println("1. Multiplication (*) and division (/) have higher precedence than addition (+) and subtraction (-)."); 
System.out.println("2. Operators with the same precedence are evaluated left to right."); 
System.out.println(); 
System.out.println("Step-by-step evaluation:"); 
System.out.println("b * c = 5 * 2 = 10"); 
System.out.println("d / c = 8 / 2 = 4"); 
System.out.println("Then, a + (b * c) - (d / c) = 10 + 10 - 4"); System.out.println("Finally, 10 + 10 - 4 = 16"); 
} 
}
