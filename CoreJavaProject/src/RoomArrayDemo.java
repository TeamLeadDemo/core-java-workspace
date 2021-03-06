
public class RoomArrayDemo {

	public static void main(String[] args) {
		Room myRoom = new Room(500, 300, 100); // room object is created here
		
		int[] allMarks = new int[3];
		Room[] allRooms = new Room[3]; // here array of 3 room references is created
		
		//System.out.println(allRooms[0].length); // will give nullpointer exception
		allRooms[0] = new Room(200, 100, 50);
		allRooms[1] = new Room(400, 200, 150);
		allRooms[2] = new Room(300, 100, 50);

		Room[] hallRooms = { new Room(30,20,10), new Room(50,30,20), new Room(70,30,20)}; // initializing
		
	}

}
