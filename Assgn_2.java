package Phase1_Practice_Assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assgn_2 {
	  public static boolean isValidEmail(String email) {
		   String regex = "^(.+)@(.+)$";
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();  
	   }

	   public static void main(String[] args) {
	       List<String> emails = new ArrayList<String>();

	       for (String value : emails) {
	           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	       }
	       System.out.println("Enter a mail address");
	       Scanner sc = new Scanner(System.in);
	       String input = sc.nextLine();
	       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
	       
	   }
	   
}


