package program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import user.User;
import userUtilities.UserMap;
public class program {
	
	
	public void loadUsers() {
		
		File file = new File("CredentialsList.txt");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				String currentLine = sc.next();
				String[] currentUser = currentLine.split(",");
				String currentUsername = currentUser[0];
				String currentPassword = currentUser[1];
				
				User currentUserObject = new User(currentUsername, currentPassword);
				
				
				
				
				
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
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
