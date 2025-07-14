package eduSmartLMS;

public class Student extends User implements ProgressTrackable{
	    private String enrolledcourse1;
		private String enrolledcourse2;
		Student (String name, String email, int UserID, String enrolledcourse1, String enrolledcourse2)
		{
			super (name,email, UserID);
			this.enrolledcourse1 = enrolledcourse1;
			this.enrolledcourse2 = enrolledcourse2;
		}
	public String getenrolledcourse1( ) {
				return enrolledcourse1;
						}

    public void setenrolledcourse1 (String enrolledcourse1)		{
	this.enrolledcourse1 = enrolledcourse1;
}
public String getenrolledcourse2( ) {
	return enrolledcourse2;
			}

public void setenrolledcourse2 (String enrolledcourse2)		{
this.enrolledcourse2 = enrolledcourse2;
{
}
}		
public String enrollCourse(String CourseName) {
	if (enrolledcourse1==null|| enrolledcourse1.isEmpty())
	{
		this.enrolledcourse1 = CourseName;
		return getname() + "enroll in" + CourseName;
		
	}
	else if (enrolledcourse2==null|| enrolledcourse2.isEmpty())
	{
		this.enrolledcourse2 = CourseName;
		return getname() + "enroll in" + CourseName;
	}
	else {
		return getname () + " is already enrolled in 2 courses";
	}
}
public static void main(String[] args) {
}
@Override
void viewprofile() {
	System.out.println("STUDENT PROFILE");
	System.out.println("Name: " +  getname());
	System.out.println("email: " +  getemail());
	System.out.println("UserID: " +  getUserID());
	System.out.println("enrolledcourse1 :" +  enrolledcourse1);
	System.out.println("enrolledcourse2 :" +  enrolledcourse2);
}


	public void trackProgress() {
		 System.out.println(getname() + " has tracked a progress");
	
	
	
}		

}
