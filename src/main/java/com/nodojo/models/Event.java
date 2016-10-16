package event;

public class Event {

	private final long id;
	private final String name;
	private final String date;
	private final String address;
	
	public Event(long p_id,String p_name, String p_date, String p_address){
		this.id = p_id;
		this.name = p_name;
		this.date = p_date;
		this.address = p_address;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDate() {
		return date;
	}
	public String getAddress() {
		return address;
	}	
}
