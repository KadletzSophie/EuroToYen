package sample;

/**
 * @author Sophie Kadletz
 * @version 23.11.2020
 */

public class Currency {
    private String sign;
    private double value;

    public String getSign() {
        return sign;
    }


    public double getValue() {
        return value;
    }


    public Currency(String sign, double value) {
        this.sign = sign;
        this.value = value;
    }
}
