package Day30;

class Timer extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {

                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }

}

public class Threads {
    public static void main(String args[]) {
        Timer A = new Timer();
        A.start();
    }
}
