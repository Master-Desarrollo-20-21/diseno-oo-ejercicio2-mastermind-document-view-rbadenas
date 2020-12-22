package rbadenas.utils;

import java.util.Scanner;

public class Console {
	
	private Scanner reader = new Scanner(System.in);
	public static Console console;
	
	public static Console getInstance() {
		if (Console.console == null) {
			Console.console = new Console();
		}
		return Console.console;
	}

	public void write(String promptMessage) {
		System.out.println(promptMessage);
	}
	
	public String read(String promptMessage) {
		System.out.print(promptMessage);
		return reader.next();
	}




}
