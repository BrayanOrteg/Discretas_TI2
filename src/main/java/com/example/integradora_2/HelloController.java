package com.example.integradora_2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Canvas cs;

    private GraphicsContext gc;

    @FXML
    private Button bttn;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = cs.getGraphicsContext2D();

        String uri="file:"+HelloApplication.class.getResource("pc.jpg").getPath();
        Image img=new Image(uri);



        gc.drawImage(img,0,0,cs.getWidth(),cs.getHeight());

        bttn.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 8;\n" +
                "    -fx-background-color:\n" +
                "    linear-gradient(from 0% 93% to 0% 100%, #a34313 0%, #903b12 100%),\n" +
                "        #9d4024,\n" +
                "                #d86e3a,\n" +
                "    radial-gradient(center 50% 50%, radius 100%, #d86e3a, #c54e2c);\n" +
                "    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 1.1em;");
    }

    @FXML
    private void onClick(){

        Stage stage = (Stage) bttn.getScene().getWindow();
        stage.close();

        HelloApplication.showWindow("selectionMenu.fxml");

    }



}