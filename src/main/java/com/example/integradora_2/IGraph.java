package com.example.integradora_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public interface IGraph <K,T> {


    public boolean addNode(K key,T object) throws Exception;

    public String addRelation(K keyFrom, K keyTo, Integer weight) throws Exception;

    public ArrayList<Node<K,T>> dijkstra(K keyStart, K keyEnd) throws Exception;

    //Since prim receives a graph or a matrix graph we can't select only one of the parameters

    public Collection<Node<K,T>> BFS(Node<K,T> start);

    public int DFS();

    public int krus();

    public String floydWarshall();

    public void unite(int iNode, int fNode );

    public int find(int node);

    public Collection<Node<K,T>> getVertices();

    public Node<K,T> getNode(K key);

    public void removeNode(Node<K,T> n);

    public void removeRelation(Edge<K,T> edge);

    public void removeNoneDirectedRelation(Edge<K,T> edge);

}
