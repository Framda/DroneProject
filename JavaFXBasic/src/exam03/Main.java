package exam03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void init() throws Exception {
        System.out.println("init()");
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("start()");
        primaryStage.setTitle("My JavaFX window");


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
        BorderPane Pane = (BorderPane) fxmlLoader.load();

        Scene scene = new Scene(Pane);
        primaryStage.setScene(scene);


        primaryStage.setWidth(1280);
        primaryStage.setHeight(720);

        primaryStage.show();
    }
    @Override
    public void stop() throws Exception {
        System.out.println("stop()");
    }

    public static void main(String[] args) {
        launch(args);
        System.out.println("Main Method Run");
    }
}