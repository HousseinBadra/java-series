package Day15;

class Human {
    int age;

    // default constructor
    Human() {
        age = 0;
    }

    // constructor with parameters
    Human(int age) {
        this.age = age;
    }

}

class Baby extends Human {

    Baby() {
        // super is called implicitly
        // super();

    }

    Baby(int age) {
        // super refers to the constuctor of the parent class
        // super(age) refers to calling the Human constructor with parameters
        // without it it will call the default constructor
        super(age);
    }

}

public class Super {
    public static void main(String args[]) {

        // this will call the default Baby constructor
        // which calls the default Human constructor implicitly
        Baby sam = new Baby();
        // this will call the Baby constructor with parameters
        // which calls the Human(int) constructor
        Baby leo = new Baby(3);
        System.out.println("hi");
    }
}
