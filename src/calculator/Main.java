package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{
            //załadowanie pliku fxml
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("temp.fxml"));
            Parent layout = fxmlLoader.load();
            Scene scene = new Scene(layout);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Kalkulator");
            primaryStage.show();
        }
        public static void main(String[] args) { launch(args); }
    }







