package com.example.integradora_2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    @FXML
    private Canvas cs2;

    private GraphicsContext gc;

    @FXML
    private Button chooser1;

    @FXML
    private Button recomendation;





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = cs2.getGraphicsContext2D();



        File file= new File("images\\imagen2.jpg");

        Image img=new Image(file.getAbsolutePath());

        gc.drawImage(img,0,0,cs2.getWidth(),cs2.getHeight());

        chooser1.setStyle("-fx-padding: 8 15 15 15;\n" +
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

        recomendation.setStyle("-fx-padding: 8 15 15 15;\n" +
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
    private void onClick1(){

        Stage stage = (Stage) chooser1.getScene().getWindow();
        HelloApplication.showWindow("chooserMenu.fxml");
        stage.close();
    }

    @FXML
    private void onClick2(){

        Stage stage = (Stage) recomendation.getScene().getWindow();
        HelloApplication.showWindow("recomendationChooser.fxml");
        stage.close();
    }





}
