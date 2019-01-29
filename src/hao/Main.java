package hao;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 应用入口类
 */
public class Main extends Application {
    public static void main(String[] args) {
       launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/main.fxml"));
        primaryStage.setTitle("便便签");//TODO 改成constant常量
        primaryStage.setScene(new Scene(root, 300, 400));//TODO 改成constant常量
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();
    }
}

