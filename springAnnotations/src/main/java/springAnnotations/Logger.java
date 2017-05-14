package springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Logger {

	// @Autowired
	private ConsoleWritter consoleWritter;
	private FileWritter fileWritter;

	public Logger() {

	}

	
	public Logger(ConsoleWritter consoleWritter, FileWritter fileWritter) {
		this.consoleWritter = consoleWritter;
		this.fileWritter = fileWritter;
	}
	
	@Resource
	public void setConsoleWritter(ConsoleWritter writer) {
		System.out.println("setConsoleWritter called");
		this.consoleWritter = writer;
	}

	@Resource
	public void setFileWritter(Writter fileWritter) {
		System.out.println("text from Logger fileWritter: " + fileWritter);
		this.fileWritter = (FileWritter) fileWritter;
	}

	public void writeFile(String text) {
		System.out.println("text from logger writeFile: " + text);
	}

	public void writeConsole(String text) {
		System.out.println("text from Logger writeConsole: " + text);
		consoleWritter.write("try write text");
	}

	@PostConstruct
	public void init() {
		System.out.println("+++ init was called");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("+++ destroy was called");
	}
	
}
