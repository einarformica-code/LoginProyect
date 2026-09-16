package user;

public class User {
	
	
	protected String username;
	protected String password;
	
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	@Override
	public String toString() {
		return "Current User " + username + ",current password=" + password;
	}
	
	
	
	
}
