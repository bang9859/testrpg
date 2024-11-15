package testRPG;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestRPGSystem {
	private final int STRING = 1;
	private final int NUMBER = 2;

	private TestRPGSystem() {
	}

	private StringBuffer buffer = new StringBuffer();

	protected static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	private static TestRPGSystem instance = new TestRPGSystem();

	protected static TestRPGSystem getInstance() {
		return instance;
	}

	protected void run() {
		gameStartMessage();

//		while(isRun) {
//			
//		}
	}

	private void gameStartMessage() {
		buffer.setLength(0);
		buffer.append("<<<더조은 RPG GAME>>>\n");
		buffer.append("시작하시려면 엔터를 눌러주세요.\n");
		try {
			writer.append(buffer);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		while (true) {
			String input = (String) input("입력", STRING);
			if (input.equals(""))
				break;
		}
		System.out.println("다음스테이지 이동~");

	}

	private Object input(String msg, int n) {
		buffer.setLength(0);
		buffer.append(msg+" : ");
		String input = "";
		try {
			writer.append(buffer);
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
