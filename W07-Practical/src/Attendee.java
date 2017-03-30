public class Attendee {
	String attendeeName = "";
	String attendeeEmail = "";
	boolean student = false;
	
	public String attendeeName() { 
		System.out.println("Please enter name of Attendee");
		attendeeName = EasyIn.getString();
		System.out.println("Attendee name: "+attendeeName);
		return attendeeName;
	}
	
	public String attendeeEmail() {
		System.out.println("Please enter Attendee's email");
		attendeeEmail = EasyIn.getString();
		System.out.println("Attendee " +attendeeName +"'s Email: " +attendeeEmail);
		return attendeeEmail;
	}
	
	public int attendeeCounter() {
		int studentCounter = 0;
		studentCounter++;
		System.out.println("I got here? " +studentCounter);
		return studentCounter;
	}
	
	public boolean student() {
		String command;
		boolean valid = false;                                              //in case invalid input, loops to beginning
		while (valid == false) {
			System.out.println("Is attendee a student?: yes or no");
			command = EasyIn.getString();
			if (command.equals("no")) {
				student = false;
				System.out.println("Attendee is not a student");
				valid = true;
			}
			if (command.equals("yes")) {
				attendeeCounter();
				student = true;
				System.out.println("Attendee is a student");
				valid = true;
			}
			if ((!command.equals("yes")) && (!command.equals("no"))) {
				System.out.println("Invalid input");
			}	
		}
		return student;
	}
	
	public String studentString() {
		String studentString = new String();
		student();
		studentString = Boolean.toString(student);
		return studentString;
	}
}