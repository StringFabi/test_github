package sozialNetwork;

public class Picture extends Post{

@Override
	public String toString() {
		return "Picture [filename=" + filename + ", headline=" + headline + ", getFilename()=" + getFilename()
				+ ", getHeadline()=" + getHeadline() + ", getUsername()=" + getUsername() + ", getTimestamp()="
				+ getTimestamp() + ", getComments()=" + getComments() + ", getLikes()=" + getLikes() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

public String filename;

public String headline;

public Picture(String username, long timestamp, String comments, int likes, String filename, String headline) {

	super(username, timestamp, comments, likes);

	this.filename = filename;

	this.headline = headline;

}

public String getFilename() {

	return filename;

}

public void setFilename(String filename) {

	this.filename = filename;

}

public String getHeadline() {

	return headline;

}

public void setHeadline(String headline) {

	this.headline = headline;

}
 
}
