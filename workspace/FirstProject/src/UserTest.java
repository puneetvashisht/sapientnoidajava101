
public class UserTest {
	
	public static void main(String[] args) {
//		int id = 33;

		User user = new User(101, "test@g.com", "sdgsd");
//		System.out.println(user.id);
		System.out.println(user.id + " : "+ user.email + " : " + user.password);
		
		User user2 = new User(102, "test@dk.com", "SDgdsgs");
		System.out.println(user2.id + " : "+ user2.email + " : " + user2.password);
	}

}
