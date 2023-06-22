package OOP_Basic;

class tuitor {
    String name, gender;
    int phone;

    void setInformation(String n, String m, int ph) {
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

public class Perametrized_Method {
    public static void main(String[] args) {
        tuitor teacher1 = new tuitor();
        teacher1.setInformation("Irfanul  kabir hira", "male", 12276463);
        teacher1.displayInformation();

        System.out.println("\n");

        tuitor teacher2 = new tuitor();
        teacher2.setInformation("Tasnuba HUmaira", "female", 12276463);
        teacher2.displayInformation();

    }

}
