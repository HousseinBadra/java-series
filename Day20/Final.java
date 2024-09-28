package Day20;

// final keyworld for a class means it can't be extended
final class A {
    // using final for a variable means its unmutable
    final int constant = 1;

    void test() {
        // this will throw an error
        constant = 2;
    }

}

// this will throw an error
class B extends A {

}

class C {
    // when a method is used with the final keyword it can't be overridden
    final void test() {
        return;
    }
}

class D extends C {

    // this will throw an error
    void test() {
        return;
    }
}

public class Final {
    public static void main(String args[]) {

    }
}
