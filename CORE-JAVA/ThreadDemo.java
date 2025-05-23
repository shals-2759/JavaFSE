class MessagePrinter implements Runnable { 
private String message; 
private int times; 
public MessagePrinter(String message, int times) { 
this.message = message; 
this.times = times;
} 
@Override 
public void run() { 
for (int i = 0; i < times; i++) { 
System.out.println(message + " (Count: " + (i + 1) + ")"); 
try { 
Thread.sleep(500); 
System.out.println("Thread interrupted."); 
} 
} 
} 
} 
public class ThreadDemo { 
public static void main(String[] args) { 
Thread t1 = new Thread(new MessagePrinter("Thread 1 message", 5)); Thread t2 = new Thread(new MessagePrinter("Thread 2 message", 5)); 
t1.start(); 
t2.start(); 
} 
} 
