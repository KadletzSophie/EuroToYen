package sample;

public class Currency {
    private String sign;
    private double value;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }



    public Currency(String sign, double value) {
        this.sign = sign;
        this.value = value;
    }
}
