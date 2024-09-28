package Day22;

// abstract class is like a template
abstract class Device {
    public abstract void run();

    public abstract void restart();
}

// now Laptop needs to implement all the abstract methods or It will be abstract
// itself
class Laptop extends Device {
    public void run() {
        System.out.println("Running");
    }

    public void restart() {
        System.out.println("Restarting");
    }

    public void getManefacturingDate() {
        System.out.println("Manefacturing date");
    }
}

public class Abstract {
    public static void main(String args[]) {

        // can't create instance of abstract class
        Device A = new Device();

        Device B = new Laptop();
        B.run();

    }
}
