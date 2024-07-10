package LearningSelenium;

public class CoreJava6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Literal
		
		//String s ="test selenium";
		String s1 ="automation";
		
		
		//new
		
		String s2 = new String("Welcome");
		String s3 = new String ("Welcome");
		
		
		
		String s ="test selenium project";
		String[] splittedString = s.split("selenium");
		
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		for(int i=0;i<s.length();i++) {
			
			System.out.println(s.charAt(i));
		}
		
		
		for(int i=s.length()-1;i>=0;i--) {
			
			System.out.println(s.charAt(i));
		}

		


	}

}
