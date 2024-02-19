package sozialNetwork;

public class Picture extends Post{


public String filename;

public String headline;




public Picture(String username, long timestamp, int likes, String filename, String headline) {
	super(username, timestamp, likes);

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
