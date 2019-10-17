package com.jroberto.cic;

import java.util.*;

public class GraphGenerator {
    public static Graph genGilbert(int n, double p, boolean isDirected, boolean auto) {
        Graph<Integer> graph = new Graph<>();
        for (int i = 0; i < n; i++) {
            Vertex<Integer> newVertex = new Vertex<>(i + "");
            graph.addVertex(newVertex);
        }

        HashMap<String, Boolean> edges = new HashMap<>();
        ArrayList<String> nodesIds = new ArrayList<>(graph.getAdjacencyMap().keySet());
        Collections.shuffle(nodesIds);

        for (String v1: nodesIds) {
            for (String v2: nodesIds) {
                if (!v1.equals(v2) || auto ) {
                    double pij = Math.random();
                    if (pij <= p) {
                        String key = v1 + "-" + v2;
                        if (!edges.containsKey(key)) {
                            addEdge(graph, v1, v2, isDirected);
                            edges.putIfAbsent(key, true);
                            if (!isDirected) {
                                edges.putIfAbsent(v2 + "-" + v1, true);
                            }
                        }
                    }
                }
            }
        }

        return graph;
    }

    public static Graph genErdosRenyi(int n, int m, boolean isDirected, boolean auto) {
        Graph<Integer> graph = new Graph<>();
        for (int i = 0; i < n; i++) {
            Vertex<Integer> newVertex = new Vertex<>(i + "");
            graph.addVertex(newVertex);
        }

        Random dist = new Random();
        HashMap<String, Boolean> edges = new HashMap<>();

        while (edges.size() < m) {
            String v1;
            String v2;
            do {
                v1 = dist.nextInt(n) + "";
                v2 = dist.nextInt(n) + "";
            } while (v1.equals(v2) && !auto);

            String key = v1 + "-" + v2;
            if (!edges.containsKey(key)) {
                addEdge(graph, v1, v2, isDirected);
                edges.putIfAbsent(key, true);
                if (!isDirected) {
                    edges.putIfAbsent(v2 + "-" + v1, true);
                }
            }
        }

        return graph;
    }

    public static Graph genGeographic(int n, double r, boolean isDirected, boolean auto) {
        Graph<Vector<Double>> graph = new Graph<>();

        for (int i = 0; i < n; i++) {
            Vector<Double> vector = new Vector<>(2);
            vector.add(0, Math.random());
            vector.add(1, Math.random());
            Vertex<Vector<Double>> newVertex = new Vertex<>(i + "", vector);
            graph.addVertex(newVertex);
        }

        ArrayList<String> nodesIds = new ArrayList<>(graph.getAdjacencyMap().keySet());
        Collections.shuffle(nodesIds);
        for (String id1: nodesIds) {
            for (String id2: nodesIds) {
                if (!id1.equals(id2) || auto ) {
                    Vector<Double> v1 = graph.getVertex(id1).getData();
                    Vector<Double> v2 = graph.getVertex(id2).getData();
                    double distance = Math.sqrt(Math.pow(v1.get(0) - v2.get(0), 2.0) + Math.pow(v1.get(1) - v2.get(1), 2.0));
                    if (distance <= r) {
                        addEdge(graph, id1, id2, isDirected);
                    }
                }
            }
        }

        return graph;
    }

    public static Graph genBarabasiAlbert(int n, int d, boolean isDirected, boolean auto) {
        Graph<Double> graph = new Graph<>();

        for (int i = 0; i < n; i++) {
            Vertex<Double> newVertex = new Vertex<>(i + "");
            graph.addVertex(newVertex);

            int size = graph.getAdjacencyMap().size();
            HashMap<String, Boolean> edges = new HashMap<>();
            ArrayList<String> nodesIds = new ArrayList<>(graph.getAdjacencyMap().keySet());
            Collections.shuffle(nodesIds);

            for (String id: nodesIds) {
                int count = 0;
                if ((!newVertex.getId().equals(id) || auto)) {
                    String key = id + "-" + newVertex.getId();
                    if (!edges.containsKey(key)) {
                        boolean add = i < d;
                        if (!add) {
                            double p = 1.0 - (double) (graph.getVertexGrade(id)) / d;
                            double sample = Math.random();
                            add = sample <= p;
                        }

                        if (add) {
                            addEdge(graph, id, newVertex.getId(), isDirected);
                            edges.putIfAbsent(key, true);
                            if (!isDirected) {
                                edges.putIfAbsent(newVertex.getId() + "-" + id, true);
                            }
                        }

                        if (++count >= d) break;
                    }
                }
            }
        }
        return graph;
    }

    private static void addEdge(Graph graph, String fromVertex, String toVertex, Boolean isDirected) {
        if (isDirected) {
            graph.addDirectedEdge(fromVertex, toVertex);
        } else {
            graph.addEdge(fromVertex, toVertex);
        }
    }
}
