public class ThreadExample {

    public static void main(String[] args) {
        // Create Thread 1 for Fibonacci series
        Thread fibonacciThread = new Thread(new FibonacciRunnable());
        fibonacciThread.start();

        // Create Thread 2 for reverse order
        Thread reverseOrderThread = new Thread(new ReverseOrderRunnable());
        reverseOrderThread.start();
    }

    // Runnable for Fibonacci series
    static class FibonacciRunnable implements Runnable {
        @Override
        public void run() {
            int n = 10; // Number of terms to display
            int a = 0, b = 1;
            System.out.println("Fibonacci Series:");
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
    }

    // Runnable for reverse order
    static class ReverseOrderRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Numbers in Reverse Order:");
            for (int i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
