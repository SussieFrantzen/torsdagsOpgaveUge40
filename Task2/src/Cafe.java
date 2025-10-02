/* 2.c Create another class called Cafe. Give it an attribute called coffeeMenu
of type ArrayList<String> (later you will fill this ArrayList with the names of
the coffees from the textfile). Make the attribute private and write a getter-method
that returns the list.
-----------------------------------------------------/////--------------------------------------
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    private ArrayList<String> coffeeMenu = new ArrayList<>();

    /*-----------------------------------------////----------------------------------
                    2.c In the Cafe class add a method loadMenuData(). In the method make a
                    File-object representing the coffees.txt file like this:
                    File file = new File("coffees.txt") */
    void loadMenuData() {
               /* ------------------------------------------////----------------------------------
                2.d In this step you will read from the file, using a Scanner object:
                 Add the File instance to a new Scanner object. (This piece of code will need to be wrapped in a try -catch block)
                The solution to this step is given below, but give it a go before peeping. */

        try {
            File file = new File("dataFil/coffees");
            Scanner scan = new Scanner(file);

                      /* -------------------------------------------------////------------------------------------------
                        2.e Inside the try block from the last step, you will
                        now add this piece of code that loops over the lines of the textfile:
                        Use a while loop with the hasNextLine()
                        and nextLine() -methods called on the Scanner instance,
                        to loop over the lines of the file and add the lines to the coffees ArrayList in this class.
                        */

            while (scan.hasNext()) {
                coffeeMenu.add(scan.nextLine());
            }

            }
                catch (FileNotFoundException e) {
                    System.out.println("File not found. Check path and filename");
                    }
                 }

           public ArrayList<String> MenuCoffee() {
              return this.coffeeMenu;
              }
           /*-------------------------------------------------////------------------------------------------ */
}
