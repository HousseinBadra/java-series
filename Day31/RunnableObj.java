package Day31;

public class RunnableObj {
    public static void main(String args[]) {
        Runnable timer = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
            }
        };

        new Thread(timer).run();
    }
}
