import java.util.Scanner; 
public class ArraySumAverage { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
int n = 0; 
System.out.print("Enter the number of elements in the array: "); while (true) { 
if (scanner.hasNextInt()) { 
n = scanner.nextInt(); 
if (n > 0) { 
break; // valid input, exit loop 
} else {
System.out.print("Please enter a positive integer: "); 
} 
} else { 
System.out.print("Invalid input! Please enter an integer: "); scanner.next(); // discard invalid input 
} 
} 
int[] arr = new int[n]; 
System.out.println("Enter " + n + " integer elements:"); 
for (int i = 0; i < n; i++) { 
while (true) { 
if (scanner.hasNextInt()) { 
arr[i] = scanner.nextInt(); 
break; 
} else { 
System.out.print("Invalid input! Please enter an integer: "); scanner.next(); // discard invalid input 
} 
} 
} 
int sum = 0; 
for (int num : arr) { 
sum += num; 
} 
double average = (double) sum / n; 
System.out.println("Sum of array elements: " + sum); 
System.out.println("Average of array elements: " + average); 
scanner.close(); 
} 
}
