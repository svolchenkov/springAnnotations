package springAnnotations;

import java.security.GeneralSecurityException;

import spring.*;

public class Logger {
	
	private ConsoleWritter consoleWritter;
	private FileWritter fileWritter;

	public Logger () {
		
	}
	
	public Logger (ConsoleWritter consoleWritter, FileWritter fileWritter) {
		this.consoleWritter = consoleWritter;
		this.fileWritter = fileWritter;
	}
	
	public void setConsoleWritter(ConsoleWritter writer) {
		this.consoleWritter = writer;
	}

	public void setFileWritter(FileWritter fileWritter) {
		this.fileWritter = fileWritter;
	}
	
	public void writeFile(String text) {
		
	}
	
	public void writeConsole(String text) {
		
		System.out.println("text from Logger writeConsole: " + text);
		consoleWritter.write("try write text");

	}

}
