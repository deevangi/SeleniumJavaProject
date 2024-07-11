package LearningSelenium;

public class CoreJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoreJava7 methode = new CoreJava7();
		String name  = methode.getData();
		System.out.println(name);
		getData2();
		
		
		CoreJava8 methode2 =new CoreJava8();
		methode2.getUserData();

	}
	
	public String getData() {
		
		System.out.println("Good morning india");
		return "test Selenium";
	}
	
	
	public static String getData2() {
		
		System.out.println("Good Place");
		return "test Selenium";
	}


}
