import java.util.Scanner;

public class TwoNumbers {
    int operand1;
    int operand2;
    TwoNumbers(){}
    int add() {
        return(operand1 + operand2);
    }
    int subtract() {
        return(operand1 - operand2);
    }
    int multiply() {
        return(operand1 * operand2);
    }
    int divide() {
        return(operand1 / operand2);
    }
    int modulus() {
        return(operand1 % operand2);
    }
    double floatingPointDivision() {
        return((double)operand1 / (double)operand2);
    }   

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        TwoNumbers twoNumbers = new TwoNumbers();
        int numberOfFeet;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("this application converts feet to inches");
                System.out.println("type the number of feet");
		numberOfFeet = in.nextInt();
                twoNumbers.operand1 = 12;
                twoNumbers.operand2 = numberOfFeet;
                int numberOfInches = twoNumbers.multiply();
                if (numberOfFeet == 1)
                    System.out.println( numberOfFeet + " foot " + "contains " + numberOfInches + " Inches");
                if (numberOfFeet == 0)
                    System.out.println( numberOfFeet + " feet " + "contains " + numberOfInches + " Inches");
                if  (numberOfFeet > 1)
        	System.out.println( numberOfFeet + " feet " + "contains " + numberOfInches + " Inches");
                if (numberOfFeet < 0)
                    System.out.println("error");
    }
}
