package testRPG;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestRPGSystem {
	private final int STRING = 1;
	private final int NUMBER = 2;

	private final int DUNGEON = 1;
	private final int SETTING = 2;
	private final int EXIT = 3;

	private final int GUILD = 1;
	private final int STORE = 2;
	private final int INVENTORY = 3;
	private final int SAVE = 4;
	private final int ROAD = 5;
	private final int BACK = 6;

	private final int GUILDLIST = 1;
	private final int PARTIESCHANGE = 2;
	private final int BACK_GUILD = 0;

	private boolean isRun = true;

	private StringBuffer buffer = new StringBuffer();
	protected static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	private User user = User.getInstance();

	private TestRPGSystem() {
	}

	private static TestRPGSystem instance = new TestRPGSystem();

	protected static TestRPGSystem getInstance() {
		return instance;
	}

	protected void run() {
		gameStartMessage();
		while (isRun) {
			Lobby();
		}
		printOut("게임을 종료합니다.");
	}

	private void Lobby() {
		LobbyMenu();
		int sel = (int) input("메뉴선택", NUMBER);
		if (sel == DUNGEON) {
			dengeon();
		} else if (sel == SETTING) {
			setting();
		} else if (sel == EXIT) {
			isRun = false;
		}

	}

	private void dengeon() {

	}

	private void setting() {
		printOut("=====[SETTING]=====");
		printOut("[1.길드관리] [2.상점] [3.인벤토리]");
		printOut("[4.저장] [5.로드] [6.종료] \n");
		int sel = (int) input("입력", NUMBER);
		if (sel == GUILD) {
			guild();
		} else if (sel == STORE) {
			store();
		} else if (sel == INVENTORY) {
			inventory();
		} else if (sel == SAVE) {
			save();
		} else if (sel == ROAD) {
			road();
		} else if (sel == BACK) {

		} else {
			System.err.println("유효하지 않은 입력값입니다.");
		}
	}

	private void road() {

	}

	private void save() {

	}

	private void inventory() {

	}

	private void store() {

	}

	private void guild() {
		showGuildMenu();
	}

	private void showGuildMenu() {
		printOut("=====[GUILD]=====");
		printOut("[1.길드원 목록] [2.파티원 교체] [0.뒤로가기]");
		int sel = (int) input("입력", NUMBER);
		if (sel == GUILDLIST) {
			for(int i=0;i<user.guildList.size();i++){
				printOut(user.guildList.get(i));
			}
		} else if (sel == PARTIESCHANGE) {
			
		} else if (sel == BACK_GUILD) {

		}

	}

	private void printOut(String msg) {
		buffer.setLength(0);
		buffer.append(msg + "\n");
		try {
			writer.append(buffer);
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void LobbyMenu() {
		printOut("=====[LOBBY]=====");
		printOut("[1.던전] [2.설정] [3.종료]\n");
	}

	private void gameStartMessage() {
		printOut("<<<더조은 RPG GAME>>>");
		printOut("시작하시려면 엔터를 눌러주세요.\n");
		while (true) {
			try {
				String input = reader.readLine();
				if (input.equals(""))
					break;
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		loading("게임 로딩중...\n", 1000);

	}

	private void loading(String msg, int time) {
		buffer.setLength(0);
		buffer.append(msg + "\n");
		try {
			writer.append(buffer);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Object input(String msg, int n) {
		buffer.setLength(0);
		buffer.append(msg + " : ");
		String input = "";
		try {
			writer.append(buffer);
			writer.flush();
			input = reader.readLine();

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (n == STRING) {
			return input;
		} else {
			int pick = -1;
			try {
				pick = Integer.parseInt(input);
			} catch (Exception e) {
				System.err.println("숫자만 입력가능합니다.");
			}
			return pick;
		}

	}
}
