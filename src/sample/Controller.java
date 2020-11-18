package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller{
    private CurrencyConverter cc;

    @FXML
    private TextField euroText;

    @FXML
    private TextField yenText;

    @FXML
    void doConvertion(ActionEvent event) {
        try {
            System.out.println(euroText.getText());
            double euro = Double.parseDouble(euroText.getText());
            yenText.setText(Double.toString(cc.euroToYen(euro)));
        }
        catch(Exception ex) {
            System.out.println("Geben Sie bitte einen numerischen Wert ein!");
        }
    }

    public void setConverter(CurrencyConverter currencyConverter) {
        cc = currencyConverter;
    }

}
