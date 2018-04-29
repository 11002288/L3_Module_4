package threads;

public class ThreadedReverseGreeting {
	// Write a program that creates a thread (Thread 1) that creates another thread
	// (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.
	public static void main(String[] args) {

		ThreadedReverseGreeting trg = new ThreadedReverseGreeting();

		Thread r1 = new Thread(() -> {
			trg.Threadmaker(50);
		});
		r1.start();
	}

	private void Threadmaker(int n) {
		// TODO Auto-generated method stub

		if (n <= 0) {

		} else {
			Thread t = new Thread(() -> {
				Threadmaker(n - 1);
				System.out.println("Hello from thread " + n);
				
			});
t.start();
		}

	}
}
