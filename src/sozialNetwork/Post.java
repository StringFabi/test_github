package sozialNetwork;

import java.util.ArrayList;

public class Post {
	private String Username;
	private long timestamp;
	private ArrayList <String> comments;
	private int likes;
	private boolean isLiked;
	
	
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
	
	
	
}
