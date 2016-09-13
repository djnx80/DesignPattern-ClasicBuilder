package my.djnx.designpatterns.entities;

public class Attribs {

	private String name;
	private int health;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public String toString() {
		return "Attribs [name=" + name + ", health=" + health + "]";
	}
	


}
