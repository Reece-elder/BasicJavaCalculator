package calculatorProject.main;

public class runner {
	
public static void main(String[] args) {
	
	calculator calculator = new calculator();
	
	while(calculator.calcAgain) {
		
		calculator.scannerSetup();
		calculator.calculateAgain();
	}
	}
}
