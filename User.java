package eduSmartLMS;

public abstract class User implements ProgressTrackable{
	private String name;
	private String email;
	private int UserID;
	
	User (String name, String email, int UserID)
	{
		this.name = name;
		this.email = email;
		this.UserID = UserID;
			}
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int UserID) {
}
	abstract void viewprofile();
	final void displaywelcome() 
	{ 
		System.out.println ("Welcome to Edusmart- A mini Learning Management System " + ""+ name + "!"	);
		
	}

public static void main(String[] args) {
		
}
public void trackProgress() {
	
}
}
