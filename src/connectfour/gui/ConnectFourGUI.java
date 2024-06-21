package connectfour.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ConnectFourGUI extends Application {


    public void start(Stage stage) throws Exception{

        Label label = new Label("test");
        FlowPane fp = new FlowPane();
        fp.getChildren().add(label);
        Scene scene = new Scene(fp);
        stage.setScene(scene);
        stage.setTitle("Title");
        stage.setWidth(200);
        stage.setResizable(false);
        stage.show();

    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
