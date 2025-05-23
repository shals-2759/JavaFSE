import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Scanner; 
public class FileWriterExample { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter a string to write to the file: "); 
String input = scanner.nextLine(); 
FileWriter writer = null; 
try { 
writer = new FileWriter("output.txt"); 
writer.write(input); 
writer.flush(); // Ensures all data is written 
System.out.println("File written successfully to output.txt.");
} catch (IOException e) { 
System.out.println("Error: Unable to write to file. " + e.getMessage()); } finally { 
try { 
if (writer != null) writer.close(); 
scanner.close(); 
} catch (IOException e) { 
System.out.println("Error closing the writer."); 
} 
} 
} 
} 
