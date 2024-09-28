package Day13;

class Robot {
    private String model;

    // default constructor
    Robot() {
        // default model
        setModel("F-012");
    }

    // constructor with parameters made possible with method overloading
    Robot(String customModel) {
        // custom model
        setModel(customModel);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}

public class Constructor {
    public static void main(String args[]) {

        // constructor runs only once when the Instance is created
        // here the default constructor will be called
        Robot optimusPrime = new Robot();

        // As we passed a string argument the constructor with parameters will be
        // invoked
        Robot megatron = new Robot("P-105");

        return;
    }
}
