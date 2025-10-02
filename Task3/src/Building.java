
//3.d Create a class Building with the following fields
// (use appropriate types and make them private):

import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    /* --------------------------------------////----------------------------------*/

    //3.e Create a constructor that populates all the fields.

    public Building(ArrayList<Room>rooms, int numberOfFloors){
        this.rooms = rooms;
        this.numberOfFloors=numberOfFloors;

    }
    /* --------------------------------------////----------------------------------*/
   // 3.f As the fields of Building are private, create getters and setters for them.

    // Getter methods
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    // Setter
    public void setRooms(ArrayList<Room> newRooms) {
        this.rooms = newRooms;
    }
    public void setNumberOfFloors(int newNumberOfFloors) {
        this.numberOfFloors = newNumberOfFloors;
    }

    /* --------------------------------------////----------------------------------*/





    }
