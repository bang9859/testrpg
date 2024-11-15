package testRPG;

import java.util.ArrayList;
import java.util.Random;

public class User {
	
	private int money = 100000;
	private int pos; // 던전 좌표
	static Random ran = new Random();

	private Guild guild = new Guild();
	public ArrayList<Player> guildList = guild.getGuildPlayerList();

	private Warrior warrior = new Warrior("전사", 150, 30, 0, 1, false);
	private Healer healer = new Healer("힐러", 100, 10, 0, 1, false);
	private Wizard wizard = new Wizard("마법사", 100, 50, 0, 1, false);
	private Tanker tanker = new Tanker("탱커", 300, 10, 0, 1, false);

	private User() {
		
	}
	
	private static User instance = new User();
	
	protected static User getInstance() {
		return instance;
	}
	
	
	public int getPos() {
		return pos;
	}
	
	public void setPos(int pos) {
		this.pos = pos;
	}
	
	public void defalutGuild() {
		// user가 처음 게임 입장시 생성되는 기본 길드
		guildList.add(warrior);
		guildList.add(healer);
		guildList.add(wizard);
		guildList.add(tanker);
	}
	
	
	

}
