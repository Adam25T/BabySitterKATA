
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
	BabySitter(Integer startTime, Integer bedTime, Integer endTime){
		myStartTime = startTime;
		myBedTime = bedTime;
		myEndTime = endTime;
	}
	
	
}
