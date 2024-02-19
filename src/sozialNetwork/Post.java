package sozialNetwork;

public class Post {
	private String Username;
	private long timestamp;
	private String comments;
	private int likes;
	
	
	public Post(String username, long timestamp, String comments, int likes) {
		super();
		Username = username;
		this.timestamp = timestamp;
		this.comments = comments;
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


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
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
