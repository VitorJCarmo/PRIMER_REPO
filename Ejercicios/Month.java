package qaracter;

public class Month {
	public String name;
	public Integer days;
	
	public Month(String name, Integer days) {
		super();
		this.name = name;
		this.days = days;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	
}
