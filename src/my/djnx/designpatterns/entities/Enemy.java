package my.djnx.designpatterns.entities;

public class Enemy {

	private Attribs attribs;
	private Weapon weapon;
	
	
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Attribs getAttribs() {
		return attribs;
	}
	
	public void setAttribs(Attribs attribs) {
		this.attribs = attribs;
	}

	@Override
	public String toString() {
		return "Enemy [attribs=" + attribs + ", weapon=" + weapon + "]";
	}
	
}
