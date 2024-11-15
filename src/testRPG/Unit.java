package testRPG;

abstract public class Unit {
	private String name;
	private int hp;
	private int power;

	protected Unit(String name, int hp, int power) {
		this.name = name;
		this.hp = hp;
		this.power = power;
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

	protected void Attack(Unit target) {

	}

}
