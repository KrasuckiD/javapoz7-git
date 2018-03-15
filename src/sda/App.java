package sda;

import calculator.Calculator;
import calculator.RandomGenerator;

public class App {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        RandomGenerator randomGenerator = new RandomGenerator();
        System.out.println(myCalculator.sum(randomGenerator.getSmallNumber(),randomGenerator.getBigNumber()));
        System.out.println(myCalculator.div(randomGenerator.getSmallNumber(),randomGenerator.getSmallNumber()));
        System.out.println(myCalculator.mul(randomGenerator.getSmallNumber(),randomGenerator.getSmallNumber()));
        System.out.println("Factorial = " + myCalculator.factorisl(5));
        System.out.println("Hello");
        System.out.println("Ala ma kota");

    }
}
