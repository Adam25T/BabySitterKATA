
public class BabySitter {
	private Integer myStartTime;
	private Integer myBedTime;
	private Integer myEndTime;
	
	public String getStartTime(){
		return myStartTime.toString();
	}
	public String getBedTime(){
		return myBedTime.toString();
	}
	public String getEndTime(){
		return myEndTime.toString();
	}
	
	
	public String calculateHoursFromStartToBedTime() {
		Integer result = 0;
		
		if(myStartTime < myBedTime)
			result = myBedTime - myStartTime;
		
		return result.toString();
	}
	            
	public String calculateHoursFromBedTimeToMidnight(){
		Integer result= 0;
		Integer temp = myBedTime;
		if(myBedTime < myStartTime)
			temp = myStartTime;
		if(temp < 12)
			result = 12 - temp;
		return result.toString();
	}
	
	BabySitter(Integer startTime, Integer bedTime, Integer endTime){
		myStartTime = startTime;
		myBedTime = bedTime;
		myEndTime = endTime;
	}
	
	
}
