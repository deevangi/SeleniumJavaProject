package LearningSelenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> a = new ArrayList<String>();
		
		//List<String> a= new ArrayList<String>();
		
		a.add("rhaul");
		a.add("Priya");
		a.add("Test");
		a.add("Selenium");
		//a.remove(1);
		System.out.println(a.get(3));
		
		
		
		
		for(int i=0;i<a.size();i++) {
			
			System.out.println(a.get(i));
		}
		
		System.out.println("*****************");
		for(String value :a) {
			
			System.out.println(value);
		}
		
		//item is oresent in Arraylist
		
		System.out.println(a.contains("Selenium"));
		
		String[] name = { "rahul", "shanu" };
		
		List<String> nameArrayList =Arrays.asList(name);
		nameArrayList.contains("Shanu");

	}
}
