package com.example.integradora_2;


import junit.framework.TestCase;

import java.util.*;

public class graphTest extends TestCase {

    private Graph<String, String> graphString = new Graph<>();

    private MatrixGraph<String, String> graphString2 = new MatrixGraph<>();

    private Graph <Integer,Integer> graph1= new Graph<>();

    private MatrixGraph <Integer,Integer> graph2= new MatrixGraph<>();

    public void setup1(){

    }

    public void setupEscenarioKruskal1() throws Exception {

        //Tomado de ejercicio de porgramación competitiva de HackerRank

        graph1.addNode(0,0);
        graph1.addNode(1,0);
        graph1.addNode(2,0);
        graph1.addNode(3,0);
        graph1.addNode(4,0);
        graph1.addNode(5,0);
        graph1.addNode(6,0);

        graph2.addNode(0,0);
        graph2.addNode(1,0);
        graph2.addNode(2,0);
        graph2.addNode(3,0);
        graph2.addNode(4,0);
        graph2.addNode(5,0);
        graph2.addNode(6,0);


        graph1.addRelation(1,2,5);
        graph1.addRelation(1,3,3);
        graph1.addRelation(4,1,6);
        graph1.addRelation(2,4,7);
        graph1.addRelation(3,2,4);
        graph1.addRelation(3,4,5);

        graph2.addRelation(1,2,5);
        graph2.addRelation(1,3,3);
        graph2.addRelation(4,1,6);
        graph2.addRelation(2,4,7);
        graph2.addRelation(3,2,4);
        graph2.addRelation(3,4,5);

    }

    public void setupEscenarioKrus2() throws Exception{

        //Tomado de ejercicio de porgramación competitiva de HackerRank

        graph1.addNode(1,0);
        graph1.addNode(2,0);
        graph1.addNode(3,0);
        graph1.addNode(4,0);
        graph1.addNode(5,0);

        graph2.addNode(1,0);
        graph2.addNode(2,0);
        graph2.addNode(3,0);
        graph2.addNode(4,0);
        graph2.addNode(5,0);

        graph1.addRelation(1,2,20);
        graph1.addRelation(1,3,50);
        graph1.addRelation(1,4,70);
        graph1.addRelation(1,5,90);
        graph1.addRelation(2,3,30);
        graph1.addRelation(3,4,40);
        graph1.addRelation(4,5,60);

        graph2.addRelation(1,2,20);
        graph2.addRelation(1,3,50);
        graph2.addRelation(1,4,70);
        graph2.addRelation(1,5,90);
        graph2.addRelation(2,3,30);
        graph2.addRelation(3,4,40);
        graph2.addRelation(4,5,60);
    }

    public void  setupEscenarioFloyWarshall(){

        /*
        Grafo tomado de diapositiva 32 sesion 30

         */

        try {
            graphString.addNode("1","1");
            graphString.addNode("2","2");
            graphString.addNode("3","3");
            graphString.addNode("4","4");

            graphString.addRelation("1","3",-2);
            graphString.addRelation("3","4",2);
            graphString.addRelation("4","2",-1);
            graphString.addRelation("2","1",4);
            graphString.addRelation("2","3",3);

            graphString.floydWarshall();

            graphString2.addNode("1","1");
            graphString2.addNode("2","2");
            graphString2.addNode("3","3");
            graphString2.addNode("4","4");

            graphString2.addRelation("1","3",-2);
            graphString2.addRelation("3","4",2);
            graphString2.addRelation("4","2",-1);
            graphString2.addRelation("2","1",4);
            graphString2.addRelation("2","3",3);




        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }


    public void setupEscenarioPrim(){


        /*
        Chicago= 1
        Atlanta = 2
        New york = 3
        San francisco = 4
        Denver = 5


        TOMADO DE LA DIAPOSITIVA 91 DE LA SESION 30
         */


        try {
            graph1.addNode(1,1);
            graph1.addNode(2,2);
            graph1.addNode(3,3);
            graph1.addNode(4,4);
            graph1.addNode(5,5);

            graph2.addNode(1,1);
            graph2.addNode(2,2);
            graph2.addNode(3,3);
            graph2.addNode(4,4);
            graph2.addNode(5,5);

            graph2.addRelation(1,2, 700);
            graph2.addRelation(1,3, 1000);
            graph2.addRelation(1,4, 1200);
            graph2.addRelation(1,5, 1300);


            graph2.addRelation(2,1, 700);
            graph2.addRelation(2,3, 800);
            graph2.addRelation(2,4, 2200);
            graph2.addRelation(2,5, 1400);


            graph2.addRelation(4,3, 2000);
            graph2.addRelation(4,5, 900);
            graph2.addRelation(4,2, 2200);
            graph2.addRelation(4,1, 1200);


            graph2.addRelation(5,3, 1600);
            graph2.addRelation(5,4, 900);
            graph2.addRelation(5,1, 1300);
            graph2.addRelation(5,2, 1400);


            graph2.addRelation(3,5, 1600);
            graph2.addRelation(3,4, 2000);
            graph2.addRelation(3,2, 800);
            graph2.addRelation(3,1, 1000);

            graph1.addRelation(1,2, 700);
            graph1.addRelation(1,3, 1000);
            graph1.addRelation(1,4, 1200);
            graph1.addRelation(1,5, 1300);


            graph1.addRelation(2,1, 700);
            graph1.addRelation(2,3, 800);
            graph1.addRelation(2,4, 2200);
            graph1.addRelation(2,5, 1400);


            graph1.addRelation(4,3, 2000);
            graph1.addRelation(4,5, 900);
            graph1.addRelation(4,2, 2200);
            graph1.addRelation(4,1, 1200);


            graph1.addRelation(5,3, 1600);
            graph1.addRelation(5,4, 900);
            graph1.addRelation(5,1, 1300);
            graph1.addRelation(5,2, 1400);


            graph1.addRelation(3,5, 1600);
            graph1.addRelation(3,4, 2000);
            graph1.addRelation(3,2, 800);
            graph1.addRelation(3,1, 1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }





    public void setupEscenarioDijkstra(Graph<String,String> graph){
        try{
            //Prueba Dijkstra tomado de la sesión 29, diapositiva 101, el resultado debe ser 13, de a - z
            graph.addNode("a","1");
            graph.addNode("b","2");
            graph.addNode("c","3");
            graph.addNode("d","4");
            graph.addNode("e","5");
            graph.addNode("z","6");

            graph.addRelation("a","b",4);
            graph.addRelation("b","a",4);

            graph.addRelation("a","c",2);
            graph.addRelation("c","a",2);

            graph.addRelation("b","c",1);
            graph.addRelation("c","b",1);

            graph.addRelation("b","d",5);
            graph.addRelation("d","b",5);

            graph.addRelation("c","d",8);
            graph.addRelation("d","c",8);

            graph.addRelation("c","e",10);
            graph.addRelation("e","c",10);

            graph.addRelation("d","e",2);
            graph.addRelation("e","d",2);

            graph.addRelation("d","z",6);
            graph.addRelation("z","d",6);

            graph.addRelation("z","e",3);
            graph.addRelation("e","z",3);
        } catch (Exception e){

        }
    }

    public void setupEscenarioDijkstra2(Graph<String,String> graph){


        try{
            //Prueba Dijkstra 2, tomado de la sesion 29, diapositiva 52, el resultado debe ser 6 de a - z
            graph.addNode("a","1");
            graph.addNode("b","2");
            graph.addNode("c","3");
            graph.addNode("d","4");
            graph.addNode("e","5");
            graph.addNode("z","6");

            graph.addRelation("a","b",4);
            graph.addRelation("b","a",4);

            graph.addRelation("a","d",2);
            graph.addRelation("d","a",2);

            graph.addRelation("b","c",3);
            graph.addRelation("c","b",3);

            graph.addRelation("b","e",3);
            graph.addRelation("e","b",3);

            graph.addRelation("c","z",2);
            graph.addRelation("z","c",2);

            graph.addRelation("z","e",1);
            graph.addRelation("e","z",1);

            graph.addRelation("d","e",3);
            graph.addRelation("e","d",3);
        }catch (Exception e){

        }
    }


    public void setupEscenarioDijkstraMatrix1(MatrixGraph<String,String> graph){
        try{
            //Prueba Dijkstra tomado de la sesión 29, diapositiva 101, el resultado debe ser 13, de a - z
            graph.addNode("a","1");
            graph.addNode("b","2");
            graph.addNode("c","3");
            graph.addNode("d","4");
            graph.addNode("e","5");
            graph.addNode("z","6");

            graph.addRelation("a","b",4);
            graph.addRelation("b","a",4);

            graph.addRelation("a","c",2);
            graph.addRelation("c","a",2);

            graph.addRelation("b","c",1);
            graph.addRelation("c","b",1);

            graph.addRelation("b","d",5);
            graph.addRelation("d","b",5);

            graph.addRelation("c","d",8);
            graph.addRelation("d","c",8);

            graph.addRelation("c","e",10);
            graph.addRelation("e","c",10);

            graph.addRelation("d","e",2);
            graph.addRelation("e","d",2);

            graph.addRelation("d","z",6);
            graph.addRelation("z","d",6);

            graph.addRelation("z","e",3);
            graph.addRelation("e","z",3);
        } catch (Exception e){

        }
    }

    public void setupEscenarioDijkstraMatrix2(MatrixGraph<String,String> graph){


        try{
            //Prueba Dijkstra 2, tomado de la sesion 29, diapositiva 52, el resultado debe ser 6 de a - z
            graph.addNode("a","1");
            graph.addNode("b","2");
            graph.addNode("c","3");
            graph.addNode("d","4");
            graph.addNode("e","5");
            graph.addNode("z","6");

            graph.addRelation("a","b",4);
            graph.addRelation("b","a",4);

            graph.addRelation("a","d",2);
            graph.addRelation("d","a",2);

            graph.addRelation("b","c",3);
            graph.addRelation("c","b",3);

            graph.addRelation("b","e",3);
            graph.addRelation("e","b",3);

            graph.addRelation("c","z",2);
            graph.addRelation("z","c",2);

            graph.addRelation("z","e",1);
            graph.addRelation("e","z",1);

            graph.addRelation("d","e",3);
            graph.addRelation("e","d",3);
        }catch (Exception e){

        }
    }

    public void setupEscenarioBFSHardlyRelated(Graph<String,String> graph){
        try{
            //Grafo de ejemplo del seguimiento de BFS
            graph.addNode("u","0");
            graph.addNode("x","1");
            graph.addNode("y","2");
            graph.addNode("z","3");
            graph.addNode("v","4");

            graph.addRelation("u","x",1); //u->x
            graph.addRelation("x","y",1); //x->y
            graph.addRelation("y","z",1); //y->z
            graph.addRelation("z","y",1); //z->y
            graph.addRelation("y","v",1); //y->v
            graph.addRelation("v","u",1); //v->u


        }catch (Exception e){

        }
    }

    public void setupEscenarioBFSMatrixHardlyRelated(MatrixGraph<String,String> graph){
        try{
            //Grafo de ejemplo del seguimiento de BFS
            graph.addNode("u","0");
            graph.addNode("x","1");
            graph.addNode("y","2");
            graph.addNode("z","3");
            graph.addNode("v","4");

            graph.addRelation("u","x",1); //u->x
            graph.addRelation("x","y",1); //x->y
            graph.addRelation("y","z",1); //y->z
            graph.addRelation("z","y",1); //z->y
            graph.addRelation("y","v",1); //y->v
            graph.addRelation("v","u",1); //v->u

        }catch (Exception e){

        }
    }

    public void setupEscenarioBFSMatrixNOTHardlyRelated(MatrixGraph<String,String> graph){
        try{
            //Tomado de: https://cdn.programiz.com/sites/tutorial2program/files/scc-initial-graph.png
            graph.addNode("0","0");
            graph.addNode("1","1");
            graph.addNode("2","2");
            graph.addNode("3","3");
            graph.addNode("4","4");
            graph.addNode("5","5");
            graph.addNode("6","6");
            graph.addNode("7","7");
            graph.addRelation("0","1",1); //0->1
            graph.addRelation("1","2",1); //1->2
            graph.addRelation("2","3",1); //2->3
            graph.addRelation("3","0",1); //3->0
            graph.addRelation("2","4",1); //2->4
            graph.addRelation("4","5",1); //4->5
            graph.addRelation("4","6",1); //4->6
            graph.addRelation("5","6",1); //5->6
            graph.addRelation("6","7",1); //6->7


        }catch (Exception e){

        }
    }

    public void setupEscenarioBFSNOTHardlyRelated(Graph<String,String> graph){
        try{
            //Tomado de: https://cdn.programiz.com/sites/tutorial2program/files/scc-initial-graph.png
            graph.addNode("0","0");
            graph.addNode("1","1");
            graph.addNode("2","2");
            graph.addNode("3","3");
            graph.addNode("4","4");
            graph.addNode("5","5");
            graph.addNode("6","6");
            graph.addNode("7","7");
            graph.addRelation("0","1",1); //0->1
            graph.addRelation("1","2",1); //1->2
            graph.addRelation("2","3",1); //2->3
            graph.addRelation("3","0",1); //3->0
            graph.addRelation("2","4",1); //2->4
            graph.addRelation("4","5",1); //4->5
            graph.addRelation("4","6",1); //4->6
            graph.addRelation("5","6",1); //5->6
            graph.addRelation("6","7",1); //6->7


        }catch (Exception e){

        }
    }

    public void setupEscenarioDFS(Graph<String,String> graph){
        try{
            //DFS Tomado de la sesion 27-28, diapositiva 147, debe acabar en 12
            graph.addNode("u","0");
            graph.addNode("x","1");
            graph.addNode("y","2");
            graph.addNode("z","3");
            graph.addNode("v","4");
            graph.addNode("w","5");
            graph.addRelation("u","x",1); //u->x
            graph.addRelation("u","v",1); //u->x
            graph.addRelation("x","v",1); //x->v
            graph.addRelation("y","x",1); //y->x
            graph.addRelation("z","z",1); //z->z
            graph.addRelation("v","y",1); //v->y
            graph.addRelation("w","y",1); //w->y
            graph.addRelation("w","z",1); //w->z


        }catch (Exception e){

        }
    }

    public void setupEscenarioDFSMatrix(MatrixGraph<String,String> graph){
        try{
            //DFS Tomado de la sesion 27-28, diapositiva 147, debe acabar en 12
            graph.addNode("u","0");
            graph.addNode("x","1");
            graph.addNode("y","2");
            graph.addNode("z","3");
            graph.addNode("v","4");
            graph.addNode("w","5");
            graph.addRelation("u","x",1); //u->x
            graph.addRelation("u","v",1); //u->x
            graph.addRelation("x","v",1); //x->v
            graph.addRelation("y","x",1); //y->x
            graph.addRelation("z","z",1); //z->z
            graph.addRelation("v","y",1); //v->y
            graph.addRelation("w","y",1); //w->y
            graph.addRelation("w","z",1); //w->z


        }catch (Exception e){

        }
    }

    public void testAdd1(){
        try {
            setupEscenarioKruskal1();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(graph1.getObjects().size(), 7);
        assertEquals(graph2.getObjects().size(), 7);
        try {
            graph1.addNode(10,0);
            graph2.addNode(10,0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(graph1.getObjects().size(),8);
        assertEquals(graph2.getObjects().size(),8);
    }

    public void testAdd2(){
        try {
            setup1();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(graph1.getObjects().size(), 0);
        assertEquals(graph2.getObjects().size(), 0);
        try {
            graph1.addNode(6,0);
            graph2.addNode(6,0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(graph1.getObjects().size(),1);
        assertEquals(graph2.getObjects().size(),1);
    }

    public void testDelete1(){
        try {
            setupEscenarioKruskal1();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Node<Integer,Integer> node1=graph1.getNode(1);
        Node<Integer,Integer> node2=graph2.getNode(1);

        graph1.removeNode(node1);
        assertFalse(graph1.getObjects().contains(node1));

        graph2.removeNode(node2);
        assertFalse(graph2.getObjects().contains(node2));

    }

    public void testDelete2(){
        try {
            setupEscenarioKrus2();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Node<Integer,Integer> node1=graph1.getNode(3);
        Node<Integer,Integer> node2=graph1.getNode(4);

        Node<Integer,Integer> node3=graph2.getNode(3);
        Node<Integer,Integer> node4=graph2.getNode(4);

        graph1.removeNode(node1);
        assertFalse(graph1.getObjects().contains(node1));
        graph1.removeNode(node2);
        assertFalse(graph1.getObjects().contains(node2));

        graph2.removeNode(node3);
        assertFalse(graph2.getObjects().contains(node3));
        graph2.removeNode(node4);
        assertFalse(graph2.getObjects().contains(node4));
    }

    public void testAddRelation1(){
        try {
            setupEscenarioKruskal1();
            graph1.addRelation(1,5,0);
            graph2.addRelation(1,5,0);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Node<Integer,Integer> node1=graph1.getNode(5);

       assertNotNull(graph1.getNode(1).getRelations().get(node1));
       assertNotNull(graph2.getEdges()[1][5]);
    }

    public void testAddRelation2(){
        try {
            setupEscenarioKruskal1();
            graph1.addRelation(1,6,0);
            graph2.addRelation(1,6,0);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Node<Integer,Integer> node1=graph1.getNode(6);

        assertNotNull(graph1.getNode(1).getRelations().get(node1));
        assertNotNull(graph2.getEdges()[1][6]);
    }

    public void testGetNode1(){
        try {
            setupEscenarioKruskal1();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        assertEquals(((int)graph1.getNode(1).getKey()),1);
        assertEquals(((int)graph2.getNode(1).getKey()),1);
    }

    public void testGetNode2(){
        try {
            setupEscenarioKrus2();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        assertEquals(((int)graph1.getNode(3).getKey()),3);
        assertEquals(((int)graph2.getNode(3).getKey()),3);
    }


    public void testKrus1()  {
        try {
            setupEscenarioKruskal1();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(graph1.krus(),12);
        assertEquals(graph2.krus(),12);

    }

    public void testKrus2() {
        try {
            setupEscenarioKrus2();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(graph1.krus(),150);
        assertEquals(graph2.krus(),150);

    }


    public void testDijkstra1() {

        //Prueba Dijkstra tomado de la sesión 29, diapositiva 101, el resultado debe ser 13, de a - z
        try {

            setupEscenarioDijkstra(graphString);

        }catch (Exception e) {
            throw new RuntimeException(e);
        };

        ArrayList<Node<String,String>> predecessors = graphString.dijkstra("a","z");

        //El primer nodo de predecessors es el final de dijkstra por lo que su prioridad es el camino más corto

        assertEquals(predecessors.get(0).getPriority().intValue(), 13);
    }

    public void testDijkstra2() {

        //Prueba Dijkstra 2, tomado de la sesion 29, diapositiva 52, el resultado debe ser 6 de a - z
        try {

            setupEscenarioDijkstra2(graphString);

        }catch (Exception e) {
            throw new RuntimeException(e);
        };

        ArrayList<Node<String,String>> predecessors = graphString.dijkstra("a","z");

        //El primer nodo de predecessors es el final de dijkstra por lo que su prioridad es el camino más corto

        assertEquals(predecessors.get(0).getPriority().intValue(), 6);
    }

    public void testMatrixDijkstra1() {

        //Prueba Dijkstra tomado de la sesión 29, diapositiva 101, el resultado debe ser 13, de a - z
        try {

            setupEscenarioDijkstraMatrix1(graphString2);

        }catch (Exception e) {
            throw new RuntimeException(e);
        };

        ArrayList<Node<String,String>> predecessors = graphString2.dijkstra("a","z");

        //El primer nodo de predecessors es el final de dijkstra por lo que su prioridad es el camino más corto

        assertEquals(predecessors.get(0).getPriority().intValue(), 13);
    }

    public void testMatrixDijkstra2() {

        //Prueba Dijkstra 2, tomado de la sesion 29, diapositiva 52, el resultado debe ser 6 de a - z
        try {

            setupEscenarioDijkstraMatrix2(graphString2);

        }catch (Exception e) {
            throw new RuntimeException(e);
        };

        ArrayList<Node<String,String>> predecessors = graphString2.dijkstra("a","z");

        //El primer nodo de predecessors es el final de dijkstra por lo que su prioridad es el camino más corto

        assertEquals(predecessors.get(0).getPriority().intValue(), 6);
    }

    public void testBFSHardlyRelated(){
        try {
            setupEscenarioBFSHardlyRelated(graphString);
            assertTrue(graphString.isHardlyRelatedBoolean());
        }catch (Exception e){}
    }

    public void testBFSNOTHardlyRelated(){
        try {
            setupEscenarioBFSNOTHardlyRelated(graphString);
            assertFalse(graphString.isHardlyRelatedBoolean());
        }catch (Exception e){}
    }

    public void testBFSHardlyRelatedMatrix(){
        try {
            setupEscenarioBFSMatrixHardlyRelated(graphString2);
            assertTrue(graphString2.isHardlyRelatedBoolean());
        }catch (Exception e){}
    }

    public void testBFSNOTHardlyRelatedMatrix(){
        try {
            setupEscenarioBFSMatrixNOTHardlyRelated(graphString2);
            assertFalse(graphString2.isHardlyRelatedBoolean());
        }catch (Exception e){}
    }



    public void testPrim(){

        try {
            setupEscenarioPrim();
        }catch (Exception e){

        }

        ArrayList<Node<Integer, Integer>> sol = graph1.prim(graph1, 1);



        int path = 0;

        for(int i=0 ; i < sol.size()-1; i+=2){

            path += sol.get(i).getRelations().get(sol.get(i+1)).getWeight();
        }

        assertEquals(path,3600);



    }

    public void testFloydWarshall(){

        setupEscenarioFloyWarshall();

        Integer [][] answer= { { 0, -1, -2, 0 },
                            { 4, 0, 2, 4 },
                            { 5, 1, 0, 2 },
                            { 3, -1, 1, 0 } };

        String out1="", out2="";

        Integer [][] floyd = graphString.floydWarshall();

        for(int i =0 ; i < answer.length; i++){

            for (int e=0 ; e < answer.length; e++){

                out1+= ""+answer[i][e];
                out2 +=""+floyd[i][e];

            }
        }

        assertEquals(out1,out2);


    }


    public void testFloydWarshallMatrix(){

        setupEscenarioFloyWarshall();

        Integer [][] answer= { { 0, -1, -2, 0 },
                { 4, 0, 2, 4 },
                { 5, 1, 0, 2 },
                { 3, -1, 1, 0 } };

        String out1="", out2="";

        Integer [][] floyd = graphString2.floydWarshall();

        for(int i =0 ; i < answer.length; i++){

            for (int e=0 ; e < answer.length; e++){

                out1+= ""+answer[i][e];
                out2 +=""+floyd[i][e];

            }
        }

        assertEquals(out1,out2);


    }

    public void testPrimMatrix(){

        setupEscenarioPrim();


        ArrayList<Node<Integer, Integer>> sol2 = graph2.prim(graph2, 1);

        Edge<Integer, Integer>[][] edges = graph2.getEdges();

        int path2=0;
        for(int i=0 ; i < sol2.size()-1; i+=2){

            path2 += edges[sol2.get(i).getMatrixPost()][sol2.get(i+1).getMatrixPost()].getWeight();

        }

        assertEquals(path2,3600);
    }

    public void testDFS(){
        setupEscenarioDFS(graphString);
        assertEquals(graphString.DFS(),12);
    }

    public void testDFSMatrix(){
        setupEscenarioDFSMatrix(graphString2);
        assertEquals(graphString2.DFS(),12);
    }


}
