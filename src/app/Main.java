package app;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../views/mainframe.fxml"));
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("../resources/img/logo.png")));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
