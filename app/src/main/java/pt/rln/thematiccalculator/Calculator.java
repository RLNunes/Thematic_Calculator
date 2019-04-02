package pt.rln.thematiccalculator;

public class Calculator {

    private double getDouble(String s){
        return Double.parseDouble(s);
    }

    public String addition(String s1, String s2){
        return Double.toString(getDouble(s1) + getDouble(s2));
    }

    public String subtraction(String s1, String s2) {
        return Double.toString(getDouble(s1) - getDouble(s2));
    }

    public String multiplication(String s1, String s2) {
        return Double.toString(getDouble(s1) * getDouble(s2));
    }

    public String division(String s1, String s2) {
        return Double.toString(getDouble(s1) / getDouble(s2));
    }

    public String square_root(String s1){
        return Double.toString(Math.sqrt(getDouble(s1)));
    }

    public String exponential(String s1){
        return Double.toString(Math.exp(getDouble(s1)));
    }
}
