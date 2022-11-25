package com.example.integradora_2;
public class Edge <K,T>{

    private Node<K,T> start;

    private Node<K,T> end;

    private Integer weight;

    public Edge(Node<K,T> start, Node<K,T> end, Integer weight){
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    public Node<K, T> getStart() {
        return start;
    }

    public Node<K, T> getEnd() {
        return end;
    }

    public Integer getWeight() {
        return weight;
    }
}
