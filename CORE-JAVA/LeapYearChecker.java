import java.util.Scanner; 
public class LeapYearChecker { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter a year: "); 
int year = scanner.nextInt();
// A year is leap if: 
// 1. Divisible by 400 OR
// 2. Divisible by 4 AND not divisible by 100 
if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) { System.out.println(year + " is a Leap Year."); 
} else { 
System.out.println(year + " is NOT a Leap Year."); 
} 
scanner.close(); 
} 
} 
