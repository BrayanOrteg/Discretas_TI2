package com.example.integradora_2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ChooserController implements Initializable{

    private Node<Integer,Component> start = null;

    private Node<Integer, Component> end = null;

    @FXML
    private ListView<Node<Integer, Component>> componentsView = new ListView<>();

    private Graph<Integer,Component> componentsGraph = Graph.getInstance();

    private ObservableList<Node<Integer, Component>> components;

    private  ObservableList<Node<Integer, Component>> result;




    @FXML
    private Canvas canvas;

    private GraphicsContext gc;

    private int status;


    @FXML
    private Button nextBttn ;

    @FXML
    private Label ComponentName ;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        gc= canvas.getGraphicsContext2D();
        status=0;
        ComponentName.setText("CPU");



        File file= new File("images\\armando.jpg");

        Image img=new Image(file.getAbsolutePath());

        gc.drawImage(img,0,0,canvas.getWidth(),canvas.getHeight());


        System.out.println("Hola");

        filter(ComponentType.CPU);

        componentsView.setCellFactory(param -> new ListCell<Node<Integer,Component>>() {
            private ImageView imageView = new ImageView();
            @Override
            public void updateItem(Node<Integer,Component> node, boolean empty) {
                super.updateItem(node, empty);
                    if (empty) {
                        setText(null);
                        setGraphic(null);
                        setStyle("-fx-background-color: #a0887c");
                    } else {
                        setStyle("-fx-background-color: #a0887c");
                        imageView.setImage(node.getObject().getImage());
                        imageView.setFitHeight(64);
                        imageView.setFitWidth(64);
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                        setGraphic(imageView);
                }
            }
        });



        System.out.println("Adios");
    }

    @FXML
    public void showInfo(){
        System.out.println("holi");
    }

    @FXML
    public void nextClick(){

        if(status==0){
            if(start==null){
                start = componentsView.getFocusModel().getFocusedItem();
            }
            nextComp(ComponentType.STORAGE);
            status=1;
            ComponentName.setText("Storage");
        }else if (status==1){
            status=2;
            if(end == null){
                end = componentsView.getFocusModel().getFocusedItem();

            }
            ComponentName.setText("Resultado");
            nextBttn.setText("Terminar");

            result = FXCollections.observableArrayList(componentsGraph.dijkstra(start.getKey(),end.getKey()));
            int cost = 0;
            for(int i=0; i<result.size(); i++){
                cost+=result.get(i).getObject().getPrice();
            }
            System.out.println(cost);
            componentsView.setItems(result);

        }
        else{
            Stage stage = (Stage) nextBttn.getScene().getWindow();
            stage.close();

            HelloApplication.showWindow("selectionMenu.fxml");
        }
    }


    public void nextComp(ComponentType componentType){
        filter(componentType);
        componentsView.setCellFactory(param -> new ListCell<Node<Integer,Component>>() {
            private ImageView imageView = new ImageView();
            @Override
            public void updateItem(Node<Integer,Component> node, boolean empty) {
                super.updateItem(node, empty);
                    if (empty) {
                        setText(null);
                        setGraphic(null);
                        setStyle("-fx-background-color: #a0887c");
                    } else {

                        setStyle("-fx-background-color: #a0887c");
                        imageView.setImage(node.getObject().getImage());
                        imageView.setFitHeight(64);
                        imageView.setFitWidth(64);
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                        setGraphic(imageView);
                    }
                }
        });

    }

    public void filter(ComponentType componentType){
        ArrayList<Node<Integer,Component>> filter = new ArrayList<>();

        for(Node<Integer,Component> n : componentsGraph.getVertices()){
            if(n.getObject().getComponentType()==componentType){
                filter.add(n);
            }
        }

        components = FXCollections.observableArrayList(filter);

        componentsView.setItems(components);

    }

}