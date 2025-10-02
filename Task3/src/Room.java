// 3.a Create a class Room with the following attributes/fields
// (use appropriate types and make them private):
//numberOfLamps
//numberOfWindows

public class Room {

    private int numberOfLamps;
    private int numberOfWindows;

    /* --------------------------------------////----------------------------------*/

    // 3.b Create a constructor that populates (assigns values to) all the fields.

    public Room (int numberOfLamps, int numberOfWindows){
        this.numberOfLamps= numberOfLamps;
        this.numberOfWindows=numberOfWindows;
    }
    /* --------------------------------------////----------------------------------*/

   // 3.c As the fields of Room are private, create getter- and setter-methods for them.
   // Getter methods
       public int getNumberOfLamps() {
           return numberOfLamps;
       }
        public int getNumberOfWindows() {
            return numberOfWindows;
        }

        // Setter
        public void setNumberOfLamps(int newNumberOfLamps) {
            this.numberOfLamps = newNumberOfLamps;
        }
        public void setNumberOfWindows(int newNumberOfWindows) {
            this.numberOfWindows = newNumberOfWindows;
        }
    /* --------------------------------------////----------------------------------*/
}
