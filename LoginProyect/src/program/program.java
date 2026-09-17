package program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import user.User;
import collections.*;
public class program {
	
	
	public void loadUsers(userCollectionManager currentUserCollectionManager) {
		Map<User, Integer> userMap = new HashMap<>();
		File file = new File("CredentialsList.txt");
		
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				String currentLine = sc.next();
				String[] lineParts = currentLine.split(",");
				String currentUsername = lineParts[0];
				String currentPassword = lineParts[1];
				String currentId = lineParts[2];
				
				User currentUserObject = new User(currentUsername, currentPassword);				
				userMap.put(currentUserObject, Integer.parseInt(currentId));
				currentUserCollectionManager.saveCollection(userMap);
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void printUsers() {
		
		File file = new File("CredentialsList.txt");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				String currentLine = sc.next();
				System.out.println(currentLine);
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
