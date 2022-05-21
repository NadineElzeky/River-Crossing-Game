package game;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;



public class AlertBox {
  static   Controller c=new Controller();

    public void Display(String title,String message)
    {
        Stage window=new Stage();
     window.initModality(Modality.APPLICATION_MODAL);
     window.setTitle(title);
     window.setMinWidth(250);
     Label label1=new Label();
     label1.setText(message);
     Button CloseButton = new Button("Continue");
     CloseButton.setOnAction(e->window.close());
     VBox layout=new VBox(20);
     layout.getChildren().addAll(label1,CloseButton);
     layout.setAlignment(Pos.CENTER);
     Scene scene =new Scene(layout);
     window.setScene(scene);
     window.showAndWait();

    }
    public void Display2(String title,String message)
    {
        Stage window=new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        Label label1=new Label();
        label1.setText(message);
        Button CloseButton = new Button("Continue2");
        CloseButton.setOnAction(e->
        {

            try {
                c.newscene("/application/start.fxml");

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            window.close();
        });
        VBox layout=new VBox(20);
        layout.getChildren().addAll(label1,CloseButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene =new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
}
