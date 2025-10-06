/* 1.a Lav en klasse, Customer, med attributterne (felterne/instansvariablene):
String firstName, String lastName, String username, int id, static int counter */

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter =0;

    /* -------------------------------------//-----------------------------------------------*/
    // 1.b Klassen skal have en konstruktør, der tager kundens navn og brugernavn som parametre.

    public Customer(String firstName, String lastName, String userName) {
        setFirstName (firstName);
        setUserName (userName);
        setLastName (lastName);
        counter++;
        this.id = counter;

    }

    /* -------------------------------------//-----------------------------------------------*/
    // 1.c Sørg for at counter tælles op med 1, hver gang konstruktoren bliver kaldt.
    // Brug counter til at initialisere id
    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstName;
    }
        public void setFirstName(String firstName) {
            if(firstName != null && !firstName.equals(" ") && firstName.length() > 1) {
                this.firstName = firstName;
            }
        }

        public String getLastname() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        /* -------------------------------------//-----------------------------------------------*/
        // 1.d Giv klassen en toString() metode,
        // der printer kundens detaljer pænt ud.
        // Gør alle klassens felter private, og tilføj getters og setters.


        public String toString() {
            return "Navn: " + firstName + " " + lastName + ", username: " + userName;

            /* -------------------------------------//-----------------------------------------------*/
        }
}
