import java.util.Scanner;
/**
 * Staff class describes waiter/waitress, chef or executive.
 * 
 * @author Churchill Lee
 * @version 0.01
 */
public class Staff
{
	public enum Position { SERVER, CHEF, EXECUTIVE }
	private String name;
	private String id;
	private Position position; // 'W' for waiter/waitress; 'C' for chef; 'E' for Executive;
	public static int count;

	public Staff(String name, Position position)
	{
		this.name = name;
		this.position = position;

		switch(this.position) {
			case SERVER:
				this.id = "W" + count;
			case CHEF:
				this.id = "C" + count;
			case EXECUTIVE:
				this.id = "E" + count;
		}

	}

	public Staff(String name)
	{
		Staff(name, SERVER);
	}

	// Getter
	public String getName() { return this.name; }
	public String getID() { return this.id; }
	public Position getPosition() { return this.position; }

	// Setter
	public void setName(String name) { this.name = name; }
	public void setID(String id) { this.id = id; }
	public void setPosition(Position position) { this.position = position; }

	// Print methods
	public void printMe()
	{
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Position: " + position);
		System.out.println();
	}
}