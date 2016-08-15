import java.util.Scanner;

public class HotelOccupancy {

	public static void main(String[] args) {
		
		// Variables
		int floors;					// Floors
		int totalRooms = 0;			// Total Rooms
		int roomsOccupied = 0;		// Rooms Occupied
		
		Scanner kb = new Scanner(System.in);
		
		// Asks for levels input till positive
		do {
			System.out.print("Please enter a positive number of floors: ");	
			floors = kb.nextInt();												
		} while (floors < 1);	
		
		
		// Calculating Rooms vacancy by floor
		for (int i = 0; i < floors; i++ ) {
			
			int roomsThisFloor;				// Rooms on this iteration of the floor
			int occupiedRoomsThisFloor;		// Rooms on this iteration that are occupied
			
			// Asks for rooms on this floor input till greater than 9
			do {
				System.out.print("Please enter a number of rooms greater than 9: ");	
				roomsThisFloor = kb.nextInt();												
			} while (roomsThisFloor < 10);
			
			// Asks for rooms on this floor that are occupied input till greater than roomsThisFloor
			do {
				System.out.print("Please enter a number of rooms less than " + (roomsThisFloor + 1) + " and greater than -1: ");	
				occupiedRoomsThisFloor = kb.nextInt();												
			} while (occupiedRoomsThisFloor > roomsThisFloor || occupiedRoomsThisFloor < 0);	// roomsOnFloor > rooms occupied > -1 
			
			totalRooms += roomsThisFloor;											// Running count of all rooms
			roomsOccupied += occupiedRoomsThisFloor;								// Running count of all occupied rooms
		}
		
		int roomsVacant = totalRooms - roomsOccupied;								// Calculating the vacant rooms
			
		System.out.println("Hotel has " + totalRooms + " rooms");					// Display Total Rooms
		System.out.println("Hotel has " + roomsOccupied + " occupied rooms");		// Display Total Occupied Rooms
		System.out.println("Hotel has " + roomsVacant + " vacant rooms");			// Display Total Vacant Rooms
					
		double rate = ((double)roomsOccupied/totalRooms);											  // Make double and it works ??
		
		System.out.println("Hotel Occupancy rate is " + rate );									// Display Occupancy Rate
			
		kb.close();
	}

}
