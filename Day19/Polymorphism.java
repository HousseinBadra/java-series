package Day19;

class Device {
    void run() {
        System.out.println("Device running");
    }
}

class MobilePhone extends Device {
    void run() {
        System.out.println("Mobile Phone running");
    }

    String model() {
        return this.toString();
    }
}

class Laptop extends Device {
    void run() {
        System.out.println("Laptop running");
    }

    String model() {
        return this.toString();
    }
}

public class Polymorphism {
    public static void main(String args[]) {
        int[] orders = { 1, 1, 0, 1, 1, 0, 0, 1, 0, 0 };

        Device[] devices = new Device[10];

        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == 1) {
                devices[i] = new MobilePhone();
            } else {
                devices[i] = new Laptop();
            }
        }

        // 
        Device laptop = new Laptop();
        laptop.run();
        // this will throw an error
        laptop.model();
        // same object diffrent refrence
        Laptop lapt = (Laptop) laptop;
        lapt.model();
    }
}