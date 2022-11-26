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



    @FXML
    private ListView<Node<Integer, Component>> motherView = new ListView<>();



    @FXML
    private ListView<Node<Integer, Component>> ramView = new ListView<>();



    @FXML
    private ListView<Node<Integer, Component>> gpuView = new ListView<>();



    @FXML
    private ListView<Node<Integer, Component>> storageView = new ListView<>();




    private MatrixGraph<Integer,Component> componentsGraph = MatrixGraph.getInstance();

    private  ObservableList<Node<Integer, Component>> result;


  @FXML
  private Label cpuLabel,boardLabel,ramLabel, gpuLabel, storageLabel, priceLabel;

    @FXML
    private Canvas canvas;

    private GraphicsContext gc;


    private int status;


    @FXML
    private Button finishButton, restartButton ;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        gc= canvas.getGraphicsContext2D();
        gc.setFill(Color.GREY);
        gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());


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

        restartButton.setStyle("-fx-padding: 8 15 15 15;\n" +
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








        init(cpuView, ComponentType.CPU);

        cpuView.setCellFactory(param -> new ListCell<Node<Integer,Component>>() {
            private ImageView imageView = new ImageView();
            @Override
            public void updateItem(Node<Integer,Component> node, boolean empty) {
                super.updateItem(node, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                    
                } else {
                    if(node==cpu){
                        setTextFill(Paint.valueOf("#FF0000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }else{
                        setTextFill(Paint.valueOf("#000000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }
                    
                    imageView.setImage(node.getObject().getImage());
                    imageView.setFitHeight(64);
                    imageView.setFitWidth(64);
                    setGraphic(imageView);
                }
            }
        });

        init(motherView, ComponentType.MOTHERBOARD);

        motherView.setCellFactory(param -> new ListCell<Node<Integer,Component>>() {
            private ImageView imageView = new ImageView();
            @Override
            public void updateItem(Node<Integer,Component> node, boolean empty) {
                super.updateItem(node, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                    
                } else {
                    if(node==motherBoard){
                        setTextFill(Paint.valueOf("#FF0000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }else{
                        setTextFill(Paint.valueOf("#000000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }
                    
                    imageView.setImage(node.getObject().getImage());
                    imageView.setFitHeight(64);
                    imageView.setFitWidth(64);
                    setGraphic(imageView);
                }
            }
        });

        init(ramView, ComponentType.RAM);

        ramView.setCellFactory(param -> new ListCell<Node<Integer,Component>>() {
            private ImageView imageView = new ImageView();
            @Override
            public void updateItem(Node<Integer,Component> node, boolean empty) {
                super.updateItem(node, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                    
                } else {
                    if(node==ram){
                        setTextFill(Paint.valueOf("#FF0000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }else{
                        setTextFill(Paint.valueOf("#000000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }
                    
                    imageView.setImage(node.getObject().getImage());
                    imageView.setFitHeight(64);
                    imageView.setFitWidth(64);
                    setGraphic(imageView);
                }
            }
        });

        init(gpuView, ComponentType.GPU);

        gpuView.setCellFactory(param -> new ListCell<Node<Integer,Component>>() {
            private ImageView imageView = new ImageView();
            @Override
            public void updateItem(Node<Integer,Component> node, boolean empty) {
                super.updateItem(node, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                    
                } else {
                    if(node==gpu){
                        setTextFill(Paint.valueOf("#FF0000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }else{
                        setTextFill(Paint.valueOf("#000000"));
                        setText(node.getObject().getName() + "\n" + node.getObject().getPrice());
                    }
                    
                    imageView.setImage(node.getObject().getImage());
                    imageView.setFitHeight(64);
                    imageView.setFitWidth(64);
                    setGraphic(imageView);
                }
            }
        });

        init(storageView, ComponentType.STORAGE);

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
                    
                    imageView.setImage(node.getObject().getImage());
                    imageView.setFitHeight(64);
                    imageView.setFitWidth(64);
                    setGraphic(imageView);
                }
            }
        });




    }


    @FXML
    public void onClickCPU(){
       cpu = cpuView.getFocusModel().getFocusedItem();

        if(cpu != null){
            ArrayList<Node<Integer, Component>> cpuArray = new ArrayList<>();
            cpuArray.add(cpu);
            cpuView.setItems(FXCollections.observableArrayList(cpuArray));

            filter(cpu, motherView, ComponentType.MOTHERBOARD);
            filter(cpu, ramView, ComponentType.RAM);
            filter(cpu, gpuView, ComponentType.GPU);
            filter(cpu, storageView, ComponentType.STORAGE);
        }
    }

    @FXML
    public void onClickMOTHERBOARD() {

        motherBoard = motherView.getFocusModel().getFocusedItem();

        if (motherBoard != null && cpu!=null) {
            ArrayList<Node<Integer, Component>> boardArray = new ArrayList<>();
            boardArray.add(motherBoard);
            motherView.setItems(FXCollections.observableArrayList(boardArray));

            //filter(motherBoard, cpuView, ComponentType.CPU, cpus);
            filter(motherBoard, ramView, ComponentType.RAM);
            filter(motherBoard, gpuView, ComponentType.GPU);
            filter(motherBoard, storageView, ComponentType.STORAGE);
        }


    }

    @FXML
    public void onClickRAM(){

        if(status==0) {
            ram = ramView.getFocusModel().getFocusedItem();


            if (ram != null && motherBoard != null) {
                ArrayList<Node<Integer, Component>> ramArray = new ArrayList<>();
                ramArray.add(ram);
                ramView.setItems(FXCollections.observableArrayList(ramArray));

                //filter(ram, cpuView, ComponentType.CPU, cpus);
                //filter(ram, motherView, ComponentType.MOTHERBOARD, motherBoards);

                filter(ram, gpuView, ComponentType.GPU);
                filter(ram, storageView, ComponentType.STORAGE);
            }
        }

    }

    @FXML
    public void onClickGPU(){
        gpu = gpuView.getFocusModel().getFocusedItem();

        if(gpu != null && ram != null){
            ArrayList<Node<Integer, Component>> gpuArray = new ArrayList<>();
            gpuArray.add(gpu);


            gpuView.setItems(FXCollections.observableArrayList(gpuArray));
            filter(gpu, storageView, ComponentType.STORAGE);
        }

        //filter(gpu, cpuView, ComponentType.CPU, cpus);
        //filter(gpu, motherView, ComponentType.MOTHERBOARD, motherBoards);
        //filter(gpu, ramView, ComponentType.RAM, rams);



    }

    @FXML
    public void onClickSTORAGE(){

        storage = storageView.getFocusModel().getFocusedItem();


        if(storage != null && gpu != null){
            ArrayList<Node<Integer, Component>> storageArray = new ArrayList<>();
            storageArray.add(storage);
            storageView.setItems(FXCollections.observableArrayList(storageArray));
        }

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
            cpuLabel.setVisible(false);
            gpuLabel.setVisible(false);
            storageLabel.setVisible(false);
            boardLabel.setVisible(false);
            ramLabel.setText("Build");
            restartButton.setVisible(false);
            status = 1;
            if (cpu != null && motherBoard != null && ram != null && gpu != null && storage != null) {
                ArrayList<Node<Integer, Component>> components = new ArrayList<>();
                components.add(cpu);
                components.add(motherBoard);
                components.add(ram);
                components.add(gpu);
                components.add(storage);
                result = FXCollections.observableArrayList(components);

                ramView.setItems(result);

                int cost = 0;
                for(int i=0; i<result.size(); i++){
                    cost+=result.get(i).getObject().getPrice();
                }
                priceLabel.setVisible(true);
                priceLabel.setText("El precio de tu build es de $"+cost);

            }
            else {
                ramView.setItems(result);
            }
        }else {
            Stage stage = (Stage) finishButton.getScene().getWindow();
            HelloApplication.showWindow("selectionMenu.fxml");
            stage.close();
        }
    }

    public void init(ListView<Node<Integer,Component>> listView,  ComponentType componentType){
        ArrayList<Node<Integer,Component>> filter = new ArrayList<>();

        for(Node<Integer,Component> n : componentsGraph.getVertices()){
            if(n.getObject().getComponentType()==componentType){
                filter.add(n);
            }
        }



        listView.setItems(FXCollections.observableArrayList(filter));

    }

    public void filter(Node<Integer,Component> node, ListView<Node<Integer,Component>> listView,  ComponentType componentType){
        ArrayList<Node<Integer,Component>> filter = new ArrayList<>();

        for(Node<Integer,Component> n : componentsGraph.BFS(node)){
            if(n.getObject().getComponentType()==componentType&&n.getColor()==Colors.BLACK){
                filter.add(n);
            }
        }



        listView.setItems(FXCollections.observableArrayList(filter));

    }

    @FXML
    public void restart(){
        init(gpuView, ComponentType.GPU);
        init(motherView, ComponentType.MOTHERBOARD);
        init(ramView, ComponentType.RAM);
        init(cpuView, ComponentType.CPU);
        init(storageView, ComponentType.STORAGE);

        cpu=null;
        motherBoard=null;
        gpu=null;
        ram=null;
        storage=null;
    }

}