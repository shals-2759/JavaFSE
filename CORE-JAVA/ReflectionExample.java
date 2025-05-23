import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("SampleClass");
            Object obj = cls.getDeclaredConstructor().newInstance();
            Method[] methods = cls.getDeclaredMethods();

            System.out.println("Methods in SampleClass:");
            for (Method method : methods) {
                System.out.print("Method: " + method.getName() + "(");
                Parameter[] parameters = method.getParameters();
                for (int i = 0; i < parameters.length; i++) {
                    System.out.print(parameters[i].getType().getSimpleName());
                    if (i < parameters.length - 1) System.out.print(", ");
                }
                System.out.println(")");
            }
            Method greetMethod = cls.getDeclaredMethod("greet");
            greetMethod.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
