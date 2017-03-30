public class Workshop {
	String workshopTitle = "";
	int valid = 0;
	
	public String workshopTitle() {
		System.out.println("Please Please enter name of Workshop");
		workshopTitle = EasyIn.getString();
		return workshopTitle;
	}
	
	public int workshopDay() {
		int workshopDay = 0;
		int valid = 0;
		while (valid == 0) {
			System.out.println("Please enter the day of the month the workshop will occur on");
			workshopDay = EasyIn.getInt();
			
			if ((workshopDay > 31) || (workshopDay < 1)) {
				System.out.println("Invalid Input");	
			}
			else {
				valid = 1;
			}
		}
		return workshopDay;
	}
	
	public int workshopMonth() {
		int workshopMonth = 0;
		int valid = 0;
		while (valid == 0) {
			System.out.println("Please enter the month the workshop will occur on");
			workshopMonth = EasyIn.getInt();
			
			if ((workshopMonth > 12) || (workshopMonth < 1)) {
				System.out.println("Invalid Input");	
			}
			else {
				valid = 1;
			}
		}
		return workshopMonth;
	}
	
	public int workshopYear() {
		int workshopYear = 0;
		int valid = 0;
		while (valid == 0) {
			System.out.println("Please enter the Year the workshop will occur on");
			workshopYear = EasyIn.getInt();
			
			if ((workshopYear < 2015)) {
				System.out.println("That's already happened");	
			}
			else {
				valid = 1;
			}
		}
		return workshopYear;
	}
	

	public void workshopDate(int workshopDay, int workshopMonth, int workshopYear) {
		System.out.println("The workshop will be held on " +workshopDay +"/" +workshopMonth +"/" +workshopYear);
	}
		
	public int workshopHour() {
		int workshopHour = 0;
		int valid = 0;
		while (valid == 0) {
			System.out.println("Please enter the hour workshop will occur on");
			workshopHour = EasyIn.getInt();
			
			if ((workshopHour < 0) || (workshopHour > 24)) {
				System.out.println("Invalid input");	
			}
			else {
				valid = 1;
			}
		}
		return workshopHour;
	}
	public int workshopMin() {
		int workshopMin = 0;
		int valid = 0;
		while (valid == 0) {
			System.out.println("Please enter the minute workshop will occur on");
			workshopMin = EasyIn.getInt();
			
			if ((workshopMin < 0) || (workshopMin > 60)) {
				System.out.println("Invalid input");	
			}
			else {
				valid = 1;
			}
		}
		return workshopMin;
	}
	public void workshopTime(int workshopHour, int workshopMin) {
		System.out.println(workshopHour+":"+workshopMin);
	}
	
	
}