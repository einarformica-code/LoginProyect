package program;
import collections.*;
public class entryPoint {
	 public static void main(String[] args) {
		 
		 
		 userCollectionManager currentUserCollectionManager = new userCollectionManager();
		 program currentProgram = new program();
		 currentProgram.loadUsers(currentUserCollectionManager);

		 
	}
}
