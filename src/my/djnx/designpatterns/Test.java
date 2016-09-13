package my.djnx.designpatterns;

import my.djnx.designpatterns.entities.Enemy;

public class Test {

	public static void main(String[] args){
		
		EnemyBuilder goblinBuilder = new CrazyGoblinBuilder();
		EnemyDirector goblinDirector = new EnemyDirector(goblinBuilder);
		goblinDirector.createEnemy();

		Enemy goblin = goblinDirector.getEnemy();
		System.out.println(goblin);

		EnemyBuilder orcBuilder = new OrcBuilder();
		EnemyDirector orcDirector = new EnemyDirector(orcBuilder);
		orcDirector.createEnemy();
		
		Enemy orc = orcDirector.getEnemy();
		System.out.print("\ntoString method:");
		System.out.println(orc);
		System.out.println("Attributes:");
		System.out.println("         Name: " + orc.getAttribs().getName());
		System.out.println("       Health: " + orc.getAttribs().getHealth());
		System.out.println("       Weapon: " + orc.getWeapon().getName());
		System.out.println("Weapon damage: " + orc.getWeapon().getDamage());
	}
}
