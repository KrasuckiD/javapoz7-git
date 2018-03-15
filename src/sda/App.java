package sda;

import calculator.Calculator;
import calculator.RandomGenerator;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        RandomGenerator randomGenerator = new RandomGenerator();
        System.out.println(calculator.sum(randomGenerator.getSmallNumber(),randomGenerator.getBigNumber()));
        System.out.println(calculator.div(randomGenerator.getSmallNumber(),randomGenerator.getSmallNumber()));
        System.out.println(calculator.mul(randomGenerator.getSmallNumber(),randomGenerator.getSmallNumber()));
        System.out.println("Factorial = " + calculator.factorisl(5));


    }
}
