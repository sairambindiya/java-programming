package com.ds.practice;

import java.util.Stack;

public class ArithmeticInterpreter {
    public static int evaluateExpression(String expression) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                StringBuilder num = new StringBuilder();
                num.append(c);
                while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                    num.append(expression.charAt(i + 1));
                    i++;
                }
                operandStack.push(Integer.parseInt(num.toString()));
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operatorStack.isEmpty() && hasPrecedence(c, operatorStack.peek())) {
                    int b = operandStack.pop();
                    int a = operandStack.pop();
                    char operator = operatorStack.pop();
                    int result = performOperation(a, b, operator);
                    operandStack.push(result);
                }
                operatorStack.push(c);
            } else if (c == '(') {
                operatorStack.push(c);
            } else if (c == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    int b = operandStack.pop();
                    int a = operandStack.pop();
                    char operator = operatorStack.pop();
                    int result = performOperation(a, b, operator);
                    operandStack.push(result);
                }
                if (!operatorStack.isEmpty() && operatorStack.peek() == '(') {
                    operatorStack.pop();
                }
            }
        }

        while (!operatorStack.isEmpty()) {
            int b = operandStack.pop();
            int a = operandStack.pop();
            char operator = operatorStack.pop();
            int result = performOperation(a, b, operator);
            operandStack.push(result);
        }

        return operandStack.pop();
    }

    private static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }

    private static int performOperation(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String expression = "3 + 4 * 2 - ( 1 + 2 )";
        int result = evaluateExpression(expression);
        System.out.println("Result: " + result);
    }
}

