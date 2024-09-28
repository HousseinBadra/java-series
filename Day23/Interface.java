package Day23;

// Interface is like an abstract class where all methods are public and abstract
interface Device {
    // you can have static final variables
    int a = 1;
    void run();

    void restart();
}

interface Electronic {
    void charge();
}

// now Laptop needs to implement all the abstract methods or It will be abstract
// itself
// You an implement multiple interfaces
class Laptop implements Device, Electronic {
    public void run() {
        System.out.println("Running");
    }

    public void restart() {
        System.out.println("Restarting");
    }

    public void getManefacturingDate() {
        System.out.println("Manefacturing date");
    }

    public void charge() {
        System.out.println("charging");
    }
}

public class Interface {
    public static void main(String args[]) {

        Laptop B = new Laptop();
        B.run();
        B.charge();
        B.restart();

    }
}
