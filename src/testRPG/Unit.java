package testRPG;

abstract public class Unit {
	private String name;
	private int hp;
	private int power;
	private int shield;
	
	protected Unit(String name, int hp, int power, int shield){
		this.name = name;
		this.hp = hp;
		this.power = power;
		this.shield = shield;
	}
	
	protected void Attack(Unit target) {
		
	}
	
}
