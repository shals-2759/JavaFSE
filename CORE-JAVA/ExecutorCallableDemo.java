import java.util.concurrent.*;
import java.util.*;

public class ExecutorCallableDemo {
    public static void main(String[] args) {
            ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Future<String>> futures = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            Callable<String> task = () -> {
                Thread.sleep(1000);
                return "Result from Task " + taskId;
            };

            Future<String> future = executor.submit(task);
            futures.add(future);
        }
        for (Future<String> future : futures) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}
