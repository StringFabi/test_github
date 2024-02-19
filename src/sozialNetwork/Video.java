package sozialNetwork;

public class Video extends Post{
	private String Filename;
	private String Videoheadline;
	
	public Video(String username, long timestamp, int likes) {
		super(username, timestamp, likes);
		this.Filename = Filename;
		this.Videoheadline=Videoheadline;
	}

	public String getFilename() {
		return Filename;
	}

	public void setFilename(String filename) {
		Filename = filename;
	}

	public String getVideoheadline() {
		return Videoheadline;
	}

	public void setVideoheadline(String videoheadline) {
		Videoheadline = videoheadline;
	}

	@Override
	public String toString() {
		return "Video [Filename=" + Filename + ", Videoheadline=" + Videoheadline + ", getFilename()=" + getFilename()
				+ ", getVideoheadline()=" + getVideoheadline() + ", getUsername()=" + getUsername()
				+ ", getTimestamp()=" + getTimestamp() + ", getComments()=" + getComments() + ", getLikes()="
				+ getLikes() + ", getTimeSincePost()=" + getTimeSincePost() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
