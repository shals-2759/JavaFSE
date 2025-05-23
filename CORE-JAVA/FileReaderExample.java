import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
public class FileReaderExample { 
public static void main(String[] args) { 
String fileName = "output.txt"; 
try (BufferedReader reader = new BufferedReader(new 
FileReader(fileName))) { 
String line; 
System.out.println("Contents of output.txt:"); 
while ((line = reader.readLine()) != null) { 
System.out.println(line); 
} 
} catch (IOException e) { 
System.out.println("Error reading the file: " + e.getMessage()); } 
} 
}
