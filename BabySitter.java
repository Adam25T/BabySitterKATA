//Adam Turner
//First TDD program
//Assumes times after midnight are 13, 14, 15, 16 for 1, 2, 3, 4 respectively
//Parameterized Constructor only

public class BabySitter {
	private Integer myStartTime;
	private Integer myBedTime;
	private Integer myEndTime;
	
	//Get
	public String getStartTime(){
		return myStartTime.toString();
	}
	public String getBedTime(){
		return myBedTime.toString();
	}
	public String getEndTime(){
		return myEndTime.toString();
	}
	
	//Postcondition: returns the number of hours babysitter should be paid
	// for from start time to bed time (12$/hr)
	public String calculateHoursFromStartToBedTime() {
		Integer result = 0;
		if(myStartTime < myBedTime)
			result = myBedTime - myStartTime;
		
		return result.toString();
	}
	
	//Postcondition: returns the number of hours babysitter should be paid for
	// from bed time to midnight (8$/hr)           
	public String calculateHoursFromBedTimeToMidnight(){
		Integer result= 0;
		Integer temp = myBedTime;
		if(myBedTime < myStartTime)
			temp = myStartTime;
		if(temp < 12)
			result = 12 - temp;
		return result.toString();
	}
	
	//Postcondition: returns the number of hours babysitter should be paid for 
	// from bed time to midnight (16$/hr)
	public String calculateHoursFromMidnightToEndTime(){
		Integer result = 0;
		Integer temp = 12;
		if(12 < myStartTime)
			temp = myStartTime;
		if(temp < myEndTime)
			result = myEndTime - temp;
		return result.toString();
	}
	
	//Postcondition: returns the total amount the baby sitter should be paid for the
	// night in dollars
	public String calculateTotalNightCharge(){
		String startToBed = calculateHoursFromStartToBedTime();
		String bedToMidnight = calculateHoursFromBedTimeToMidnight();
		String midnightToEnd = calculateHoursFromMidnightToEndTime();
		
		Integer startToBedInt = Integer.valueOf(startToBed);
		Integer bedToMidnightInt = Integer.valueOf(bedToMidnight);
		Integer midnightToEndInt = Integer.valueOf(midnightToEnd);
		
		Integer totalCharge = (startToBedInt * 12) + (bedToMidnightInt * 8) + (midnightToEndInt *16);
		
		return totalCharge.toString();
	}
	
	//Precondition: BabySitter parameterized constructor takes an integer startTime, an
	// integer bedTime, and an integer endTime
	//Postcondition: Instantiates BabySitter object and data members are set
	// myStartTime is assigned startTime, myBedTime is assigned bedTime,
	// and myEndTime is assigned endTime
	BabySitter(Integer startTime, Integer bedTime, Integer endTime){
		myStartTime = startTime;
		myBedTime = bedTime;
		myEndTime = endTime;
	}
	
	
}
