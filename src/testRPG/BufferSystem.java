package testRPG;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferSystem {

	protected static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	protected static StringBuffer buffer = new StringBuffer();
	protected static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
}
