package testRPG;

abstract public class Player extends Unit {
	private int exp;
	private int level;
	private boolean onParty;

	protected Player(String name, int hp, int power, int exp, int level, boolean onParty) {
		super(name, hp, power);
		this.exp = exp;
		this.level = level;
		this.onParty = onParty;
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

	protected boolean getOnParty() {
		return onParty;
	}

	protected void setOnParty(boolean onParty) {
		this.onParty = onParty;
	}

	abstract protected void PlayerSkill();
	
	@Override
	public String toString() {
		String info = String.format("[이름 : %s] [체력 : %d] [공격력 : %d] [파티참여 여부:%s]", getName(),getHp(),getPower(),getOnParty());
		return info;
	}
}
