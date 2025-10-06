import java.util.ArrayList;

public class Main{
        /*
        1.e Skriv en Main klasse med en main-metode, hvor der oprettes en ArrayList,
        som du kalder 'customers'.
        (Du kan oprette instanserne først, og så add'e dem til listen.
        Du kan også instantiere og add'e i samme linie.)*/
    public static void main(String[] args) {

        /* -------------------------------------//-----------------------------------------------*/
        // 1.f Skriv en static metode i Main kaldet printCustomers(ArrayList customers),
        // hvor du printer alle kunderne ud ved at gennemløbe customers med et for each loop.
        // Test metoden fra main ved at kalde den med din ArrayList som argument.
        //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
        // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

        Customer c = new Customer("Bruce", "Wayne", "Batman");
        c.setFirstName("");

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(c);
        customers.add(new Customer("Tony", "Stark", "Iron man"));
        customers.add(new Customer("Barry", "Allen", "The Flash"));

        printCustomers(customers);
        c.setFirstName("Ken");

        printCustomers(customers);

        int count = Customer.getCounter();
        String name = c.getFirstname();

    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer cs : customers) {
            System.out.println(cs);
            /* -------------------------------------//-----------------------------------------------*/
        }
    }
}