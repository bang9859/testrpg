package testRPG;

abstract public class Monster extends Unit {

	protected Monster(String name, int hp, int power) {
		super(name, hp, power);

	}

	abstract protected void MonsterSkill();

}
