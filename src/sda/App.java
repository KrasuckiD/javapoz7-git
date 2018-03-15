package sda;

import calculator.Calculator;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5,10));
        System.out.println(calculator.div(5,5));
        System.out.println(calculator.mul(5,5));
    }
}
