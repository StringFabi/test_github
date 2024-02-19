package sozialNetwork;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Post {
	private String Username;
	private long timestamp;
	private ArrayList <String> comments;
	private int likes;
	
	
	public Post(String username, long timestamp, int likes) {
		super();
		Username = username;
		this.timestamp = timestamp;
		this.comments = new ArrayList<String>();
		this.likes = likes;
	}


	public String getUsername() {
		return Username;
	}


	public void setUsername(String username) {
		Username = username;
	}


	public long getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}


	public ArrayList<String> getComments() {
		return comments;
	}


	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}


	public int getLikes() {
		return likes;
	}


	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void likePost() {
	    this.likes++;
	}
	public void unlikePost() {
	    if (this.likes > 0) {
	        this.likes--;
	    }
	}
	public String getTimeSincePost() {
        long currentTime = System.currentTimeMillis();
        long diff = currentTime - timestamp;
 
        long seconds = TimeUnit.MILLISECONDS.toSeconds(diff);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(diff) % 60;
        long hours = TimeUnit.MILLISECONDS.toHours(diff) % 24;
        long days = TimeUnit.MILLISECONDS.toDays(diff);
 
        if (days > 0) {
            return "vor " + days + " Tag(en)";
        } else if (hours > 0) {
            return "vor " + hours + " Stunde(n)";
        } else if (minutes > 0) {
            return "vor " + minutes + " Minute(n)";
        } else {
            return "vor " + seconds + " Sekunde(n)";
        }
    }

	
	
}
