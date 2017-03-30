public class W07Practical1 {
	
	public static final int ATTENDEECOLS = 3;            //For array dimensions, column for name, email, and student status
	public static final int PRESENTERCOLS = 7;           //I use this constant for the column dimension of the workshop array. in order to store all the information, I made several columns
	public static final int MAXATTENDEES = 20;
	public static final int MAXPRESENTERS = 10;
	
	
	public static int numberOfAttendees() {             //I couldn't find a way for the print methods to calculate the rows as they were input, so I just asked the user initially
		int numberOfAttendees = 0;                     //A lot of these types of things will be initializations for variables to come
		int valid = 1;
		
		System.out.println("Please enter the number of attendees coming to this workshop: ");
		System.out.println();
		
		while (valid != 0) {             //to repeat in case input was out of allowed bounds
			numberOfAttendees = EasyIn.getInt();
			if (numberOfAttendees < 1) {
				System.out.println("Invalid Input, please try again");
				System.out.println();
			}
			if(numberOfAttendees > 20) {
				System.out.println("Invalid Input, only 20 Attendees are permitted, please try again: ");
				System.out.println();
			}
			else {
				valid = 0;
			}
			break;
		}
		return numberOfAttendees;	//returns valid number within bounds
	}
	
	public static String[][] attendeeListInput() {           //allows user to input attendees as well as their attributes, one attendee at a time
		int i = 1;
		int x = MAXATTENDEES;
		String[][] attendeeListInput = new String[i][ATTENDEECOLS];
		String[][] attendeeList = new String[x][ATTENDEECOLS];
			for (int j = 0; j < i; j++) {	
				Attendee NewAttendee = new Attendee();
				attendeeList[j][0] = NewAttendee.attendeeName();
				attendeeList[j][1] = NewAttendee.attendeeEmail();
				attendeeList[j][2] = NewAttendee.studentString();
				System.out.println();
				
				if (i <= 20) {              //will only give you 20 rows to add attendees
					int valid;
					System.out.println("press 1 to add another attendee or 2 to return to menu: ");
					System.out.println();
					valid = EasyIn.getInt();
					
					if (valid == 1) {
						i++;                     //allows loop to continue
					}
					if (valid == 2) {
						j = i;                   //stops the loop and sets j value
						x = j;                   //sets x value for later use
					}
					if ((valid != 1) && (valid != 2)) {
						System.out.println("Invalid Input");
					}
				}
				else {
					System.out.println("You already have the max amount of attendees");
					j = i;
				}
			}
			attendeeListInput = attendeeList;
			return attendeeListInput;	
	}
	
	
	public static void printAttendeeList(String[][] attendeeListInput, int numberOfAttendees) {
		int i = (numberOfAttendees-1);                      //-1 because computers start with 0
		System.out.println();
		System.out.println("There will be " +numberOfAttendees +" attending");      //cheeky shortcut, but I wasn't able to tell the computer to get to this
		System.out.println();
		System.out.println("                  ATTENDEE LIST");
		System.out.println();
		System.out.println("Attendee Name     Email                      Student?");
		System.out.println();
		for (int j = 0; j <= i; j++) {
			System.out.print(attendeeListInput[j][0] +"       ");              //sets up rows of attendees with their attributes
			System.out.print(attendeeListInput[j][1] +"       ");
			System.out.print(attendeeListInput[j][2]);
			System.out.println();
		}
	}
	
	public static void printWorkshop() {                                    //allows user to input and print all workshop info
		boolean valid = false;                                              //in case invalid input, loops to beginning
		while (valid == false) {

			Workshop workshopNew = new Workshop();                           //new workshop object and the following attributes
			String workshopTitle = workshopNew.workshopTitle();
			System.out.println();
			int workshopDay = workshopNew.workshopDay();
			int workshopMonth = workshopNew.workshopMonth();
			int workshopYear = workshopNew.workshopYear();
			int workshopHour = workshopNew.workshopHour();
			int workshopMin = workshopNew.workshopMin();
			
			System.out.println(workshopTitle +"		on "+workshopDay +"/" +workshopMonth +"/" +workshopYear +"		at " +workshopHour +":" +workshopMin);	

			
			int continuar = 0;                                        //spanish for continue, I was runnin out of identifiers
			
			System.out.println("Press 1 to start over or 2 to continue: ");
			continuar = EasyIn.getInt();
			if (continuar == 1) {
				valid = false;
			}
			if (continuar == 2) {
				valid = true;
			}
			else {
				System.out.println("Invalid input");
			}
		}
	}
	
	public static int numberOfPresenters() {                            //same thing as before only with presenters
		int numberOfPresenters = 0;
		int number = 0;
		int valid = 1;
		
		System.out.println("Please enter the number of presenters coming to this presentation: ");
		System.out.println();
		
		while (valid != 0) {                                           //only allows number within bounds of project
			number = EasyIn.getInt();
			if (number < 1) {
				System.out.println("Invalid Input, please try again");
				System.out.println();
			}
			if(number > 10) {
				System.out.println("Invalid Input, only 10 Presenters are permitted, please try again: ");
				System.out.println();
			}
			else {
				valid = 0;
			}
			break;
		}
		
		numberOfPresenters = (number);
		return numberOfPresenters;	
	}
	
	public static String[][] presenterListInput() {                   //same as attendees, only inputs presenter and presentation values into presentation string
		int i = 1;
		int x = MAXPRESENTERS;
		String[][] presenterListInput = new String[i][PRESENTERCOLS];   //I found it difficult keeping track of one array and its row and cols, so I made another to set it equal to at the end of the method
		String[][] presenterList = new String[x][PRESENTERCOLS];
		int presenterFeeTotal = 0;
		int presentationDurationTotal = 0;                    //Initializing totals for addition
			for (int j = 0; j < i; j++) {	
				Presenter NewPresenter = new Presenter();              //creates new presenter on each line
				presenterList[j][0] = NewPresenter.presentationHour();  //allows user to input presentation/presenter attributes
				presenterList[j][1] = NewPresenter.presentationMin();
				int presentationDuration = NewPresenter.presentationDuration();     //initializing integer duration for addition in for loop
				presenterList[j][2] = NewPresenter.presentationDurationStr(presentationDuration); //inputing duration into array to be printed as asked
				presentationDurationTotal = presentationDurationTotal + presentationDuration + 5; //duration total plus 5 between each one
				presenterList[j][3] = NewPresenter.presentationTitle();
				presenterList[j][4] = NewPresenter.presenterName();
				int presenterFee = NewPresenter.presenterFee();           //initializes fee 
				presenterFeeTotal = presenterFeeTotal + presenterFee;   //begins adding fees on each row
				System.out.println();
				
				if (i <= 10) {
					int valid;
					System.out.println("press 1 to add another presenter or 2 to return to menu: ");
					System.out.println();
					valid = EasyIn.getInt();
					
					if (valid == 1) {
						i++;                          //same thing as attendees, adds to top value so for can continue looping
					}
					if (valid == 2) {
						j = i;
						x = j;
					}
					if ((valid != 1) && (valid != 2)) {
						System.out.println("Invalid Input");
					}
				}
				else {
					System.out.println("You already have the max amount of presenters");
				}
			}
			System.out.println("the total presentation costs come out to £" +presenterFeeTotal);       //displays total fee payable for presenters
			System.out.println();
			System.out.println("the total workshop duration is" +presentationDurationTotal +" minutes");  //displays total workshop duration in minutes
			presenterListInput = presenterList;           //sets original two arrays equal and returns one, this is the only way i was able to do it
			return presenterListInput;	
	}
	
	public static void printPresenterList(String[][] presenterListInput, int numberOfPresenters) {    //prints array of workshop schedule and information
		int i = (numberOfPresenters-1);
		System.out.println();
		System.out.println("There will be " +numberOfPresenters +" attending");              //prints a nice array of the Workshop schedule, pretty neat!
		System.out.println("                  PRESENTER LIST");
		System.out.println();
		System.out.println("Time     Duration        Title                   Presenter");
		System.out.println();
		
		for (int j = 0; j <= i; j++) {
			System.out.print(presenterListInput[j][0] +":");             //first two array columns together make the time, then duration, then title, then presenter name
			System.out.print(presenterListInput[j][1] +"0      ");
			System.out.print(presenterListInput[j][2] +"       ");
			System.out.print(presenterListInput[j][3] +"       ");
			System.out.print(presenterListInput[j][4] +"       ");
			System.out.println();
			
			
		}
		
	}
	
	public static void main(String[] args) {
		int options = 0;
		boolean backToMain = true;
	       
		while (backToMain == true) {                //prints your options
			System.out.println();
			System.out.println("Welcome to Workshop Creator!");
			System.out.println();
			System.out.println("Press 1 to create Workshop, register Presentations, and view Workshop");
			System.out.println("Press 2 to register attendees");
			System.out.println("Press 3 to quit");
			options = EasyIn.getInt();
			if (options == 1) {         //allows you to do what the above says you can do
				System.out.println();
				printWorkshop();
				System.out.println();
				System.out.println("Next, please fill out the Presenters' information");
				System.out.println();
				int numberOfPresenters = numberOfPresenters();
				System.out.println();
				String[][] presenterListInput = presenterListInput();
				System.out.println();
				
				printPresenterList(presenterListInput, numberOfPresenters);			
			}
			if (options == 2) {                  //same thing as above
				System.out.println();
				int numberOfAttendees = numberOfAttendees();
				System.out.println();
				String[][] attendeeListInput = attendeeListInput();
				System.out.println();
				printAttendeeList(attendeeListInput, numberOfAttendees);
				
			}
			if (options == 3) {           //quits the program
				backToMain = false;
			}
			else {
				System.out.println("Invalid Input");
			}
		}
	}
}                       //thank you!