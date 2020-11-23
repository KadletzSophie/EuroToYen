package sample;

import java.util.ArrayList;

/**
 * @author Sophie Kadletz
 * @version 18.11.2020
 */

public class CurrencyConverter  {
    private ArrayList<Currency> data = new ArrayList<Currency>();

    public CurrencyConverter(){
        data.add(new Currency("Yen",124.00));
        data.add(new Currency("US-Dollar", 1.19));
    }

    public double euroTo(double euro, String sign){
        double tmp = -1;
        for(Currency currency : data) {
            if (currency.getSign().equals(sign)) {
                tmp = euro * currency.getValue();
            }
        }
        return tmp;
    }
}
