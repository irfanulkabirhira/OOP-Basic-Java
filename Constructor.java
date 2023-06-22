package OOP_Basic;

class MAM {
    String name, gender;
    int phone;

    MAM(String n, String m, int ph) // Teacher is a special type of method which has no return type,constructor
    {
        name = n;
        gender = m;
        phone = ph;

    }

    void displayInformation() {
        System.out.println("Name=" + name);
        System.out.println("Gender=" + gender);
        System.out.println("Phone=" + phone);

    }
}

public class Constructor {

    public static void main(String[] args) {

        MAM teacher1 = new MAM("Irfanul kabir hira", "male", 014324342);// teacher1 is an object
        teacher1.displayInformation();

        System.out.println("\n");

        MAM teacher2 = new MAM("Tasnuba humaira", "male", 1615099989);// teacher1 is an object
        teacher2.displayInformation();
    }
}
