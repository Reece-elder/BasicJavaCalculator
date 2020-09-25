package calculatorProject.main;

import java.util.Scanner;

public class calculator {
	
	public Boolean calcAgain = true;
	public static int numberOfCalculators;
	
	public int addCalc(int x, int y) {
		int result;
		result = x + y;
		System.out.println(result);
		return result;
	}
	
	public int subCalc(int x, int y) {
		int result;
		result = x - y;
		System.out.println(result);
		return result;
	}
	
	public float divCalc(int x, int y) {
		int result;
		result = x / y;
		System.out.println(result);
		return result;
	}
	
	public int multiplyCalc(int x, int y) {
		int result;
		result = x * y;
		System.out.println(result);
		return result;
	}
	
	public void calcChoose(String type, int x, int y) {
		if(type.equals("+")) {
			addCalc(x,y);
		} else if (type.equals("*")) {
			multiplyCalc(x,y);
		} else if (type.equals("-")) {
			subCalc(x,y);
		} else if (type.equals("/")) {
			divCalc(x,y);
		} else {
			System.out.println("Calculation method not valid");
		}
	}
	
	public void scannerSetup() {
		int x = 0;
		int y = 0;
		String calc = "";
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your first number: ");

	    x = Integer.parseInt(scan.nextLine());
	    
	    System.out.println("Enter your second number: ");
	    y = Integer.parseInt(scan.nextLine());
	    
	    System.out.println("Enter your calculation method: ");
	    calc = scan.nextLine();
	    System.out.println(calc);
	    
	    calcChoose(calc,x,y);
	}
	
	public Boolean calculateAgain() {
		
		String answer = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculate again? Type Y/N ");
	    answer = scan.nextLine();
	    System.out.println(answer);
	    
	    if(answer.equals("Y")) {
	    	calcAgain = true;
	    	return calcAgain;
	    } else if (answer.equals("N")) {
	    	calcAgain = false;
	    	String tyPlaying = "Thanks for Playing!";
	    	System.out.println("=============================") ;
	    	System.out.println(tyPlaying);
	    	System.out.println("=============================") ;
	    	return calcAgain;
	    } else {
	    	System.out.println("Output not expected, please try again");
	    }
		return calcAgain;
	}
	

}
