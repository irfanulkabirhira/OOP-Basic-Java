package OOP_Basic;

class ReturningValue {

    int square(int value) // retrun korbe ai type method
    {
        return value * value;

    }
}

public class ReturnValue_method {
    public static void main(String[] args) {
        ReturningValue ob1 = new ReturningValue(); // returingvalue class er 1 ta object
        System.out.println("Square of 5 = " + ob1.square(5));

        System.out.println("Square of 6 = " + ob1.square(6));

    }
}
