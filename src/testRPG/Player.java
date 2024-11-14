package testRPG;

abstract public class Player extends Unit {
	private int exp;
	private int level;
	private boolean onGuild;

	protected Player(String name, int hp, int power, int shield, int exp, int level, boolean onGuild) {
		super(name, hp, power, shield);
		this.exp = exp;
		this.level = level;
		this.onGuild = onGuild;
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

	protected boolean isOnGuild() {
		return onGuild;
	}

	protected void setOnGuild(boolean onGuild) {
		this.onGuild = onGuild;
	}

	abstract protected void PlayerSkill();

}
