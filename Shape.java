//task-1
public abstract class Shape {
	//data field
	private String name;
//constructor
	public Shape(String name) {
		this.name = name;
	}
	//getter-setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//abstract method
	public abstract double area();
	public abstract double perimeter();
	
	

}
