public class Presenter {
	String presenterName = "";
	String presenterAffiliation = "";
	int presenterFee = 0;
	
	public static String presenterName() { 
		System.out.println("Please enter name of Presenter");
		String presenterName = EasyIn.getString();
		return presenterName;
	}
	
	public static String presenterAffiliation() {
		String presenterAffiliation = "";
		System.out.println("Please enter Presenter's affiliation");
		presenterAffiliation = EasyIn.getString();
		return presenterAffiliation;
	}
	
	public static int presenterFee() {
		System.out.println("Please enter the Presenter's fee");
		int presenterFee = EasyIn.getInt();
		return presenterFee;
	}
	
	public static String presenterFeeStr(int presenterFee) {
		String presenterFeeStr = Integer.toString(presenterFee);
		return presenterFeeStr;
	}
	
	public static String presentationTitle() {
		String presentationTitle = "";
		System.out.println("Please enter name of Presentation: ");
		presentationTitle = EasyIn.getString();
		System.out.println(presentationTitle);
		return presentationTitle;
	}
	
	public static int presentationDuration() {
		int presentationDuration = 0;
		System.out.println("Please enter the Presentation Duration");
		presentationDuration = EasyIn.getInt();
		return presentationDuration;
	}
	
	public static String presentationDurationStr(int presentationDuration) {
		System.out.println("Please enter the Presentation Duration");
		String presentationDurationStr = Integer.toString(presentationDuration);
		return presentationDurationStr;
	}
	
	public static final int PRESENTERCOLS = 3;
	
	public static final int MAXPRESENTERS = 10;
	
	public static String presentationHour() {
		int presentationHour1 = 0;
		int valid = 0;
		while (valid == 0) {
			System.out.println("Please enter the hour presentation will occur on");
			presentationHour1 = EasyIn.getInt();
			
			if ((presentationHour1 < 0) || (presentationHour1 > 24)) {
				System.out.println("Invalid input");	
			}
			else {
				valid = 1;
			}
		}
		String presentationHour = Integer.toString(presentationHour1);
		return presentationHour;
	}
	
	public static String presentationMin() {
		int presentationMin1 = 0;
		int valid = 0;
		while (valid == 0) {
			System.out.println("Please enter the minute presentation will occur on");
			presentationMin1 = EasyIn.getInt();
			if ((presentationMin1 < 0) || (presentationMin1 > 60)) {
				System.out.println("Invalid input");	
			}
			else {
				valid = 1;
			}
		}
		String presentationMin = Integer.toString(presentationMin1);
		if (presentationMin.equals("0")) {
			presentationMin = presentationMin +"0";
		}
		return presentationMin;
	}
}
