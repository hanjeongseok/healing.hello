package healing.spot.hello.model;

public class Greet {

	private String message;

	public Greet() {}
	public Greet(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
