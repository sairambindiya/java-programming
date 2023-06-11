package com.ds.practice;

import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double operand1=getOperand(scanner,"Enter the first number: -");
        double operand2=getOperand(scanner,"Enter the second number:-");
        char operator=getOperator(scanner,"Enter the operator between : + or - or * or /");
        double calculatedNumber=calculate(operand1,operand2,operator);
        if(Double.isNaN(calculatedNumber)){
            System.out.println("Invalid Operator!");
        }
        else{
            System.out.println("Result is "+calculatedNumber);
        }
    }

    public static double calculate(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
               return operand2==0? Double.NaN:operand1/operand2;
            default: return Double.NaN;
        }

    }

    private static char getOperator(Scanner scanner, String message) {
        System.out.println(message);
        while(true){
            String operator=scanner.next();
            if(operator.length()!=1 || "+-*/".indexOf(operator.charAt(0))<0){
                System.out.println("Invalid operator, please enter the operator between (+,-,*,/)");
            }
            else
                return operator.charAt(0);
        }
    }

    private static double getOperand(Scanner scanner, String message) {
        System.out.println(message);
        while(!scanner.hasNextDouble()){
            System.out.println("Invalid number ,Please try again");
            scanner.nextLine();
        }

        return scanner.nextDouble();

    }
}
