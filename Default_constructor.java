package OOP_Basic;

class heda {
    String name, gender;
    int phone;

    heda() // dafult constructor
    {
        System.out.println("No value");

    }

    heda(String n, String m, int ph) // perametrized constuctor
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

public class Default_constructor {

    public static void main(String[] args) {

        heda teacher1 = new heda("Irfanul kabir hira", "male", 1625980062);// teacher1 is an object
        teacher1.displayInformation();

        System.out.println("\n");

        heda teacher2 = new heda("Tasnuba humaira", "male", 1615099989);// teacher1 is an object
        teacher2.displayInformation();

        System.out.println("\n");

        heda teacher3 = new heda();
        teacher3.displayInformation();
    }
}
