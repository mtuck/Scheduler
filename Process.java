
public class Process {
	String name;
	int priority;
	int time;
	int timeRemaining;
	
	Process(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "Process [name=" + name + "]";
	}
	
	
}
