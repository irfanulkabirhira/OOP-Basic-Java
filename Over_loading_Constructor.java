package OOP_Basic;

class kutta {
    String name, gender;
    int phone;

    kutta() {
        System.out.println("No value");

    }

    kutta(String n, String m) {
        name = n;
        gender = m;
    }

    kutta(String n, String m, int ph) // Teacher is a special type of method which has no return type
    {
        name = n;
        gender = m;
        phone = ph;
    }

    void displayInformation() {
        System.out.println("Name=" + name);
        System.out.println("Male=" + gender);
        System.out.println("Phone=" + phone);

    }
}

public class Over_loading_Constructor {
    public static void main(String[] args) {

        kutta teacher1 = new kutta("Irfanul kabir hira", "male");// teacher1 is an object
        teacher1.displayInformation();

        System.out.println("\n");

        kutta teacher2 = new kutta("Tasnuba humaira", "male", 1615099989);// teacher1 is an object
        teacher2.displayInformation();

        System.out.println("\n");

        kutta teacher3 = new kutta();
        teacher3.displayInformation();
    }
}
