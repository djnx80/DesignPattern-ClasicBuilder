package my.djnx.designpatterns.entities;

public class Weapon {

	private String name;
	private float damage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDamage() {
		return damage;
	}
	public void setDamage(float damage) {
		this.damage = damage;
	}
	
	
	
	@Override
	public String toString() {
		return "Weapon [name=" + name + ", damage=" + damage + "]";
	}
	
	
	
}
