package collections;

import java.util.Map;

import user.User;

public class userCollectionManager {
	private Map<User, Integer> userCollection;
	public void saveCollection(Map<User, Integer> currentCollection ) {
		userCollection = currentCollection;
		
	}

}
