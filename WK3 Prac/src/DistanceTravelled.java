import java.util.Scanner;

public class DistanceTravelled {

	public static void main(String[] args) {
		
		// Variables
		int speed;		// X miles per hour
		int time;		// X hours

		Scanner kb = new Scanner(System.in);
		
		// Asks for speed input till positive
		do {
			System.out.print("Please enter a positive number of MPH: ");	
			speed = kb.nextInt();												
		} while (speed < 0);	
		
		// Asks for hour input till positive
		do {
			System.out.print("Please enter a positive number of hours: ");	
			time = kb.nextInt();												
		} while (time < 1);	

		// Setting up the output
		System.out.println("Hour      Distance Traveled");
		System.out.println("---------------------------");
		
		// Looping through the distance calcs
		for (int i = 1; i < time+1; i++) {	// time plus one for off by one error when looping
			System.out.println(i + "         " + (speed * i));
		}
		
		kb.close();
	}

}
