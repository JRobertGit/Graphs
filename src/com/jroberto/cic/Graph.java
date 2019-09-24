package com.jroberto.cic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Graph<T> {
    private HashMap<Vertex<T>, ArrayList<Vertex<T>>> adjacencyMap;

    private Graph<T> dfTree;

    private Graph<T> dfrTree;

    private Graph<T> bfTree;

    public Graph() {
        this.adjacencyMap = new HashMap<>();
    }

    public HashMap<Vertex<T>, ArrayList<Vertex<T>>> getAdjacencyMap() {
        return this.adjacencyMap;
    }

    public Graph<T> getDfTree() {
        if (this.dfTree == null) {
            this.dfTree =  this.deepFirstTraverse();
        }
        return dfTree;
    }

    public Graph<T> getDfrTree() {
        if (this.dfrTree == null) {
            this.dfrTree = this.deepFirstRecursiveTraverse();
        }
        return this.dfrTree;
    }
    
    public Graph<T> getBfTree() {
        if (this.bfTree == null) {
            this.bfTree =  this.breadthFirstTraverse();
        }
        return bfTree;
    }
    
    public void addVertex(Vertex<T> newVertex) {
        this.adjacencyMap.putIfAbsent(newVertex, new ArrayList<>());
    }

    public boolean vertexExists(Vertex<T> vertex) {
        return this.adjacencyMap.containsKey(vertex);
    }

    public Vertex<T> getVertex(String vertexLabel) {
        for (Vertex<T> vertex: this.adjacencyMap.keySet()) {
            if (vertex.equals(new Vertex<>(vertexLabel)))
                return vertex;
        }
        return null;
    }

    public void addEdge(String vertex1, String vertex2) {
        this.addDirectedEdge(vertex1, vertex2);
        if (!vertex1.equals(vertex2)) {
            this.addDirectedEdge(vertex2, vertex1);
        }
    }

    public void addDirectedEdge(String fromVertex, String toVertex) {
        this.getAdjacencyList(fromVertex).add(new Vertex<>(toVertex));
    }

    public ArrayList<Vertex<T>> getAdjacencyList(String vertexLabel) {
        return this.adjacencyMap.get(new Vertex<T>(vertexLabel));
    }

    public int getVertexGrade(String vertexLabel) {
        return this.getAdjacencyList(vertexLabel).size();
    }

    private Graph<T> deepFirstRecursiveTraverse() {
        Graph<T> dfRTree =  new Graph<>();
        String startKey = new Random().nextInt(this.adjacencyMap.size()) + "";

        return this.deepFirstRecursiveTraverseAux(dfRTree, null, this.getVertex(startKey));
    }

    private Graph<T> deepFirstRecursiveTraverseAux(Graph<T> gTree, Vertex<T> parent, Vertex<T> current) {
        if (!gTree.vertexExists(current)) {
            gTree.addVertex(current);

            if (parent != null) {
                gTree.addDirectedEdge(parent.getLabel(), current.getLabel());
            }

            ArrayList<Vertex<T>> list = this.getAdjacencyList(current.getLabel());
            for (Vertex<T> v : list) {
                if (!gTree.vertexExists(v)) {
                    gTree = this.deepFirstRecursiveTraverseAux(gTree, current, v);
                }
            }
        }

        return gTree;
    }

    private Graph<T> deepFirstTraverse() {
        Graph<T> dfsTree =  new Graph<>();
        String startKey = new Random().nextInt(this.adjacencyMap.size()) + "";

        Stack<Vertex<T>> pendingVertexes =  new Stack<>();
        Stack<Vertex<T>> currentParent =  new Stack<>();

        pendingVertexes.push(this.getVertex(startKey));

        while (!pendingVertexes.empty()) {
            Vertex<T> current = pendingVertexes.peek();
            if (!dfsTree.vertexExists(current)) {
                dfsTree.addVertex(current);
                if (!currentParent.empty()) {
                    dfsTree.addDirectedEdge(currentParent.peek().getLabel(), current.getLabel());
                }

                ArrayList<Vertex<T>> list = this.getAdjacencyList(current.getLabel());
                for (Vertex<T> v : list) {
                    if (!dfsTree.vertexExists(v)) {
                        pendingVertexes.push(v);
                    }
                }

                currentParent.push(current);
            } else {
                current = pendingVertexes.pop();
                if (!currentParent.empty() && current.equals(currentParent.peek())) {
                    currentParent.pop();
                }
            }
        }

        return dfsTree;
    }

    private Graph<T> breadthFirstTraverse() {
        Graph<T> bfsTree =  new Graph<>();
        String startKey = new Random().nextInt(this.adjacencyMap.size()) + "";

        Deque<Vertex<T>> queue =  new LinkedList<>();
        queue.add(this.getVertex(startKey));

        while (!queue.isEmpty()) {
            Vertex<T> current = queue.remove();
            bfsTree.addVertex(current);

            ArrayList<Vertex<T>> list = this.getAdjacencyList(current.getLabel());
            for (Vertex<T> v : list) {
                if (!bfsTree.vertexExists(v)) {
                    queue.add(v);
                    bfsTree.addVertex(v);
                    bfsTree.addDirectedEdge(current.getLabel(), v.getLabel());
                }
            }
        }

        return bfsTree;
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        for (Map.Entry<Vertex<T>, ArrayList<Vertex<T>>> vertex: this.adjacencyMap.entrySet()) {
            strBuilder.append(vertex.getKey().getLabel());
            for (Vertex adjVertex: vertex.getValue()) {
                strBuilder.append(";").append(adjVertex.getLabel());
            }
            strBuilder.append('\n');
        }
        return strBuilder.toString();
    }

    public void toCsv(String fileName) {
        try (FileWriter writer = new FileWriter("./" + fileName + ".csv");
             BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write(this.toString());
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
