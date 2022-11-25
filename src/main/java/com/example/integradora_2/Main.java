package com.example.integradora_2;
public class Main {

    private static MatrixGraph<String,String> graph = new MatrixGraph<>();

    public Main(){
    }

    public static void main(String[] args) {
        try {


            //Prueba PRIM
            System.out.println(graph.addNode("Chicago","1"));
            System.out.println(graph.addNode("Atlanta","2"));
            System.out.println(graph.addNode("New York","3"));
            System.out.println(graph.addNode("San Francisco","4"));
            System.out.println(graph.addNode("Denver","5"));

            System.out.println(graph.addRelation("Chicago","Atlanta", 700));

            System.out.println(graph.addRelation("Chicago","New York", 1000));

            System.out.println(graph.addRelation("Chicago","San Francisco", 1200));

            System.out.println(graph.addRelation("Chicago","Denver", 1300));




            System.out.println(graph.addRelation("Atlanta","New York", 800));

            System.out.println(graph.addRelation("Atlanta","San Francisco", 2200));

            System.out.println(graph.addRelation("Atlanta","Denver", 1400));



            System.out.println(graph.addRelation("San Francisco","New York", 2000));

            System.out.println(graph.addRelation("San Francisco","Denver", 900));



            System.out.println(graph.addRelation("Denver","New York", 1600));

            System.out.println(graph.prim("Chicago"));

             


            /*
            //Prueba Dijkstra si es no dirigido debe retornar 13
            System.out.println(graph.addNode("a","1"));
            System.out.println(graph.addNode("b","2"));
            System.out.println(graph.addNode("c","3"));
            System.out.println(graph.addNode("d","4"));
            System.out.println(graph.addNode("e","5"));
            System.out.println(graph.addNode("z","6"));

            System.out.println(graph.addRelation("a","b",4));

            System.out.println(graph.addRelation("a","c",2));

            System.out.println(graph.addRelation("b","c",1));

            System.out.println(graph.addRelation("b","d",5));

            System.out.println(graph.addRelation("c","d",8));

            System.out.println(graph.addRelation("c","e",10));

            System.out.println(graph.addRelation("d","e",2));

            System.out.println(graph.addRelation("d","z",6));

            System.out.println(graph.addRelation("z","e",3));


            graph.dijkstra("a","z");

             */


            /*
            //BFS Prueba fuertemente conexo
            graph.addNode("u","0");
            graph.addNode("x","1");
            graph.addNode("y","2");
            graph.addNode("z","3");
            graph.addNode("v","4");
            try{
                graph.addRelation("u","x",1); //u->x
                graph.addRelation("x","y",1); //x->y
                graph.addRelation("y","z",1); //y->z
                graph.addRelation("z","y",1); //z->y
                graph.addRelation("y","v",1); //y->v
                graph.addRelation("v","u",1); //v->u
            }catch (Exception e){}

            System.out.println(graph.isHardlyRelated());
            System.out.println(graph.isRelated());

             */



            /*
            //BFS Debilmente conexo
            graph.addNode("0","0");
            graph.addNode("1","1");
            graph.addNode("2","2");
            graph.addNode("3","3");
            graph.addNode("4","4");
            graph.addNode("5","5");
            graph.addNode("6","6");
            graph.addNode("7","7");
            try{
                graph.addRelation("0","1",1); //0->1
                graph.addRelation("1","2",1); //1->2
                graph.addRelation("2","3",1); //2->3
                graph.addRelation("3","0",1); //3->0
                graph.addRelation("2","4",1); //2->4
                graph.addRelation("4","5",1); //4->5
                graph.addRelation("4","6",1); //4->6
                graph.addRelation("5","6",1); //5->6
                graph.addRelation("6","7",1); //6->7
            }catch (Exception e){}

            System.out.println(graph.isHardlyRelated());
            System.out.println(graph.isRelated());

             */


            /*
            //DFS debe acabar en 12
            graph.addNode("u","0");
            graph.addNode("x","1");
            graph.addNode("y","2");
            graph.addNode("z","3");
            graph.addNode("v","4");
            graph.addNode("w","5");
            try{
                graph.addRelation("u","x",1); //u->x
                graph.addRelation("u","v",1); //u->x
                graph.addRelation("x","v",1); //x->v
                graph.addRelation("y","x",1); //y->x
                graph.addRelation("z","z",1); //z->z
                graph.addRelation("v","y",1); //v->y
                graph.addRelation("w","y",1); //w->y
                graph.addRelation("w","z",1); //w->z
            }catch (Exception e){}

            System.out.println(graph.DFS());

             */



            /*
            //FloyWarshall
            graph.addNode("1","1");
            graph.addNode("2","2");
            graph.addNode("3","3");
            graph.addNode("4","4");

            graph.addRelation("1","3",-2);
            graph.addRelation("3","4",2);
            graph.addRelation("4","2",-1);
            graph.addRelation("2","1",4);
            graph.addRelation("2","3",3);

            System.out.println(graph.floydWarshall());

             */




        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}