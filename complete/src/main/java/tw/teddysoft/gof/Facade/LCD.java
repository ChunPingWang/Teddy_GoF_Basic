package tw.teddysoft.gof.Facade;

public class LCD {

	private String message = "";
	
	public void display(String msg) {
		message = msg;
		// display the message to the LCD panel
	}

	public String getMessage() {
		return message;
	}

}
