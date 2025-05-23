import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 
public class LambdaSortExample { 
public static void main(String[] args) { 
List<String> fruits = new ArrayList<>(); 
fruits.add("Banana"); 
fruits.add("Apple"); 
fruits.add("Orange"); 
fruits.add("Mango");
fruits.add("Grapes"); 
System.out.println("Before sorting: " + fruits); 
Collections.sort(fruits, (s1, s2) -> s1.compareTo(s2)); System.out.println("After sorting: " + fruits); 
} 
} 
