package com.jroberto.cic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph<T> {
    private HashMap<Vertex<T>, ArrayList<Vertex<T>>> adjacencyMap;

    public Graph() {
        this.adjacencyMap = new HashMap<>();
    }

    public HashMap<Vertex<T>, ArrayList<Vertex<T>>> getAdjacencyMap() {
        return this.adjacencyMap;
    }

    public void addVertex(Vertex<T> newVertex) {
        this.adjacencyMap.putIfAbsent(newVertex, new ArrayList<>());
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
