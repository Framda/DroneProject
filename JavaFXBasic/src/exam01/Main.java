package exam01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
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

        //primaryStage.setWidth(1280);
        //primaryStage.setHeight(720);
        primaryStage.setMaximized(true);

        Scene scene = new Scene(new AnchorPane());
        primaryStage.setScene(scene);

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