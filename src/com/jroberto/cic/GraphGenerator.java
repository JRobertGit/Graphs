package com.jroberto.cic;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.Vector;

public class GraphGenerator {
    public static Graph genGilbert(int n, double p, boolean isDirected, boolean auto) {
        Graph<Integer> graph = new Graph<>();
        for (int i = 0; i < n; i++) {
            Vertex<Integer> newVertex = new Vertex<>(i + "");
            graph.addVertex(newVertex);
        }

        HashMap<String, Boolean> edges = new HashMap<>();
        Set<Vertex<Integer>> nodes = graph.getAdjacencyMap().keySet();

        for (Vertex v1: nodes) {
            for (Vertex v2: nodes) {
                if (!v1.equals(v2) || auto ) {
                    double pij = Math.random();
                    if (pij <= p) {
                        String key = v1.getLabel() + "-" + v2.getLabel();
                        if (!edges.containsKey(key)) {
                            addEdge(graph, v1.getLabel(), v2.getLabel(), isDirected);
                            edges.putIfAbsent(key, true);
                            if (!isDirected) {
                                edges.putIfAbsent(v2.getLabel() + "-" + v1.getLabel(), true);
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

        Set<Vertex<Vector<Double>>> nodes = graph.getAdjacencyMap().keySet();
        for (Vertex<Vector<Double>> v1: nodes) {
            for (Vertex<Vector<Double>> v2: nodes) {
                if (!v1.equals(v2) || auto ) {
                    double distance = Math.sqrt(Math.pow(v1.getData().get(0) - v2.getData().get(0), 2.0) + Math.pow(v1.getData().get(1) - v2.getData().get(1), 2.0));
                    if (distance <= r) {
                        addEdge(graph, v1.getLabel(), v2.getLabel(), isDirected);
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
            Set<Vertex<Double>> nodes = graph.getAdjacencyMap().keySet();

            if (i <= d) {
                for (Vertex<Double> v2: nodes) {
                    if (!newVertex.equals(v2) || auto) {
                        String key = newVertex.getLabel() + "-" + v2.getLabel();

                        if (!edges.containsKey(key)) {
                            addEdge(graph, newVertex.getLabel(), v2.getLabel(), isDirected);
                            edges.putIfAbsent(key, true);

                            if (!isDirected) {
                                edges.putIfAbsent(v2.getLabel() + "-" + newVertex.getLabel(), true);
                            }
                        }
                    }
                }
            }
            else {
                int grade = graph.getVertexGrade(newVertex.getLabel());

                while (grade < d) {
                    for (Vertex<Double> v2: nodes) {
                        String key = newVertex.getLabel() + "-" + v2.getLabel();

                        if (!edges.containsKey(key) && (!newVertex.equals(v2) || auto)) {
                            double p = (double) graph.getVertexGrade(v2.getLabel()) / (double)size;
                            double sample = Math.random();

                            if (sample <= p) {
                                addEdge(graph, newVertex.getLabel(), v2.getLabel(), isDirected);
                                edges.putIfAbsent(key, true);

                                if (!isDirected) {
                                    edges.putIfAbsent(v2.getLabel() + "-" + newVertex.getLabel(), true);
                                }

                                grade = graph.getVertexGrade(newVertex.getLabel());
                            }
                        }
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