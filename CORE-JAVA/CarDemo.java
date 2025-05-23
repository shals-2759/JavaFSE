class Car { 
String make; 
String model; 
int year; 
public Car(String make, String model, int year) { 
this.make = make; 
this.model = model; 
this.year = year; 
} 
public void displayDetails() { 
System.out.println("Car Make: " + make); 
System.out.println("Car Model: " + model); 
System.out.println("Year: " + year); 
} 
} 
public class CarDemo { 
public static void main(String[] args) { 
Car myCar = new Car("Toyota", "Camry", 2022); 
myCar.displayDetails(); 
} 
} 
