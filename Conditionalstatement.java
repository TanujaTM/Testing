package firstproject;

public class Conditionalstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Maths = 30;
		int Science = 60;
		int English = 50;
		
		int TotalMarks = (Maths+Science+English );
		double Average = (Maths+Science+English)/3 ;
		System.out.println ("TotalMarks=" + TotalMarks);
		System.out.println ("Average=" + Average);	

String Grade= null; 

 if (Average >=90 && Average <= 100)
		Grade = "A+" ;

	if (Average > 75 ||Average < 89) 
		Grade = "A";
	
	if (Average > 50 || Average < 74 ) 
		Grade = "B";

	if (Average > 40 || Average <59) 
		Grade = "C";
	
	if (Average < 40) 
		Grade = "F";
		
	System.out.println ("Your grade is:" + Grade);
	
	if (Grade == "A+" || Grade == "A")
	
	System.out.println ("Excellent Performance!");
	
	else if (Grade == "F")
	
	System.out.println ("Please work harder next time");
	
	else 
	System.out.println ("Keep improving");
	
	if (Maths <35 || English <35 || Science <35) 
		
		System.out.println ("Failed due to low score in atleast one subject");

	}
}
