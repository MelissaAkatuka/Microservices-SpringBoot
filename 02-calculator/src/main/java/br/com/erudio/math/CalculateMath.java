package br.com.erudio.math;

public class CalculateMath {

    public Double sum(Double numberOne, Double numberTwo){
        return numberOne + numberTwo;
    }
    public Double subtraction(Double numberOne, Double numberTwo){
        return numberOne - numberTwo;
    }
    public Double multiplication(Double numberOne, Double numberTwo){
        return numberOne * numberTwo;
    }
    public Double division(Double numberOne, Double numberTwo){
        return numberOne / numberTwo;
    }
    public Double mean(Double numberOne, Double numberTwo){
        return (numberOne + numberTwo)/2;
    }
    public Double squareRoot(Double number){
        return (Double) Math.sqrt(number);
    }
}
