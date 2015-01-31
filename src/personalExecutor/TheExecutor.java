package personalExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TheExecutor {
	public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            Runnable sound = new BackgroundSoundThread("I'm making sound " + i);
            executor.execute(sound);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
