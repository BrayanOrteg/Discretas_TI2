package com.example.integradora_2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.File;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class RecomendationController implements Initializable{

    private Node<Integer,Component> cpu = null;

    private Node<Integer,Component> motherBoard = null;

    private Node<Integer,Component> ram = null;

    private Node<Integer,Component> gpu = null;

    private Node<Integer, Component> storage = null;

    @FXML
    private ListView<Node<Integer, Component>> cpuView = new ListView<>();

    private ObservableList<Node<Integer, Component>> cpus;

    @FXML
    private ListView<Node<Integer, Component>> motherView = new ListView<>();

    private ObservableList<Node<Integer, Component>> motherBoards;

    @FXML
    private ListView<Node<Integer, Component>> ramView = new ListView<>();

    private ObservableList<Node<Integer, Component>> rams;

    @FXML
    private ListView<Node<Integer, Component>> gpuView = new ListView<>();

    private ObservableList<Node<Integer, Component>> gpus;

    @FXML
    private ListView<Node<Integer, Component>> storageView = new ListView<>();

    private ObservableList<Node<Integer, Component>> storages;



    private MatrixGraph<Integer,Component> componentsGraph = MatrixGraph.getInstance();

    private  ObservableList<Node<Integer, Component>> result;




    private int status;


    @FXML
    private Button finishButton ;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        status=0;

        finishButton.setStyle("-fx-padding: 8 15 15 15;\n" +
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






        System.out.println("Hola");

        init(cpuView, ComponentType.CPU, gpus);

        cpuView.setCellFactory(param -> new ListCell<Node<Integer,Component>>() {
            private ImageView imageView = new ImageView();
            @Override
            public void updateItem(Node<Integer,Component> node, boolean empty) {
                super.updateItem(node, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                    setStyle("-fx-background-color: #a0887c");
                } else {
                    if(node==cpu){
                        setTextFill(Paint.valueOf("#FF0000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }else{
                        setTextFill(Paint.valueOf("#000000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }
                    setStyle("-fx-background-color: #a0887c");
                    imageView.setImage(node.getObject().getImage());
                    imageView.setFitHeight(64);
                    imageView.setFitWidth(64);
                    setGraphic(imageView);
                }
            }
        });

        init(motherView, ComponentType.MOTHERBOARD, motherBoards);

        motherView.setCellFactory(param -> new ListCell<Node<Integer,Component>>() {
            private ImageView imageView = new ImageView();
            @Override
            public void updateItem(Node<Integer,Component> node, boolean empty) {
                super.updateItem(node, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                    setStyle("-fx-background-color: #a0887c");
                } else {
                    if(node==motherBoard){
                        setTextFill(Paint.valueOf("#FF0000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }else{
                        setTextFill(Paint.valueOf("#000000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }
                    setStyle("-fx-background-color: #a0887c");
                    imageView.setImage(node.getObject().getImage());
                    imageView.setFitHeight(64);
                    imageView.setFitWidth(64);
                    setGraphic(imageView);
                }
            }
        });

        init(ramView, ComponentType.RAM, rams);

        ramView.setCellFactory(param -> new ListCell<Node<Integer,Component>>() {
            private ImageView imageView = new ImageView();
            @Override
            public void updateItem(Node<Integer,Component> node, boolean empty) {
                super.updateItem(node, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                    setStyle("-fx-background-color: #a0887c");
                } else {
                    if(node==ram){
                        setTextFill(Paint.valueOf("#FF0000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }else{
                        setTextFill(Paint.valueOf("#000000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }
                    setStyle("-fx-background-color: #a0887c");
                    imageView.setImage(node.getObject().getImage());
                    imageView.setFitHeight(64);
                    imageView.setFitWidth(64);
                    setGraphic(imageView);
                }
            }
        });

        init(gpuView, ComponentType.GPU, gpus);

        gpuView.setCellFactory(param -> new ListCell<Node<Integer,Component>>() {
            private ImageView imageView = new ImageView();
            @Override
            public void updateItem(Node<Integer,Component> node, boolean empty) {
                super.updateItem(node, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                    setStyle("-fx-background-color: #a0887c");
                } else {
                    if(node==gpu){
                        setTextFill(Paint.valueOf("#FF0000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }else{
                        setTextFill(Paint.valueOf("#000000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }
                    setStyle("-fx-background-color: #a0887c");
                    imageView.setImage(node.getObject().getImage());
                    imageView.setFitHeight(64);
                    imageView.setFitWidth(64);
                    setGraphic(imageView);
                }
            }
        });

        init(storageView, ComponentType.STORAGE, storages);

        storageView.setCellFactory(param -> new ListCell<Node<Integer,Component>>() {
            private ImageView imageView = new ImageView();
            @Override
            public void updateItem(Node<Integer,Component> node, boolean empty) {
                super.updateItem(node, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                } else {
                    if(node==storage){
                        setTextFill(Paint.valueOf("#FF0000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }else{
                        setTextFill(Paint.valueOf("#000000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }
                    setStyle("-fx-background-color: #a0887c");
                    imageView.setImage(node.getObject().getImage());
                    imageView.setFitHeight(64);
                    imageView.setFitWidth(64);
                    setGraphic(imageView);
                }
            }
        });



        System.out.println("Adios");
    }


    @FXML
    public void onClickCPU(){
        cpu = cpuView.getFocusModel().getFocusedItem();
        filter(cpu, motherView, ComponentType.MOTHERBOARD, motherBoards);
        filter(cpu, ramView, ComponentType.RAM, rams);
        filter(cpu, gpuView, ComponentType.GPU, gpus);
        filter(cpu, storageView, ComponentType.STORAGE, storages);
    }

    @FXML
    public void onClickMOTHERBOARD(){

        motherBoard = motherView.getFocusModel().getFocusedItem();
        //filter(motherBoard, cpuView, ComponentType.CPU, cpus);
        filter(motherBoard, ramView, ComponentType.RAM, rams);
        filter(motherBoard, gpuView, ComponentType.GPU, gpus);
        filter(motherBoard, storageView, ComponentType.STORAGE, storages);

    }

    @FXML
    public void onClickRAM(){

        ram = ramView.getFocusModel().getFocusedItem();
        //filter(ram, cpuView, ComponentType.CPU, cpus);
        //filter(ram, motherView, ComponentType.MOTHERBOARD, motherBoards);
        filter(ram, gpuView, ComponentType.GPU, gpus);
        filter(ram, storageView, ComponentType.STORAGE, storages);

    }

    @FXML
    public void onClickGPU(){
        gpu = gpuView.getFocusModel().getFocusedItem();
        //filter(gpu, cpuView, ComponentType.CPU, cpus);
        //filter(gpu, motherView, ComponentType.MOTHERBOARD, motherBoards);
        //filter(gpu, ramView, ComponentType.RAM, rams);
        filter(gpu, storageView, ComponentType.STORAGE, storages);

    }

    @FXML
    public void onClickSTORAGE(){
        storage = storageView.getFocusModel().getFocusedItem();
        //filter(storage, cpuView, ComponentType.CPU, cpus);
        //filter(storage, motherView, ComponentType.MOTHERBOARD, motherBoards);
        //filter(storage, ramView, ComponentType.RAM, rams);
        //filter(storage, gpuView, ComponentType.GPU, gpus);
    }

    @FXML
    public void calculate(){

        gpuView.setVisible(false);
        cpuView.setVisible(false);
        motherView.setVisible(false);
        storageView.setVisible(false);
        if(status==0) {
            if (cpu != null && motherBoard != null && ram != null && gpu != null && storage != null) {
                ArrayList<Node<Integer, Component>> components = new ArrayList<>();
                components.add(cpu);
                components.add(motherBoard);
                components.add(ram);
                components.add(gpu);
                components.add(storage);
                result = FXCollections.observableArrayList(components);

                ramView.setItems(result);
                status = 1;
            }
        }else {
            Stage stage = (Stage) finishButton.getScene().getWindow();
            HelloApplication.showWindow("selectionMenu.fxml");
            stage.close();
        }
    }

    public void init(ListView<Node<Integer,Component>> listView,  ComponentType componentType, ObservableList observableList){
        ArrayList<Node<Integer,Component>> filter = new ArrayList<>();

        for(Node<Integer,Component> n : componentsGraph.getVertices()){
            if(n.getObject().getComponentType()==componentType){
                filter.add(n);
            }
        }

        System.out.println(filter.size());

        listView.setItems(FXCollections.observableArrayList(filter));

    }

    public void filter(Node<Integer,Component> node, ListView<Node<Integer,Component>> listView,  ComponentType componentType, ObservableList observableList){
        ArrayList<Node<Integer,Component>> filter = new ArrayList<>();

        for(Node<Integer,Component> n : componentsGraph.BFS(node)){
            if(n.getObject().getComponentType()==componentType&&n.getColor()==Colors.BLACK){
                filter.add(n);
            }
        }

        System.out.println(filter.size());

        listView.setItems(FXCollections.observableArrayList(filter));

    }

}