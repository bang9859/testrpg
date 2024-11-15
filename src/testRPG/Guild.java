package testRPG;

import java.util.ArrayList;

public class Guild {
	// 길드 생성 시 정해진 길드인원이 참인 인원들만 가능
	private  ArrayList<Player> guildPlayerList = new ArrayList<Player>();

	public ArrayList<Player> getGuildPlayerList() {
		return guildPlayerList;
	}

	public void setGuildPlayerList(ArrayList<Player> guildPlayerList) {
		this.guildPlayerList = guildPlayerList;
	}
	
	
	

}
