package eduSmartLMS;

public class instructor extends User{
	private String Createdcourse1;
	private String Createdcourse2;

	instructor(String name, String email, int UserID, String Createdcourse1, String Createdcourse2) {
		super(name, email, UserID);
		this.Createdcourse1 = Createdcourse1;
		this.Createdcourse2= Createdcourse2;
	}
	public String getCreatedcourse1() {
		return Createdcourse1;
	}
	
	public void setCreatedcourse1 (String Createdcourse1) {
		this.Createdcourse1 = Createdcourse1;
	}
	public String getCreatedcourse2() {
		return Createdcourse2;
	}
	
	public void setCreatedcourse2 (String Createdcourse2) {
		this.Createdcourse2 = Createdcourse2;
	}
public String Createdcourse(String CourseName) {
	return CourseName;
}

		//if (Createdcourse1 == null||Createdcourse1.isEmpty())
		//{
		//	this.Createdcourse1 = CourseName;
			//return getname() + "created course" + CourseName;
			
		
//	 if (Createdcourse1 == null||Createdcourse1.isEmpty()||Createdcourse2 ==null||Createdcourse2.isEmpty())
//	 {
//			this.Createdcourse1 = CourseName;
//			this.Createdcourse2 = CourseName;
//		return getname() + "created course" + CourseName;
			
		// else if (Createdcourse2 ==null||Createdcourse2.isEmpty())
	//	{
		//	this.Createdcourse2 = CourseName;
		//	return getname() + "created course" + CourseName;
//		}
//		else {
//			return getname () + " has already created 2 courses";
//		}	
//	}
//		
	
	public static void main(String[] args) {
		
	}

	@Override
	public void trackProgress() {
		 
		}

	@Override
	void viewprofile() {
		
		System.out.println("INSTRUCTOR PROFILE");
		System.out.println("Name : " + getname());
		System.out.println("email : " + getemail());
		System.out.println("UserID : " + getUserID());
		System.out.println("Createdcourse1 :" + Createdcourse1);
		System.out.println("Createdcourse2 :" + Createdcourse2);
	}
	}

