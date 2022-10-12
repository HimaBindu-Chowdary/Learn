package qsp;

import java.util.ArrayList;
import java.util.HashMap;

public class PropertyFile    // fetch password
{

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("https://demo.actitime.com/");
		al.add("admin");
		al.add("admin@actitime.com"); //later added in between 
		al.add("manager");
		System.out.println(al.get(2)); //instead of getting password we getting email address
    
		HashMap<String, String> hs= new HashMap<>();
		hs.put("url","https://demo.actitime.com/" );
		hs.put("UN", "admin");
		hs.put("email","admin@actitime.com" );
		hs.put("Pwd", "manager");
		System.out.println(hs.get("Pwd"));
		System.out.println(hs.get("url"));
	}

}
