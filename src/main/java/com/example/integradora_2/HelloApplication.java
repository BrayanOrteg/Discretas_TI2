package com.example.integradora_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Inicio");
        stage.setScene(scene);
        stage.show();
    }

    public static void showWindow(String fxml) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        Graph graph= new Graph<>();

        MatrixGraph graph2= new MatrixGraph<>();

        graph= Graph.getInstance();
        graph2= MatrixGraph.getInstance();


        try {

            ArrayList <Component> components=new ArrayList<>();

            //Procesador
            components.add(new Component("AMD Ryzen 5 3600",100,"https://seeklogo.com/images/A/amd-logo-39A651FD6F-seeklogo.com.png","",ComponentType.CPU ));
            components.add(new Component("AMD Ryzen 7 3700X",200,"https://seeklogo.com/images/A/amd-logo-39A651FD6F-seeklogo.com.png","",ComponentType.CPU));
            components.add(new Component("AMD Ryzen 5 3600",100,"https://seeklogo.com/images/A/amd-logo-39A651FD6F-seeklogo.com.png","",ComponentType.CPU ));
            components.add(new Component("Intel Core i5-9400F",120,"https://findicons.com/files/icons/2794/metro_ui/512/intel.png","",ComponentType.CPU ));
            components.add(new Component("AMD Ryzen 7 5800X",220,"https://seeklogo.com/images/A/amd-logo-39A651FD6F-seeklogo.com.png","",ComponentType.CPU ));
            components.add(new Component("Intel Core i5-10400",210,"https://findicons.com/files/icons/2794/metro_ui/512/intel.png","",ComponentType.CPU ));
            components.add(new Component("Intel Core i5-10600K.",220,"https://findicons.com/files/icons/2794/metro_ui/512/intel.png","",ComponentType.CPU ));
            components.add(new Component("AMD Ryzen 9 3900X",240,"https://seeklogo.com/images/A/amd-logo-39A651FD6F-seeklogo.com.png","",ComponentType.CPU ));
            components.add(new Component("AMD Ryzen 5 5600X",150,"https://seeklogo.com/images/A/amd-logo-39A651FD6F-seeklogo.com.png","",ComponentType.CPU ));
            components.add(new Component("Intel Core i9-9900",270,"https://findicons.com/files/icons/2794/metro_ui/512/intel.png","",ComponentType.CPU ));

            //MotherBoard
            components.add(new Component("MSI X470 GAMING PLUS MAX",300,"https://i.pinimg.com/originals/ee/70/a9/ee70a90951e6115e8b759744ad4ca29a.png","",ComponentType.MOTHERBOARD));
            components.add(new Component("ASUS Prime B365M-A",250,"https://logos-world.net/wp-content/uploads/2020/08/Asus-Logo-2022.png","",ComponentType.MOTHERBOARD));
            components.add(new Component("ASUS ROG Strix Z490-E Gaming",350,"https://logos-world.net/wp-content/uploads/2020/08/Asus-Logo-2022.png","",ComponentType.MOTHERBOARD));
            components.add(new Component("ASUS TUF GAMING B550-PLUS",300,"https://logos-world.net/wp-content/uploads/2020/08/Asus-Logo-2022.png","",ComponentType.MOTHERBOARD));
            components.add(new Component("MSI X570-A Pro",150,"https://i.pinimg.com/originals/ee/70/a9/ee70a90951e6115e8b759744ad4ca29a.png","",ComponentType.MOTHERBOARD));
            components.add(new Component("Gigabyte X570 AORUS Master",350,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.MOTHERBOARD));
            components.add(new Component("MSI MPG B550 GAMING PLUS",150,"https://i.pinimg.com/originals/ee/70/a9/ee70a90951e6115e8b759744ad4ca29a.png","",ComponentType.MOTHERBOARD));
            components.add(new Component("Gigabyte B550M DS3H",450,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.MOTHERBOARD));
            components.add(new Component("Gigabyte B550M DS3H",450,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.MOTHERBOARD));
            components.add(new Component("Gigabyte B450 AORUS Elite",400,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.MOTHERBOARD));

            //Ram
            components.add(new Component("HyperX Fury DDR4",50,"https://www.qloud.ar/SITES/IMG/dassigrup-05-2022/261_06-05-2022-04-05-18-08-06-2020-11-06-48-hyperx.jpg","",ComponentType.RAM));
            components.add(new Component("Corsair Vengeance LPX DDR4",60,"https://overclock3d.net/gfx/articles/2015/06/01095702500l.jpg","",ComponentType.RAM));
            components.add(new Component("Kingston HyperX Fury DDR3",50,"https://brandslogos.com/wp-content/uploads/images/kingston-logo-1.png","",ComponentType.RAM));
            components.add(new Component("Corsair Vengeance RGB PRO DDR4",70,"https://overclock3d.net/gfx/articles/2015/06/01095702500l.jpg","",ComponentType.RAM));
            components.add(new Component("corsair Value Select DDR4",80,"https://overclock3d.net/gfx/articles/2015/06/01095702500l.jpg","",ComponentType.RAM));
            components.add(new Component("Crucial DDR3",65,"https://m.media-amazon.com/images/S/stores-image-uploads-eu-prod/8/AmazonStores/A21TJRUUN4KGV/988953bb848a8e78b2e3c19e94ed8b0c.w400.h400.png","",ComponentType.RAM));
            components.add(new Component("Timetec Hynix IC DDR3",60,"https://m.media-amazon.com/images/S/abs-image-upload-na/f/AmazonStores/ATVPDKIKX0DER/881bf2ff5637c3161c6a511750ff71d5.w500.h500.jpg","",ComponentType.RAM));
            components.add(new Component("Crucial Ballistix y Ballistix MAX DDR4",85,"https://m.media-amazon.com/images/S/stores-image-uploads-eu-prod/8/AmazonStores/A21TJRUUN4KGV/988953bb848a8e78b2e3c19e94ed8b0c.w400.h400.png","",ComponentType.RAM));
            components.add(new Component("Kingston ValueRAM DDR3",60,"https://brandslogos.com/wp-content/uploads/images/kingston-logo-1.png","",ComponentType.RAM));
            components.add(new Component("HyperX Predator DDR4",75,"https://www.qloud.ar/SITES/IMG/dassigrup-05-2022/261_06-05-2022-04-05-18-08-06-2020-11-06-48-hyperx.jpg","",ComponentType.RAM));

            //Gpu
            components.add(new Component("ASUS ROG Strix GeForce RTX 2060 Super EVO",120,"https://logos-world.net/wp-content/uploads/2020/08/Asus-Logo-2022.png","",ComponentType.GPU));
            components.add(new Component("Gigabyte GeForce RTX 3070 Vision OC",320,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.GPU));
            components.add(new Component("Gigabyte GeForce GTX 1650",150,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.GPU));
            components.add(new Component("Gigabyte GeForce RTX 2060 WINDFORCE OC 6G",250,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.GPU));
            components.add(new Component("ASUS GeForce RTX 3070 Dual OC",350,"https://logos-world.net/wp-content/uploads/2020/08/Asus-Logo-2022.png","",ComponentType.GPU));
            components.add(new Component("Gigabyte AORUS GeForce RTX 3070 MASTER",400,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.GPU));
            components.add(new Component("Asus GeForce GTX 1650 Phoenix",300,"https://logos-world.net/wp-content/uploads/2020/08/Asus-Logo-2022.png","",ComponentType.GPU));
            components.add(new Component("ASUS Cerberus GeForce GTX 1050 Ti OC Edition",150,"https://logos-world.net/wp-content/uploads/2020/08/Asus-Logo-2022.png","",ComponentType.GPU));
            components.add(new Component("MSI Radeon RX 570 Armor ARMOR 8G OC",350,"https://i.pinimg.com/originals/ee/70/a9/ee70a90951e6115e8b759744ad4ca29a.png","",ComponentType.GPU));
            components.add(new Component("GIGABYTE GEFORCE RTX 2080 SUPER WINDFORCE OC",280,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.GPU));

            //Storage
            components.add(new Component("Crucial BX500, 480 GB",37,"https://m.media-amazon.com/images/S/stores-image-uploads-eu-prod/8/AmazonStores/A21TJRUUN4KGV/988953bb848a8e78b2e3c19e94ed8b0c.w400.h400.png","",ComponentType.STORAGE));
            components.add(new Component("Kingston A400, 240 GB",20,"https://brandslogos.com/wp-content/uploads/images/kingston-logo-1.png","",ComponentType.STORAGE));
            components.add(new Component("Kingston KC2500, 500 GB",80,"https://brandslogos.com/wp-content/uploads/images/kingston-logo-1.png","",ComponentType.STORAGE));
            components.add(new Component("Samsung 870 QVO, 1 TB",80,"https://vectorseek.com/wp-content/uploads/2021/01/Samsung-Logo-Vector-scaled.jpg","",ComponentType.STORAGE));
            components.add(new Component("Samsung 990 Pro, 1 TB",200,"https://vectorseek.com/wp-content/uploads/2021/01/Samsung-Logo-Vector-scaled.jpg","",ComponentType.STORAGE));
            components.add(new Component("Samsung 970 EVO Plus, 500 GB",60,"https://vectorseek.com/wp-content/uploads/2021/01/Samsung-Logo-Vector-scaled.jpg","",ComponentType.STORAGE));
            components.add(new Component("Corsair MP400, 1 TB",300,"https://overclock3d.net/gfx/articles/2015/06/01095702500l.jpg","",ComponentType.STORAGE));
            components.add(new Component("Samsung 960 EVO Plus, 500 GB",100,"https://vectorseek.com/wp-content/uploads/2021/01/Samsung-Logo-Vector-scaled.jpg","",ComponentType.STORAGE));
            components.add(new Component("Samsung 870 QVO, 1 TB",80,"https://vectorseek.com/wp-content/uploads/2021/01/Samsung-Logo-Vector-scaled.jpg","",ComponentType.STORAGE));
            components.add(new Component("Samsung 980 PRO, 500 GB",140,"https://vectorseek.com/wp-content/uploads/2021/01/Samsung-Logo-Vector-scaled.jpg","",ComponentType.STORAGE));

            components.add(new Component("Final point",0,"https://img.freepik.com/vector-premium/dibujos-animados-lindo-monitor_274619-680.jpg","",null));

            for(int i=0; i<51;i++){

                graph.addNode(i+1,components.get(i));
                graph2.addNode(i+1,components.get(i));


            }


//            //Componente 1 - Procesador
//            graph.addNode(1,new Component("AMD Ryzen 5 3600",100,"https://seeklogo.com/images/A/amd-logo-39A651FD6F-seeklogo.com.png","",ComponentType.CPU ));
//            graph.addNode(2,new Component("AMD Ryzen 7 3700X",200,"https://seeklogo.com/images/A/amd-logo-39A651FD6F-seeklogo.com.png","",ComponentType.CPU));
//            graph.addNode(3,new Component("Intel Core i7-10700K",250,"https://findicons.com/files/icons/2794/metro_ui/512/intel.png","",ComponentType.CPU ));
//            graph.addNode(4,new Component("Intel Core i5-9400F",120,"https://findicons.com/files/icons/2794/metro_ui/512/intel.png","",ComponentType.CPU ));
//            graph.addNode(5,new Component("AMD Ryzen 7 5800X",220,"https://seeklogo.com/images/A/amd-logo-39A651FD6F-seeklogo.com.png","",ComponentType.CPU ));
//            graph.addNode(6,new Component("Intel Core i5-10400",210,"https://findicons.com/files/icons/2794/metro_ui/512/intel.png","",ComponentType.CPU ));
//            graph.addNode(7,new Component("Intel Core i5-10600K.",220,"https://findicons.com/files/icons/2794/metro_ui/512/intel.png","",ComponentType.CPU ));
//            graph.addNode(8,new Component("AMD Ryzen 9 3900X",240,"https://seeklogo.com/images/A/amd-logo-39A651FD6F-seeklogo.com.png","",ComponentType.CPU ));
//            graph.addNode(9,new Component("AMD Ryzen 5 5600X",150,"https://seeklogo.com/images/A/amd-logo-39A651FD6F-seeklogo.com.png","",ComponentType.CPU ));
//            graph.addNode(10,new Component("Intel Core i9-9900",270,"https://findicons.com/files/icons/2794/metro_ui/512/intel.png","",ComponentType.CPU ));
//
//            //Componente 2 - MotherBoard
//
//            graph.addNode(11,new Component("MSI X470 GAMING PLUS MAX",300,"https://i.pinimg.com/originals/ee/70/a9/ee70a90951e6115e8b759744ad4ca29a.png","",ComponentType.MOTHERBOARD));
//            graph.addNode(12,new Component("ASUS Prime B365M-A",250,"https://logos-world.net/wp-content/uploads/2020/08/Asus-Logo-2022.png","",ComponentType.MOTHERBOARD));
//            graph.addNode(13,new Component("ASUS ROG Strix Z490-E Gaming",350,"https://logos-world.net/wp-content/uploads/2020/08/Asus-Logo-2022.png","",ComponentType.MOTHERBOARD));
//            graph.addNode(14,new Component("ASUS TUF GAMING B550-PLUS",300,"https://logos-world.net/wp-content/uploads/2020/08/Asus-Logo-2022.png","",ComponentType.MOTHERBOARD));
//            graph.addNode(15,new Component("MSI X570-A Pro",150,"https://i.pinimg.com/originals/ee/70/a9/ee70a90951e6115e8b759744ad4ca29a.png","",ComponentType.MOTHERBOARD));
//            graph.addNode(16,new Component("Gigabyte X570 AORUS Master",350,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.MOTHERBOARD));
//            graph.addNode(17,new Component("MSI MPG B550 GAMING PLUS",150,"https://i.pinimg.com/originals/ee/70/a9/ee70a90951e6115e8b759744ad4ca29a.png","",ComponentType.MOTHERBOARD));
//            graph.addNode(18,new Component("Gigabyte B550M DS3H",450,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.MOTHERBOARD));
//            graph.addNode(19,new Component("ASUS ROG Strix B550-F Gaming",150,"https://logos-world.net/wp-content/uploads/2020/08/Asus-Logo-2022.png","",ComponentType.MOTHERBOARD));
//            graph.addNode(20,new Component("Gigabyte B450 AORUS Elite",400,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.MOTHERBOARD));
//
//            //Componente 3 - Ram
//            graph.addNode(21,new Component("HyperX Fury DDR4",50,"https://www.qloud.ar/SITES/IMG/dassigrup-05-2022/261_06-05-2022-04-05-18-08-06-2020-11-06-48-hyperx.jpg","",ComponentType.RAM));
//            graph.addNode(22,new Component("Corsair Vengeance LPX DDR4",60,"https://overclock3d.net/gfx/articles/2015/06/01095702500l.jpg","",ComponentType.RAM));
//            graph.addNode(23,new Component("Kingston HyperX Fury DDR3",50,"https://brandslogos.com/wp-content/uploads/images/kingston-logo-1.png","",ComponentType.RAM));
//            graph.addNode(24,new Component("Corsair Vengeance RGB PRO DDR4",70,"https://overclock3d.net/gfx/articles/2015/06/01095702500l.jpg","",ComponentType.RAM));
//            graph.addNode(25,new Component("corsair Value Select DDR4",80,"https://overclock3d.net/gfx/articles/2015/06/01095702500l.jpg","",ComponentType.RAM));
//            graph.addNode(26,new Component("Crucial DDR3",65,"https://m.media-amazon.com/images/S/stores-image-uploads-eu-prod/8/AmazonStores/A21TJRUUN4KGV/988953bb848a8e78b2e3c19e94ed8b0c.w400.h400.png","",ComponentType.RAM));
//            graph.addNode(27,new Component("Timetec Hynix IC DDR3",60,"https://m.media-amazon.com/images/S/abs-image-upload-na/f/AmazonStores/ATVPDKIKX0DER/881bf2ff5637c3161c6a511750ff71d5.w500.h500.jpg","",ComponentType.RAM));
//            graph.addNode(28,new Component("Crucial Ballistix y Ballistix MAX DDR4",85,"https://m.media-amazon.com/images/S/stores-image-uploads-eu-prod/8/AmazonStores/A21TJRUUN4KGV/988953bb848a8e78b2e3c19e94ed8b0c.w400.h400.png","",ComponentType.RAM));
//            graph.addNode(29,new Component("Kingston ValueRAM DDR3",60,"https://brandslogos.com/wp-content/uploads/images/kingston-logo-1.png","",ComponentType.RAM));
//            graph.addNode(30,new Component("HyperX Predator DDR4",75,"https://www.qloud.ar/SITES/IMG/dassigrup-05-2022/261_06-05-2022-04-05-18-08-06-2020-11-06-48-hyperx.jpg","",ComponentType.RAM));
//
//            //Componente 4 - GPU
//            graph.addNode(31,new Component("ASUS ROG Strix GeForce RTX 2060 Super EVO",120,"https://logos-world.net/wp-content/uploads/2020/08/Asus-Logo-2022.png","",ComponentType.GPU));
//            graph.addNode(32,new Component("Gigabyte GeForce RTX 3070 Vision OC",320,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.GPU));
//            graph.addNode(33,new Component("Gigabyte GeForce GTX 1650",150,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.GPU));
//            graph.addNode(34,new Component("Gigabyte GeForce RTX 2060 WINDFORCE OC 6G",250,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.GPU));
//            graph.addNode(35,new Component("ASUS GeForce RTX 3070 Dual OC",350,"https://logos-world.net/wp-content/uploads/2020/08/Asus-Logo-2022.png","",ComponentType.GPU));
//            graph.addNode(36,new Component("Gigabyte AORUS GeForce RTX 3070 MASTER",400,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.GPU));
//            graph.addNode(37,new Component("Asus GeForce GTX 1650 Phoenix",300,"https://logos-world.net/wp-content/uploads/2020/08/Asus-Logo-2022.png","",ComponentType.GPU));
//            graph.addNode(38,new Component("ASUS Cerberus GeForce GTX 1050 Ti OC Edition",150,"https://logos-world.net/wp-content/uploads/2020/08/Asus-Logo-2022.png","",ComponentType.GPU));
//            graph.addNode(39,new Component("MSI Radeon RX 570 Armor ARMOR 8G OC",350,"https://i.pinimg.com/originals/ee/70/a9/ee70a90951e6115e8b759744ad4ca29a.png","",ComponentType.GPU));
//            graph.addNode(40,new Component("GIGABYTE GEFORCE RTX 2080 SUPER WINDFORCE OC",280,"https://brandslogos.com/wp-content/uploads/images/large/gigabyte-logo-black-and-white-1.png","",ComponentType.GPU));
//
//            //Componente 5 - Storage
//            graph.addNode(41,new Component("Crucial BX500, 480 GB",37,"https://m.media-amazon.com/images/S/stores-image-uploads-eu-prod/8/AmazonStores/A21TJRUUN4KGV/988953bb848a8e78b2e3c19e94ed8b0c.w400.h400.png","",ComponentType.STORAGE));
//            graph.addNode(42,new Component("Kingston A400, 240 GB",20,"https://brandslogos.com/wp-content/uploads/images/kingston-logo-1.png","",ComponentType.STORAGE));
//            graph.addNode(43,new Component("Kingston KC2500, 500 GB",80,"https://brandslogos.com/wp-content/uploads/images/kingston-logo-1.png","",ComponentType.STORAGE));
//            graph.addNode(44,new Component("Samsung 870 QVO, 1 TB",80,"https://vectorseek.com/wp-content/uploads/2021/01/Samsung-Logo-Vector-scaled.jpg","",ComponentType.STORAGE));
//            graph.addNode(45,new Component("Samsung 990 Pro, 1 TB",200,"https://vectorseek.com/wp-content/uploads/2021/01/Samsung-Logo-Vector-scaled.jpg","",ComponentType.STORAGE));
//            graph.addNode(46,new Component("Samsung 970 EVO Plus, 500 GB",60,"https://vectorseek.com/wp-content/uploads/2021/01/Samsung-Logo-Vector-scaled.jpg","",ComponentType.STORAGE));
//            graph.addNode(47,new Component("Corsair MP400, 1 TB",300,"https://overclock3d.net/gfx/articles/2015/06/01095702500l.jpg","",ComponentType.STORAGE));
//            graph.addNode(48,new Component("Samsung 960 EVO Plus, 500 GB",100,"https://vectorseek.com/wp-content/uploads/2021/01/Samsung-Logo-Vector-scaled.jpg","",ComponentType.STORAGE));
//            graph.addNode(49,new Component("Samsung 870 QVO, 1 TB",80,"https://vectorseek.com/wp-content/uploads/2021/01/Samsung-Logo-Vector-scaled.jpg","",ComponentType.STORAGE));
//            graph.addNode(50,new Component("Samsung 980 PRO, 500 GB",140,"https://vectorseek.com/wp-content/uploads/2021/01/Samsung-Logo-Vector-scaled.jpg","",ComponentType.STORAGE));
//
//
//            //Final node
//            graph.addNode(51,new Component("Final point",0,"https://img.freepik.com/vector-premium/dibujos-animados-lindo-monitor_274619-680.jpg","",null));


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        int max=3;
        int count=1;
        int randomNum=0;
        Random random=new Random();

        for(int i = 1; i<=50; i++){
            count=0;

                if (i <= 10) {

                    for(int e=11; e<=20;e++) {
                        randomNum= random.nextInt(2);

                        if(randomNum!=1 || count>max) {

                            try {
                                graph.addRelation(i, e, ((Component) graph.getNode(e).getObject()).getPrice());
                                graph2.addRelation(i, e, ((Component) graph.getNode(e).getObject()).getPrice());
                            } catch (Exception ex) {
                                throw new RuntimeException(ex);
                            }
                        }else{
                            count++;
                        }
                    }

                } else if (10 < i && i <= 20) {

                    for(int e=21; e<=30;e++) {

                        randomNum= random.nextInt(2);
                        if(randomNum!=1 || count>max) {

                            try {
                                graph.addRelation(i, e, ((Component) graph.getNode(e).getObject()).getPrice());
                                graph2.addRelation(i, e, ((Component) graph.getNode(e).getObject()).getPrice());
                            } catch (Exception ex) {
                                throw new RuntimeException(ex);
                            }
                        }else{
                            count++;
                        }
                    }


                } else if (20 < i && i <= 30) {

                    for(int e=31; e<=40;e++) {
                        randomNum= random.nextInt(2);
                        if(randomNum!=1 || count>max) {
                            try {
                                graph.addRelation(i, e, ((Component) graph.getNode(e).getObject()).getPrice());
                                graph2.addRelation(i, e, ((Component) graph.getNode(e).getObject()).getPrice());
                            } catch (Exception ex) {
                                throw new RuntimeException(ex);
                            }
                        }else {
                            count++;
                        }
                    }

                } else if (30 < i && i <= 40) {

                    for(int e=41; e<=50;e++) {
                        randomNum= random.nextInt(2);

                        if(randomNum!=1 || count>max) {
                            try {
                                graph.addRelation(i, e, ((Component) graph.getNode(e).getObject()).getPrice());
                                graph2.addRelation(i, e, ((Component) graph.getNode(e).getObject()).getPrice());
                            } catch (Exception ex) {
                                throw new RuntimeException(ex);
                            }
                        }else {
                            count++;
                        }
                    }
                }else if (40 < i && i <= 50) {

                    for (int e = 51; e <= 60; e++) {

                        try {
                            graph.addRelation(i, 51, ((Component) graph.getNode(51).getObject()).getPrice());
                            graph2.addRelation(i, 51, ((Component) graph.getNode(51).getObject()).getPrice());
                        } catch (Exception ex) {
                            throw new RuntimeException(ex);
                        }
                    }

                }
        }

        launch();
    }
}