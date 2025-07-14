package eduSmartLMS;

public class Main {

	public static void main(String[] args) {
		Student S1 = new Student ("Tanuja", "tanujam3@gmail.com", 6, "","");

		Student S2 = new Student ("Prasad", "prasadsingidi@gmail.com", 9, "","");
	
instructor I1= new instructor ("Saketh", "saketh.jumba@gmail.com",100, "","");
      
instructor I2= new instructor ("Kamal", "kamal.pushya@gmail.com",200, "","");
     
        
  Admin Admin = new Admin ("Chinmayi","durga.chinmayi@gmail.com",206);
  
System.out.println(I1.Createdcourse("Manual Testing"));
 System.out.println(I1.Createdcourse("Java Programming"));
 System.out.println(I2.Createdcourse("Machine Learning"));
  System.out.println(I2.Createdcourse("Application Testing"));
  
  System.out.println(S1.enrollCourse("Manual Testing"));
  System.out.println(S1.enrollCourse("Java Programming"));
  System.out.println(S2.enrollCourse("Machine Learning"));
  System.out.println(S2.enrollCourse("Application Testing"));
  
  
  S1.viewprofile();
  S1.displaywelcome();
  S2.viewprofile();
  S2.displaywelcome();
  I1.viewprofile();
  I2.viewprofile();
  Admin.viewprofile();
  
  S1.trackProgress();
  S2.trackProgress();
  
  Admin.removeUser(S1);
 }

}
