package strings;

public class Palindromestring {

	public static void main(String[] args) {
		
		String str = "madam";
		String rev ="";
		for (int i= str.length()-1;i>=0; i--)
		{
			rev += str.charAt(i);
		}
	if (str.equals(rev)) {
		System.out.println("The string is palindrome");
	}
	else {
		System.out.println("The string is not a palindrome");
	}
		

	}

}
