//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*Task 2: Load coffee menu for a cafe
In this program we will load a list of coffee names and display it to the user.
We will create a Cafe class which loads the list and a Main class which tests that the
Cafe class is working as expected.
------------------------------------------------------------/////------------------------------------------
 2.a In this repository you will find a file called coffees.txt.
 Open it and check that is contains 5 names for types of coffee.
 Download it or copy the text to a new text file and save it with the same name coffee.txt.
Remember to save it in the root of your project and not in the src folder with the .java files.

------------------------------------------------------------/////-------------------------------------------
 2.b Create a class called Main with a main-method. */

import java.util.ArrayList;

    public class Main {

        public static void main(String[] args) {

    /* ---------------------------------------------------------/////-------------------------------------------*/
            /* 2.g In the main-method create a new instance of
            the Cafe class and call it's loadMenuData() -method.*/

          Cafe Royal = new Cafe();
             Royal.loadMenuData();


      /*-------------------------------------------------------/////------------------------------------------- */


                /* 2.h Still in the main-method, print all the elements in
                the list coffeeMenu from the Cafe instance you just created.
                Hint
                Use the getter-method from the Cafe class to retrieve the list of coffees. Then use a
                for loop to iterate through the list and and print the names of the coffees one by one.
                 */
            for(String royalCoffeMenu : Royal.MenuCoffee()){

                    /* 2.h Still in the main-method, print all the elements in
                    the list coffeeMenu from the Cafe instance you just created.
                    Hint
                    Use the getter-method from the Cafe class to retrieve the list of coffees. Then use a
                    for loop to iterate through the list and and print the names of the coffees one by one.
                    */

                System.out.println(royalCoffeMenu);
            }
            /* ---------------------------------------------------------/////------------------------------------------- */

        }
    }

