package com.example.integradora_2;
import java.util.*;

public class MatrixGraph<K,T> {

    private HashMap<K, Node<K, T>> nodes;

    private Edge<K, T>[][] edges;

    private Edge<K, T>[][] noneDirectEdges;

    private HashMap<Integer, K> keys;

    static private MatrixGraph graph1=new MatrixGraph<>();

    public MatrixGraph() {
        nodes = new HashMap<>();
        keys = new HashMap<>();
        edges = new Edge[50][50];
        noneDirectEdges = new Edge[50][50];
    }

    public boolean addNode(K key, T object) throws Exception {
        if (nodes.containsKey(key)) throw new Exception("There's already a node with this key");
        nodes.put(key, new Node<K, T>(key, object, nodes.size()));
        keys.put(keys.size(), key);
        return true;
    }

    public String addRelation(K keyFrom, K keyTo, Integer weight) throws Exception {

        Node<K, T> nodeFrom = nodes.get(keyFrom);

        Node<K, T> nodeTo = nodes.get(keyTo);

        if (nodeFrom == null || nodeTo == null) throw new Exception("We couldn't find both nodes");

        try {
            Edge<K, T> edge = new Edge<>(nodeFrom, nodeTo, weight);
            Edge<K, T> inverseEdge = new Edge<>(nodeTo, nodeFrom, weight);

            edges[nodeFrom.getMatrixPost()][nodeTo.getMatrixPost()] = edge;

            noneDirectEdges[nodeFrom.getMatrixPost()][nodeTo.getMatrixPost()] = edge;

            noneDirectEdges[nodeTo.getMatrixPost()][nodeFrom.getMatrixPost()] = inverseEdge;

            return ("\nNow " + keyFrom.toString() + " has " + keyTo + " as relative with weight " + weight.toString());
        } catch (Exception e) {
            return e.getMessage();
        }

    }

    public ArrayList<Node<K,T>> dijkstra(K keyStart, K keyEnd){

        Node<K,T> start = nodes.get(keyStart);

        Node<K,T> end = nodes.get(keyEnd);

        ArrayList<Node<K,T>> priorityQueue = new ArrayList<>();

        for(Node<K,T> n:nodes.values()){
            n.setPriority(Integer.MAX_VALUE);
            priorityQueue.add(n);
        }

        start.setPriority(0);

        HashSet<Node<K,T>> solution = new HashSet<>();

        priorityQueue.sort(new Comparator<Node<K, T>>() {
            @Override
            public int compare(Node<K, T> o1, Node<K, T> o2) {
                return o1.getPriority().compareTo(o2.getPriority());
            }
        });

        while(!solution.contains(end)){
            Node<K,T> u = null;

            for(int i=0; i<priorityQueue.size()&&u==null; i++){
                if(!solution.contains(priorityQueue.get(i))){
                    u = priorityQueue.get(i);
                    solution.add(u);
                    priorityQueue.sort(new Comparator<Node<K, T>>() {
                        @Override
                        public int compare(Node<K, T> o1, Node<K, T> o2) {
                            return o1.getPriority().compareTo(o2.getPriority());
                        }
                    });
                }
            }

            Node<K,T> v = null;

            for(int i=0; i<priorityQueue.size(); i++){

                if(!solution.contains(priorityQueue.get(i))){

                    v=priorityQueue.get(i);

                    if(edges[u.getMatrixPost()][v.getMatrixPost()]!=null){

                        if(u.getPriority() + edges[u.getMatrixPost()][v.getMatrixPost()].getWeight()<v.getPriority()){
                            v.setPredecessor(u);
                            v.setPriority(u.getPriority() + edges[u.getMatrixPost()][v.getMatrixPost()].getWeight());
                            priorityQueue.sort(new Comparator<Node<K, T>>() {
                                @Override
                                public int compare(Node<K, T> o1, Node<K, T> o2) {
                                    return o1.getPriority().compareTo(o2.getPriority());
                                }
                            });
                        }

                    }

                }

            }
        }

        ArrayList predecessors = new ArrayList<>();

        Node<K,T> predecessor = end;

        while(predecessor!=null){
            predecessors.add(predecessor);
            predecessor = predecessor.getPredecessor();
        }

        return predecessors;

    }

    public String prim(K keyStart) throws Exception{

        HashMap<Integer,Node<K,T>> predecessors = new HashMap<>();

        Node<K,T> start = nodes.get(keyStart);

        if(start==null)throw new Exception("We couldn't find the node your looking for");

        for(Node<K,T> n:nodes.values()){
            n.setColor(Colors.WHITE);
            n.setPriority(null);
        }

        start.setPriority(0);

        start.setPredecessor(null);

        PriorityQueue<Node<K,T>> priorityQueue = new PriorityQueue<>();

        priorityQueue.addAll(nodes.values());

        while(!priorityQueue.isEmpty()){
            Node<K,T> u = priorityQueue.poll();

            for(int i=0; i< nodes.size(); i++){

                Edge<K,T> edge = noneDirectEdges[u.getMatrixPost()][i];

                Node<K,T> v = null;

                if(edge!=null){

                    v = edge.getEnd();

                }

                if(v!=null && u.getColor()!=Colors.BLACK&&(v.getPriority()==null||
                        noneDirectEdges[u.getMatrixPost()][v.getMatrixPost()].getWeight()<v.getPriority() &&
                                u.getPredecessor()!=v)){

                    v.setPriority(noneDirectEdges[u.getMatrixPost()][v.getMatrixPost()].getWeight());
                    v.setPredecessor(u);
                    System.out.println(predecessors.size());
                    predecessors.put(v.getMatrixPost(),u);
                    System.out.println(v.getPredecessor().getKey()+" ahora es padre de " +v.getKey());

                }

            }

            u.setColor(Colors.BLACK);
        }

        return pathOrder(predecessors);

    }

    public String pathOrder(HashMap<Integer, Node<K,T>> predecessors){

        String out = "";

        for(int i=0; i< nodes.size(); i++){
            if(predecessors.containsKey(i) && keys.containsKey(i) && nodes.containsKey(keys.get(i)) && nodes.get(keys.get(i)) != null ){
                out += "\n" + predecessors.get(i).getKey() + " then " + nodes.get(keys.get(i)).getKey();
            }
        }

        return out;
    }

    public Collection<Node<K,T>> BFS(Node<K,T> start){

        for(Node<K,T> n:nodes.values()){
            n.setColor(Colors.WHITE);
            n.setPriority(null);
            n.setD(Integer.MAX_VALUE);
        }

        start.setColor(Colors.GREY);
        start.setD(0);
        start.setPredecessor(null);

        LinkedList<Node<K,T>> queue = new LinkedList<>();

        queue.add(start);

        while(!queue.isEmpty()){
            Node<K,T> u  = queue.poll();

            for(int i=0; i<50; i++){

                Edge<K,T> e = edges[u.getMatrixPost()][i];

                if(e!=null&&e.getEnd().getColor()==Colors.WHITE){

                    e.getEnd().setColor(Colors.GREY);
                    e.getEnd().setD(e.getStart().getD()+1);
                    e.getEnd().setPredecessor(e.getStart());
                    queue.add(e.getEnd());

                }

            }
            u.setColor(Colors.BLACK);
        }

        boolean allBlack = true;

        ArrayList<Node<K,T>> solution = new ArrayList<>();

        for(Node<K,T>n:nodes.values()){
            if(n.getColor()==Colors.BLACK){
                solution.add(n);
            }
        }

        System.out.println(allBlack);

        return solution;

    }

    public String isRelated(){
        Collection<Node<K,T>> flag;
        for(Node<K,T>n:nodes.values()){
            flag = BFS(n);
            if(flag!=null) return "Es conexo";
        }
        return "No es conexo";
    }

    public String isHardlyRelated(){
        Collection<Node<K,T>> flag;
        for(Node<K,T>n:nodes.values()){
            flag = BFS(n);
            if(flag==null) return "No es fuertemente Conexo";
        }
        return "Es fuertemente conexo";
    }

    public int DFS(){

        for(Node<K,T>u:nodes.values()){
            u.setColor(Colors.WHITE);
            u.setPredecessor(null);
        }
        int time = 0;

        for(Node<K,T>u: nodes.values()){
            if(u.getColor()==Colors.WHITE){
                time = DFSvisit(u, time);
            }
        }

        return time;

    }

    public int DFSvisit(Node<K,T> u, int time){

        time++;

        u.setD(time);

        u.setColor(Colors.GREY);

        for(int i=0; i<50; i++){
            Edge<K,T> e = edges[u.getMatrixPost()][i];
            if(e!=null && e.getEnd().getColor()==Colors.WHITE){
                e.getEnd().setPredecessor(u);
                time = DFSvisit(e.getEnd(), time);
            }
        }
        u.setColor(Colors.BLACK);
        time++;
        u.setF(time);

        return time;

    }

    public String floydWarshall(){

        Integer[][] distances = new Integer[nodes.size()][nodes.size()];

        for(int i=0; i< nodes.size(); i++){
            for(int j=0; j< nodes.size(); j++){
                if(edges[i][j]!=null){
                    distances[i][j] = edges[i][j].getWeight();
                }else if(i==j){
                    distances[i][j]=0;
                }else{
                    distances[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for(int k=0; k< nodes.size(); k++){

            for(int i=0; i< nodes.size(); i++){

                for(int j=0; j< nodes.size(); j++){

                    if(distances[i][k]!=Integer.MAX_VALUE&&distances[k][j]!=Integer.MAX_VALUE){
                        if(distances[i][j]>distances[i][k]+distances[k][j]){
                            distances[i][j]=distances[i][k]+distances[k][j];
                        }
                    }

                }

            }


        }



        String out="";

        for(int i=0; i< nodes.size(); i++){
            for(int j=0; j< nodes.size(); j++){
                if(distances[i][j]==Integer.MAX_VALUE){
                    out+=distances[i][j]+" ";
                    out+="I ";
                }else if(j+1<nodes.size() && distances[i][j+1]>=0){
                    out+=distances[i][j]+"  ";
                }else{
                    out+=distances[i][j]+" ";
                }
            }
            out+="\n";
        }

        return out;

    }

    public Collection<Node<K,T>> getVertices(){
        return nodes.values();
    }

    public ArrayList<T> getObjects(){

        ArrayList<T> objects = new ArrayList<>();

        for(Node<K,T> n:nodes.values()){
            objects.add(n.getObject());
        }

        return objects;

    }

    public Node<K,T> getNode(K key){
        return nodes.get(key);
    }

    static public MatrixGraph getInstance(){
        return graph1;
    }


}