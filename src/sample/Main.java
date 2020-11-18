package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage Stage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Controller cc = loader.getController();
        cc.setConverter(new CurrencyConverter());

        Stage.setTitle("Hello World");
        Stage.setScene(new Scene(root));
        Stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
