package Phase1_Practice_Assignment;
import java.util.Scanner;
public class Assgn_1 {
	public static void main(String[] args) {
		 double num1, num2;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the numbers");
	        num1 = sc.nextDouble();
	        num2 = sc.nextDouble();
	        System.out.println("Enter the operator (+,-,*,/)");
	        char n = sc.next().charAt(0);
	        double num = 0;
	        switch (n) {
	        case '+':
	            num = num1 + num2;
	            break;
	        case '-':
	        	num = num1 - num2;
	            break;
	        case '*':
	        	num = num1 * num2;
	            break;
	        case '/':
	        	num = num1 / num2;
	            break;
	        }
	        System.out.println("The final result:");
	        System.out.println(num1 + " " + n + " " + num2
	                           + " = " + num);
	    }
	}
	
