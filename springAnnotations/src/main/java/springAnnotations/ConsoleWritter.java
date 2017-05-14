package springAnnotations;

public class ConsoleWritter {
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void write(String text) {
		System.out.println("ConsoleWritter wrote text: " + text);
	}
	
	public ConsoleWritter getInstance () {
		return new ConsoleWritter();
	}
	
}
