package com.example.integradora_2;
import java.util.*;

public class Node <K,T>implements Comparable<Node <K,T>>{

    private K key;

    private T object;

    private Colors color;

    private Node<K,T> predecessor;

    private Integer priority;

    private HashMap<Node<K,T>,Edge<K,T>> relations;

    private HashMap<Node<K,T>,Edge<K,T>> noneDirectedRelations;

    private Integer d;

    private Integer f;

    private int matrixPost;

    public Node(K key, T object, int matrixPost){
        this.key = key;
        this.object = object;
        this.color = Colors.WHITE;
        this.relations = new HashMap<>();
        this.noneDirectedRelations = new HashMap<>();
        priority = null;
        predecessor = null;
        this.matrixPost = matrixPost;
    }

    public void addRelation(Edge<K,T> edge) throws Exception{
        if(relations.containsKey(edge.getEnd())) throw new Exception("La relación ya existe");
        relations.put(edge.getEnd(), edge);
    }

    public void removeRelation(Edge<K,T> edge){
        relations.remove(edge.getEnd());
    }

    public void addNoneDirectedRelations(Edge<K,T> edge) throws Exception{
        noneDirectedRelations.put(edge.getEnd(), edge);
    }

    public void removeNoneDirectedRelation(Edge<K,T> edge){
        noneDirectedRelations.remove(edge.getEnd());
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Node<K, T> getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Node<K, T> predecessor) {
        this.predecessor = predecessor;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public HashMap<Node<K,T>,Edge<K, T>> getRelations() {
        return relations;
    }

    public HashMap<Node<K, T>, Edge<K, T>> getNoneDirectedRelations() {
        return noneDirectedRelations;
    }

    public Integer getD() {
        return d;
    }

    public void setD(Integer distance) {
        this.d = distance;
    }

    public Integer getF() {
        return f;
    }

    public void setF(Integer f) {
        this.f = f;
    }

    public int getMatrixPost() {
        return matrixPost;
    }

    public void setMatrixPost(int matrixPost) {
        this.matrixPost = matrixPost;
    }

    @Override
    public int compareTo(Node<K, T> o) {

        if(priority==null)return 1;
        if(o.getPriority()==null)return -1;
        return priority.compareTo(o.getPriority());
    }


}