package sozialNetwork;

public class Message extends Post{
	private String text;
	
		
	public Message(String username, long timestamp, int likes, String text) {
		super(username, timestamp, likes);
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Message [text=" + text + ", getText()=" + getText() + ", getUsername()=" + getUsername()
				+ ", getTimestamp()=" + getTimestamp() + ", getComments()=" + getComments() + ", getLikes()="
				+ getLikes() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}


}
