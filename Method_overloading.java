package OOP_Basic;

class overload {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add() {
        System.out.println("nothing to add");
    }

}

public class Method_overloading {
    public static void main(String[] args) {
        overload ob = new overload();
        ob.add();
        ob.add(5, 10);
        ob.add(6.5, 5.5);
        ob.add(5, 10, 20);
    }

}
