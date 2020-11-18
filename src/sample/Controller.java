package sample;

import javafx.scene.control.TextField;

/**
 * @author Sophie Kadletz
 * @version 18.11.2020
 */

public class Controller{
    //public CurrencyConverter cc;
    public TextField euroText;
    public TextField yenText;

    public void doConvertion()
    {
        double euro = 0;
        try
        {
            euro = Double.parseDouble(euroText.getText());
        }
        catch(Exception ex)
        {
            System.out.println("Geben Sie bitte einen numerischen Wert ein!");
        }
        yenText.setText(Double.toString(new CurrencyConverter().euroToYen(euro)));
    }

    // public void setConverter(CurrencyConverter currencyConverter) {cc = currencyConverter;}
}
