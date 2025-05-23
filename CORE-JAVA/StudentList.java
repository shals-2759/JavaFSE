import java.util.ArrayList; 
import java.util.Scanner; 
public class StudentList { 
public static void main(String[] args) { 
ArrayList<String> students = new ArrayList<>(); 
Scanner scanner = new Scanner(System.in); 
System.out.print("How many student names do you want to enter? "); int count = scanner.nextInt(); 
scanner.nextLine(); // Consume newline 
for (int i = 1; i <= count; i++) { 
System.out.print("Enter name of student " + i + ": "); 
String name = scanner.nextLine(); 
students.add(name); 
} 
System.out.println("\nList of students:"); 
for (String student : students) { 
System.out.println(student); 
} 
scanner.close(); 
} 
} 
