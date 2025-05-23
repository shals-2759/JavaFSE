class Animal {
public void makeSound() { 
System.out.println("Animal makes a sound"); } 
} 
class Dog extends Animal { 
@Override 
public void makeSound() { 
System.out.println("Bark"); 
} 
} 
public class InheritanceDemo { 
public static void main(String[] args) { 
Animal genericAnimal = new Animal(); genericAnimal.makeSound(); 
Dog myDog = new Dog(); 
myDog.makeSound(); 
} 
} 
