package testRPG;

public class Player extends Unit{
	private int exp ;
	private int level ;
	protected Player(String name, int hp, int power, int shield,int exp, int level) {
		super(name, hp, power, shield);
		this.exp = exp;
		this.level = level;
	}

}
