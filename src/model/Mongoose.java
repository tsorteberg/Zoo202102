package model;

/**
 * Mongoose class.
 * @author Tom Sorteberg
 * Exercise for CIS-175 Week 1.
 */
public class Mongoose {
	
	// Instance variables.
	private String name;
	private String color;
	private int age;
	
	/**
	 * Default constructor.
	 */
	public Mongoose() {
		super();
	}
	
	/**
	 * Primary constructor.
	 * @param name: Required string.
	 * @param color: Required string.
	 * @param age: Required integer.
	 */
	public Mongoose(String name, String color, int age) {
		super();
		this.setName(name);
		this.setColor(color);
		this.setAge(age);
	}

	/**
	 * Get method for name instance.
	 * @return: Returns a string.
	 */
	public String getName() {
		// Return statement.
		return name;
	}

	/**
	 * Set method for name instance.
	 * @param name: Required string.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get method for color instance.
	 * @return: Returns a string.
	 */
	public String getColor() {
		// Return statement.
		return color;
	}
	
	/**
	 * Set method for color instance.
	 * @param name: Required string.
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Get method for age instance.
	 * @return: Returns an integer.
	 */
	public int getAge() {
		// Return statement.
		return age;
	}
	
	/**
	 * Set method for age instance.
	 * @param age: Required integer.
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Default to string method.
	 */
	@Override
	public String toString() {
		// Return statement.
		return "Mongoose [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	/**
	 * speak method that returns animal sound.
	 * @return: Returns a string.
	 */
	public String speak() {
		// Return statement.
		return "Bark!";
	}
}