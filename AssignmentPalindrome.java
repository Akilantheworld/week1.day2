package week1.day2;

public class AssignmentPalindrome {

	public static void main(String[] args) {

		String str = "madam";
		String n=" ";
		
		for(int i=0;i<str.length();i++) {
			
			char temp=str.charAt(i);
			n=temp+n;		
		}
		System.out.println("The reversed string == " +n);
		
		if(str.equalsIgnoreCase(n)) {
		
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
		}

}
