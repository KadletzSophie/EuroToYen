package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 * @author Sophie Kadletz
 * @version 18.11.2020
 */

public class Controller{
    private CurrencyConverter cc;
    @FXML private TextField euroText;
    @FXML private TextField yenText;
    @FXML private ChoiceBox currency_chbox;

    @FXML
    private void doConvertion() {
        double euro = 0;
        try {
            euro = Double.parseDouble(euroText.getText());
        } catch (Exception ex) {
            System.out.println("Geben Sie bitte einen numerischen Wert ein!");
        }

        String sign = currency_chbox.getValue().toString();
        double tmp = cc.euroTo(euro, sign);
        if (tmp != -1d) {
            yenText.setText(Double.toString(tmp));
        } else {
            yenText.setText("--");
        }
        //yenText.setText(new CurrencyConverter().currency);
    }

    @FXML
    private void initialize() {
        currency_chbox.getItems().addAll("Yen", "US-Dollar");
        //Set default value
        currency_chbox.setValue("Yen");
        //currency_chbox.getSelectionModel().select(0);  default value is first value of ChoiceBox
        cc = new CurrencyConverter();
    }
}
