package Day18;

class Prv {
    // private variable only can be used inside the same class
    private int test;

    // private method only can be used inside the same class
    private void test() {
        this.test = 1;
    }
}

class Plc {
    // public variable only can be used everywhere
    public int test;

    // public method only can be used everywhere
    public void test() {
        test = 1;
    }
}

class Dft {
    // default variable only can be used in the same package
    int test;

    // default method only can be used in the same package
    void test() {
        test = 1;
    }
}

class Ptc {
    // proteced variable only can be used in the same package also subclasses in
    // different packages
    protected int test;

    // proteced method only can be used in the same package also subclasses in
    // different packages
    protected void test() {
        test = 1;
    }
}

public class AccessModifiers {
    public static void main(String args[]) {
    }
}
