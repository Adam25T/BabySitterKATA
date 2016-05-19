
public class BabySitter {
	private Integer myStartTime;
	private Integer myBedTime;
	
	public String getStartTime(){
		return myStartTime.toString();
	}
	public String getBedTime(){
		return myBedTime.toString();
	}
	BabySitter(Integer startTime, Integer bedTime, Integer endTime){
		myStartTime = startTime;
		myBedTime = bedTime;
	}
	
	
}
