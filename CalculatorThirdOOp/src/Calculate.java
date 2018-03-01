import java.util.Scanner;



public class Calculate {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//System.out.println(firstNumber + " " + secondNumber);
		System.out.println("Please enter your input method: " + "\n 1.Three argument" + "\n 2. One argument");
		int calculatorType = scanner.nextInt();
		double result;
		String calculation="";
		switch(calculatorType){
		
		case 1:
			
			System.out.print("Enter your first opreand: ");
			double firstNumber = scanner.nextDouble();
			System.out.print("Enter your second operand: ");
			double secondNumber = scanner.nextDouble();
			System.out.println("Enter your calculation: " + "\n 1 : +" + "\n 2 : -" + "\n 3 : *" + "\n 4 : /");
			int type = scanner.nextInt();
			result=calculate(firstNumber,secondNumber,type);
			System.out.println("The result is: " + result);
			break;
		
		case 2:
			Scanner scan= new Scanner(System.in);
			System.out.println("Please enter your calculation!" + "\n 1 : +" + "\n 2 : -" + "\n 3 : *" + "\n 4 : /");
			
			calculation = scan.nextLine();
			
			double firstOperand = Double.parseDouble(calculation.split(" ")[0]);
			double secondOperand = Double.parseDouble(calculation.split(" ")[2]);
			
			int operator = Integer.parseInt(calculation.split(" ")[1]);
			System.out.println(operator);
			result=calculate(firstOperand,secondOperand,operator);
			System.out.println("The result is: " + result);
			break;
		
		}
		
		scanner.close();

	}
	public static double calculate(double firstNumber, double secondNumber, int operator ){
		double result=0;
		switch(operator) {
		
		case 1:
			result=firstNumber+secondNumber;
			break;
		case 2:
			result=firstNumber-secondNumber;
			break;
		case 3:
			result=firstNumber*secondNumber;
			break;
		case 4:
			if(secondNumber != 0)
			{
				result=firstNumber/secondNumber;
				break;
			}else{
				System.out.println("You can't divide by 0");
			}
			
			default: System.out.println("Please enter a valid operator!");
		
		}
		return result;
	}

}
