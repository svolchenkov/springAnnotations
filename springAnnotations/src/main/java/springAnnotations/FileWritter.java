package springAnnotations;

public class FileWritter implements Writter {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void write(String text) {
		System.out.println("FileWritter class printed text from write method: " + text);
	}
	
}
