package loops;

public class Countofdigits {

	public static void main(String[] args) {
	
		
	int num = 00456734;
	int count = 0;
			
	while (num != 0) {
		
	num = num/10;
	++count;
		}
	System.out.println ("Number of digits = " + count);
	

}
}