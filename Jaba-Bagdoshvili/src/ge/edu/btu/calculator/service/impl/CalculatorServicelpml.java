package ge.edu.btu.calculator.service.impl;

import ge.edu.btu.calculator.service.CalculatorService;

public class CalculatorServicelpml implements CalculatorService {

    @Override
    public int sum(int x, int y) {
        return x+y;
    }

    @Override
    public int divide(int x, int y) {
        int result = 0;
        try{
            result = x/y;
        }catch (ArithmeticException e){
            System.out.println("ნულზე გაყოფა არ შეიძლება!");
        }

        return result;
    }
}
