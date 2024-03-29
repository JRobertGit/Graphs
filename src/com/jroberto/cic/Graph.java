package com.jroberto.cic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static java.util.Comparator.*;

public class Graph<T> {
    private HashMap<String, Vertex<T>> vertices;

    private HashMap<String, ArrayList<Vertex<T>>> adjacencyMap;

    public Graph() {
        this.vertices = new HashMap<>();
        this.adjacencyMap = new HashMap<>();
    }

    public HashMap<String, Vertex<T>> getVertices() {
        return this.vertices;
    }

    public HashMap<String, ArrayList<Vertex<T>>> getAdjacencyMap() {
        return this.adjacencyMap;
    }
    
    public void addVertex(Vertex<T> newVertex) {
        this.vertices.putIfAbsent(newVertex.getId(), newVertex);
        this.adjacencyMap.putIfAbsent(newVertex.getId(), new ArrayList<>());
    }

    public boolean vertexExists(String vertexId) {
        return this.vertices.containsKey(vertexId);
    }

    public Vertex<T> getVertex(String vertexId) {
        return (this.vertexExists(vertexId)) ? this.vertices.get(vertexId) : null;
    }

    public void addEdge(String vertex1Id, String vertex2Id) {
        this.addDirectedEdge(vertex1Id, vertex2Id);
        if (!vertex1Id.equals(vertex2Id)) {
            this.addDirectedEdge(vertex2Id, vertex1Id);
        }
    }

    public void addDirectedEdge(String fromVertexId, String toVertexId) {
        Vertex fromVertex = this.getVertex(fromVertexId);
        Vertex toVertex = this.getVertex(toVertexId);
        this.vertices.get(fromVertexId).getEdges().add(new Edge(fromVertex, toVertex, 0));
        this.getAdjacencyList(fromVertexId).add(this.vertices.get(toVertexId));
    }

    public ArrayList<Vertex<T>> getAdjacencyList(String vertexId) {
        return this.adjacencyMap.get(vertexId);
    }

    public int getVertexGrade(String vertexId) {
        return this.getAdjacencyList(vertexId).size();
    }

    public void generateRandomEdgeValues(float min, float max) {
        Random r = new Random();
        ArrayList<String> nodesIds = new ArrayList<>(this.getAdjacencyMap().keySet());
        for (String id: nodesIds) {
            for (Edge e: this.getVertex(id).getEdges()) {
                float cost = min + r.nextFloat() * (max - min);
                e.setCost(cost);
            }
        }
    }

    public Graph<T> dijkstra(Vertex<T> source) {
        Graph<T> tree =  new Graph<>();
        HashMap<String, Boolean> visited = new HashMap<>();
        HashMap<String, Double> dist = new HashMap<>();
        PriorityQueue<Edge> queue =  new PriorityQueue<>(comparingDouble(Edge::getCost));

        for (String id : this.vertices.keySet()) {
            if (source.getId().equals(id)) dist.putIfAbsent(id, 0d);
            else dist.putIfAbsent(id, Double.MAX_VALUE);
        }

        queue.add(new Edge(source, source, 0d));

        while(!queue.isEmpty()) {
            Edge current = queue.remove();
            String id = current.getToId();

            if (visited.containsKey(id)) continue;

            Vertex<T> v = this.vertices.get(id);
            v.setLabel(dist.get(id) + "");
            tree.addVertex(v);
            visited.putIfAbsent(id, true);

            if (!current.getFromId().equals(id))
                tree.addDirectedEdge(current.getFromId(), id);

            ArrayList<Edge> edges = v.getEdges();
            for (Edge e : edges) {
                String toId = e.getToId();
                if (!visited.containsKey(toId)) {
                    double newCost = dist.get(id) + e.getCost();
                    if (newCost < dist.get(toId)) {
                        dist.put(toId, newCost);
                        queue.add(new Edge(current.getTo(), e.getTo(), newCost));
                    }
                }
            }
        }

        return tree;
    }

    public static Graph DFS_R(Vertex source) {
        Graph dfRTree =  new Graph<>();

        return Graph.DFS_RAux(dfRTree, null, source);
    }

    private static Graph DFS_RAux(Graph gTree, Vertex parent, Vertex current) {
        if (!gTree.vertexExists(current.getId())) {
            gTree.addVertex(new Vertex(current.getId()));

            if (parent != null) {
                gTree.addDirectedEdge(parent.getId(), current.getId());
            }

            ArrayList<Edge> edges = current.getEdges();
            for (Edge e : edges) {
                if (!gTree.vertexExists(e.getToId())) {
                    gTree = Graph.DFS_RAux(gTree, current, e.getTo());
                }
            }
        }

        return gTree;
    }


    public static Graph DFS_I(Vertex source) {
        Graph dfsTree =  new Graph<>();

        Stack<Vertex> pendingVertexes =  new Stack<>();
        Stack<Vertex> currentParent =  new Stack<>();

        pendingVertexes.push(source);

        while (!pendingVertexes.empty()) {
            Vertex current = pendingVertexes.peek();
            if (!dfsTree.vertexExists(current.getId())) {
                dfsTree.addVertex(new Vertex(current.getId()));
                if (!currentParent.empty()) {
                    dfsTree.addDirectedEdge(currentParent.peek().getId(), current.getId());
                }

                ArrayList<Edge> edges = current.getEdges();
                for (Edge e : edges) {
                    if (!dfsTree.vertexExists(e.getToId())) {
                        pendingVertexes.push(e.getTo());
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

    public static Graph BFS(Vertex source) {
        Graph bfsTree =  new Graph<>();

        Deque<Vertex> queue =  new LinkedList<>();
        queue.add(source);

        while (!queue.isEmpty()) {
            Vertex current = queue.remove();
            bfsTree.addVertex(new Vertex(current.getId()));

            ArrayList<Edge> edges = current.getEdges();
            for (Edge e : edges) {
                if (!bfsTree.vertexExists(e.getToId())) {
                    queue.add(e.getTo());
                    bfsTree.addVertex(new Vertex(e.getToId()));
                    bfsTree.addDirectedEdge(current.getId(), e.getToId());
                }
            }
        }
        return bfsTree;
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        for (Map.Entry<String, ArrayList<Vertex<T>>> vertex: this.adjacencyMap.entrySet()) {
            strBuilder.append(vertex.getKey());
            for (Vertex adjVertex: vertex.getValue()) {
                strBuilder.append(";").append(adjVertex.getId());
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

    public static void generateDL(Graph graph, String fileName) {
        int v = graph.vertices.size();
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("DL n=").append(v).append("\n");
        strBuilder.append("format = edgelist1\n");
        strBuilder.append("labels embedded:\n");
        strBuilder.append("data:\n");

        HashMap<String, Vertex> vertices = graph.getVertices();
        for (String id : vertices.keySet()) {
            ArrayList<Vertex> list = graph.getAdjacencyList(id);
            for (Vertex to : list) {
                strBuilder.append(graph.getVertex(id).getLabel()).append(" ").append(to.getLabel()).append("\n");
            }
        }

        try (FileWriter writer = new FileWriter("./" + fileName + ".dl");
             BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write(strBuilder.toString());
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
