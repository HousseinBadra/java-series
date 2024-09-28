package Day25;

public class Annotations {
    public static void main(String args[]) {

    }

    // anotations give the compilter more context

    // override tells the compilter your overriding an method
    // if the method didn't exist earlier this will throw an error
    @Override
    public void run() {
        System.out.println("Running");
    }

    // Depeciated tells the compiler this is a depreciated method
    @Deprecated
    public void show() {
        System.out.println("Shwoing");
    }

}
