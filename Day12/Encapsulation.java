package Day12;

class Human {
    // here we decalre age as a private variable
    private int age;

    // we can get the value by using a getter
    // this might be useful as you may not allow everyone to access values
    // for example only hr can see employees age
    public int getAge() {
        return age;
    }

    // same applies for setter as you restrict mutating a variable to the setter
    // method
    // this allows to run validations
    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
    }
}

public class Encapsulation {
    public static void main(String args[]) {
        Human houssein = new Human();
        // this will throw an error as the variable is private
        // you only can access age by using a getter and setter
        houssein.age = 99;
        System.out.println(houssein.age);

        // the correct way to do it
        houssein.setAge(99);
        System.out.println(houssein.getAge());

        return;
    }
}
