package eduSmartLMS;
public class Admin extends User{

	Admin(String name, String email, int UserID) {
		super(name, email, UserID);
		
	}

public void removeUser (User user) {
		System.out.println("Admin removed user- "+ user.getname());
	}


	@Override
	void viewprofile() {
		System.out.println("ADMIN PROFILE");
		System.out.println("Name: " + getname());
		System.out.println("email: " + getemail());
		System.out.println("UserID: " + getUserID());
		
	}
	
	public static void main(String[] args) {
	}
	}
