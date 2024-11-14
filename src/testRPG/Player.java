package testRPG;

abstract public class Player extends Unit {
	private int exp;
	private int level;

	protected Player(String name, int hp, int power, int shield, int exp, int level) {
		super(name, hp, power, shield);
		this.exp = exp;
		this.level = level;
	}

	protected int getExp() {
		return exp;
	}

	protected void setExp(int exp) {
		this.exp = exp;
	}

	protected int getLevel() {
		return level;
	}

	protected void setLevel(int level) {
		this.level = level;
	}

	abstract protected void PlayerSkill();

}
