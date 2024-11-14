package testRPG;

abstract public class Monster extends Unit{

	protected Monster(String name, int hp, int power, int shield) {
		super(name, hp, power, shield);
		
	}
	
	abstract protected void MonsterSkill();

}
