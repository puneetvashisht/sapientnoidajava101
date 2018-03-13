
public class User {
	
	User(){
		
	}
	
	
public User(int id, String email, String password) {
		this.id = id;
		this.email = email;
		this.password = password;
	}


//	User(int i, String email, String password){
//		this.id = i;
//		email = email;
//		this.password = password;
//	}
//	
	int id;
	String email;
	String password;
	
	void changePassword(String newPassword){
		password = newPassword;
	}

}
