package CoreJava;

public abstract class AbstractionExample {
	//Fields 
	private int id;
	private String name;
	private String address;
	// creating parameterized constructor 
	public AbstractionExample(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	// Create a Method
	public void mailCheck() {
	}
	
	@Override
	public String toString() {
		return "AbstractionExample [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	// Create Getter and Setter for if name and address
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	}