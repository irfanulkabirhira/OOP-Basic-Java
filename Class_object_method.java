package OOP_Basic;

class Sir {
    String name, gender;
    int phone;

    /*
     * process of making Method
     * return type must use that is (void) here
     */
    void displayInformation() // return type function
    {
        System.out.println("Name=" + name);
        System.out.println("Male=" + gender);
        System.out.println("Phone=" + phone);
    }

}

public class Class_object_method {
    public static void main(String[] args) {
        Sir teacher1 = new Sir();// teacher1 is an object
        teacher1.name = "Irfanul kabir hira";
        teacher1.gender = "Male";
        teacher1.phone = 1615099989;
        teacher1.displayInformation();

        System.out.println("\n");

        Sir teacher2 = new Sir();// teacher2 is an object
        teacher2.name = "Humaira Tasnuba";
        teacher2.gender = "FeMale";
        teacher2.phone = 1615099989;
        teacher2.displayInformation();

    }

}
