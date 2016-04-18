
import java.util.*;

class Maths{

	double add(double a ,double b){
		double total=a+b;
		return total;
	}

	double subtract(double a, double b){
		double total=a-b;
		return total;
	}
	double multiply(double a ,double b){
		double total=a*b;
		return total;
	}

	double divide(double a, double b){
		double total=a/b;
		return total;
	}
}

public class assignment4{

public static void main(String[] args){

	double number1,number2;
	char operator;
	double answer=0;
	Maths Maths = new Maths();
    Scanner in= new Scanner(System.in);
	System.out.println("Enter Number:");
	number1=in.nextDouble();
	operator = in.next().charAt(0);
	number2=in.nextDouble();
	
	switch (operator) {
            case '+': answer = Maths.add(number1, number2);
                      break;
            case '-': answer = Maths.subtract(number1, number2);
                      break;
            case '*': answer = Maths.multiply(number1, number2);
                      break;
            case '/': answer = Maths.divide(number1, number2);
                      break;
        }
        System.out.println(answer);    
 }
}