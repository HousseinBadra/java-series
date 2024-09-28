package Day32;

class Counter {
    int c = 0;

    public void increment() {
        c++;
    }
}

public class ThreadSafety {
    public static void main(String args[]) {

        Counter C = new Counter();
        Runnable A = () -> {
            for (int i = 0; i < 100000; i++) {
                C.increment();
            }
        };
        Runnable B = () -> {
            for (int i = 0; i < 100000; i++) {
                C.increment();
            }
        };

        Thread th1 = new Thread(A);
        Thread th2 = new Thread(B);

        th1.run();
        th2.run();

        System.out.println(C.c);
    }

}
