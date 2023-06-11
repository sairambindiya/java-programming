package com.ds.practice.secondtimepractice;

public class ArithmeticInterpreter {
        private String expression;
        private int position;

        public ArithmeticInterpreter(String expression) {
            this.expression = expression;
            this.position = 0;
        }

        public int interpret() {
            return parseExpression();
        }

        private int parseExpression() {
            int value = parseTerm();

            while (position < expression.length()) {
                char operator = expression.charAt(position);

                if (operator != '+' && operator != '-')
                    break;

                position++;

                int term = parseTerm();

                if (operator == '+')
                    value += term;
                else if (operator == '-')
                    value -= term;
            }

            return value;
        }

        private int parseTerm() {
            int value = parseFactor();

            while (position < expression.length()) {
                char operator = expression.charAt(position);

                if (operator != '*' && operator != '/')
                    break;

                position++;

                int factor = parseFactor();

                if (operator == '*')
                    value *= factor;
                else if (operator == '/')
                    value /= factor;
            }

            return value;
        }

        private int parseFactor() {
            int value;

            char currentChar = expression.charAt(position);

            if (currentChar == '(') {
                position++;
                value = parseExpression();
                position++; // Skip closing parenthesis
            } else {
                value = parseNumber();
            }

            return value;
        }

        private int parseNumber() {
            StringBuilder number = new StringBuilder();

            while (position < expression.length() && Character.isDigit(expression.charAt(position))) {
                number.append(expression.charAt(position));
                position++;
            }

            return Integer.parseInt(number.toString());
        }

        public static void main(String[] args) {
            String expression = "3 + 4 * (2 - 1)";
            ArithmeticInterpreter interpreter = new ArithmeticInterpreter(expression);
            int result = interpreter.interpret();
            System.out.println("Result: " + result);
        }

}

