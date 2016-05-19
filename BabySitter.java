
public class BabySitter {
	private Integer myStartTime;
	
	public String getStartTime(){
		return myStartTime.toString();
	}
	
	BabySitter(Integer startTime, Integer bedTime, Integer endTime){
		myStartTime = startTime;
	}
}
