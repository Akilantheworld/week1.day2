package week1.day2;

public class AssignmentCharOccurance {

	public static void main(String[] args) {


		String str= "Welcome to Musiri";
		char search='i';
		int count=0;
		
		for(int i=0;i<str.length();i++) {
		
		if(str.charAt(i)==search) {
		
			count++;
		}
		
	}
		
		System.out.println("Total Occurance 'i' in the string is = " +count);
		
	}

}
