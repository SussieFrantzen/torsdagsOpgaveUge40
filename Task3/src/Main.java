
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//This task is an excercise in accessing fields in objects within objects.
// You will create a building with some rooms. Each room will have some attributes
// which you will access (read the value of) in order to determine how many windows
// and lamps are in the building.
// The diagram below shows the attributes and method signatures referred
// to in steps 3.a t 3.f.

        /* --------------------------------------////----------------------------------*/

        //3.g Create a class Main with a main-method. In your main-method,
        // instantiate at least three different rooms.

  import java.util.ArrayList;

    public class Main {

        public static void main(String[] args) {
            Room bathroom = new Room(1, 0);
            Room livingroom = new Room(5, 5);
            Room bedroom = new Room(4, 3);


            /* --------------------------------------////----------------------------------*/

            // 3.h Add the three rooms to a collection (preferably of the same data
            // type used for the "rooms" field in your class Building).
            ArrayList<Room> rooms;
            rooms = new ArrayList<>();
            rooms.add(bathroom);
            rooms.add(livingroom);
            rooms.add(bedroom);


        /* --------------------------------------////----------------------------------*/

        //3.i In your main-method, instantiate a new building with the
        // rooms you created in 3.h.

        Building house = new Building(rooms, 1);


        roomCount(house);
        isNormal(house);

        System.out.println("There is " + roomCount(house) + " rooms in the house");

        /* --------------------------------------////----------------------------------*/

    }
        // 3.j Create a static method in Main called countLampsInBuilding()
        // that takes an object of type Building and returns the total number
        // of lamps in the entire building.

        // counting of lamps in the house:

        public static int countLampsInBuilding(Building house) {
            int sumLamps = 0;

            for (Room rooms : house.getRooms()) {
                sumLamps += rooms.getNumberOfLamps();
            }
            return sumLamps;

        }
        // counting of windows in the house:

        public static int countWindowsInBuilding(Building house){
                int sumWindows = 0;

                for (Room rooms : house.getRooms()) {
                    sumWindows += rooms.getNumberOfWindows();
                }
                return sumWindows;

            }
        // counting of rooms in the house:
            public static int roomCount(Building house) {
                int sumRooms = 0;

                for (Room rooms : house.getRooms()) {
                    sumRooms += 1;
                }
                return sumRooms;

            }
         /* --------------------------------------////----------------------------------*/

        //3.k create another static method in Main called isNormal()
        // that takes an object of type Building as argument. The method should return true
        // if the building's number of floors is less than or equal to it's number of rooms.
        // If not it should return false.
        //Test this method from your main using both a normal and a anormal building.


        public static boolean isNormal(Building house){
            if(house.getNumberOfFloors() <= roomCount(house)){
                System.out.println("true"+ " there is " + house.getNumberOfFloors() +" Floors in the building ");
                return true;
                    }else
                        {
                        System.out.println("false");
                        return false;
                        }
                }
         /* --------------------------------------////----------------------------------*/
    }





