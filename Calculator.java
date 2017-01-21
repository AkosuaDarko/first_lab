import java.util.Scanner;
public class Calculator{
  public static void main(String[]args)
  {
    System.out.println("This is the JAVA Calculator");
    System.out.println();
    
    double a, result;
    double b;
    String operator="";
    int a;
    Scanner keyboard = new Scanner (System.in);
    
    System.out.println("Enter the first number");
    a = keyboard.nextDouble();
    
    System.out.println("Enter the second number");
    b = keyboard.nextDouble();
    
    System.out.println("Enter A for addition, S for subtraction, M for Multiplication and D for division");
    operator = keyboard.next();
    if(operator.equals("A")) {
   result =  a + b ;
    }
    else if (operator.equals("S")) {
      result = a - b;
    }
    else if (operator.equals("M")) {
      result = a*b;
    }
    else {
      result = a/b;
    }
    System.out.print (result);
    }
  }
