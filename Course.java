package eduSmartLMS;

public class Course {
	private String title ;
	private int durationInHours ;
	private final int maxStudents;
	
	Course (String title, int durationInHours, int maxStudents){
	
	this.title = title;
	this.durationInHours = durationInHours;
	this.maxStudents = maxStudents;
	}

	Course (String title)
	{
		this.title = title;
		this.durationInHours = 6;
		this.maxStudents = 100;
			}
	
	public String gettitle()
	{
		return title;
	}
	
	public void settitle(String title) {
		this.title = title;
	}
	
	public int getdurationInHours()
	{
		return durationInHours;
	}
	
	public void setdurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}
	
	public int getmaxStudents()
	{
		return maxStudents;
	}
public void showCourseDetails() {
	System.out.println("Course Details");
    System.out.println("Title: " + title);
    System.out.println("Duration: " + durationInHours + " hours");
    System.out.println("Max Students: " + maxStudents);
}
	public static void main(String[] args) {


	}

}
