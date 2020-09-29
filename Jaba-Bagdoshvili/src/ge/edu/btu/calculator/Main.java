package ge.edu.btu.calculator;

import ge.edu.btu.calculator.service.impl.CalculatorServicelpml;

public class Main {

    public static void main(String args[]) {
        CalculatorServicelpml x = new CalculatorServicelpml();
        int a = x.sum(10, 5);
        int b = x.divide(12, 5);
        int c = x.divide(15, 0);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
