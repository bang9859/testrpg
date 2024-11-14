package testRPG;

abstract public class Unit {
	private String name;
	private int hp;
	private int power;
	private int shield;

	protected Unit(String name, int hp, int power, int shield) {
		this.name = name;
		this.hp = hp;
		this.power = power;
		this.shield = shield;
	}

	protected String getName() {
		return name;
	}


	protected int getHp() {
		return hp;
	}

	protected void setHp(int hp) {
		this.hp = hp;
	}

	protected int getPower() {
		return power;
	}

	protected void setPower(int power) {
		this.power = power;
	}

	protected int getShield() {
		return shield;
	}

	protected void setShield(int shield) {
		this.shield = shield;
	}

	protected void Attack(Unit target) {

	}

}
