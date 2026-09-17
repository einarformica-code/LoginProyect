package user;

import java.util.Objects;

public class User {
	
	
	protected String username;
	protected String password;
	protected int id;
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	@Override
	public String toString() {
		return "Current User " + username + ",current password=" + password;
	}


	public int getId() {
		return id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(id));
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id;
	}
	
	

	

	
	
	
	
}
