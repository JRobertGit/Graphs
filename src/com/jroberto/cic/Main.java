package com.jroberto.cic;

public class Main {

    public static void main(String[] args) {
        // 3rd Project Tests
//        Graph gilbert30 = GraphGenerator.genGilbert(30, 0.30, true, false);
//        gilbert30.generateRandomEdgeValues(1.0f, 10.0f);
//        Graph djk = gilbert30.dijkstra(gilbert30.getVertex("1"));
//        Graph.generateDL(djk, "Gilbert30");
//
//        Graph gilbert100 = GraphGenerator.genGilbert(100, 0.25, true, false);
//        gilbert100.toCsv("Gilbert100");
//        gilbert100.generateRandomEdgeValues(1.0f, 10.0f);
//        djk = gilbert100.dijkstra(gilbert100.getVertex("1"));
//        Graph.generateDL(djk, "Gilbert100");
//
//        Graph gilbert500 = GraphGenerator.genGilbert(500, 0.25, true, false);
//        gilbert500.toCsv("Gilbert500");
//        gilbert500.generateRandomEdgeValues(1.0f, 10.0f);
//        djk = gilbert500.dijkstra(gilbert500.getVertex("1"));
//        Graph.generateDL(djk, "Gilbert500");
//
//        Graph erdosRenyi30 = GraphGenerator.genErdosRenyi(30, 90, true, false);
//        erdosRenyi30.toCsv("ErdosRenyi30");
//        erdosRenyi30.generateRandomEdgeValues(1.0f, 10.0f);
//        djk = erdosRenyi30.dijkstra(erdosRenyi30.getVertex("1"));
//        Graph.generateDL(djk, "ErdosRenyi30");
//
//        Graph erdosRenyi100 = GraphGenerator.genErdosRenyi(100, 300, true, false);
//        erdosRenyi100.toCsv("ErdosRenyi100");
//        erdosRenyi100.generateRandomEdgeValues(1.0f, 10.0f);
//        djk = erdosRenyi100.dijkstra(erdosRenyi100.getVertex("1"));
//        Graph.generateDL(djk, "ErdosRenyi100");
//
//        Graph erdosRenyi500 = GraphGenerator.genErdosRenyi(500, 1500, true, false);
//        erdosRenyi500.toCsv("ErdosRenyi500");
//        erdosRenyi500.generateRandomEdgeValues(1.0f, 10.0f);
//        djk = erdosRenyi500.dijkstra(erdosRenyi500.getVertex("1"));
//        Graph.generateDL(djk, "ErdosRenyi500");
//
//        Graph geographic30 = GraphGenerator.genGeographic(30, 0.25, true, false);
//        geographic30.toCsv("Geographic30");
//        geographic30.generateRandomEdgeValues(1.0f, 10.0f);
//        djk = geographic30.dijkstra(geographic30.getVertex("1"));
//        Graph.generateDL(djk, "Geographic30");
//
//        Graph geographic100 = GraphGenerator.genGeographic(100, 0.25, true, false);
//        geographic100.toCsv("Geographic100");
//        geographic100.generateRandomEdgeValues(1.0f, 10.0f);
//        djk = geographic100.dijkstra(geographic100.getVertex("1"));
//        Graph.generateDL(djk, "Gographic100");
//
//        Graph geographic500 = GraphGenerator.genGeographic(500, 0.25, true, false);
//        geographic500.toCsv("Geographic500");
//        geographic500.generateRandomEdgeValues(1.0f, 10.0f);
//        djk = geographic500.dijkstra(geographic500.getVertex("1"));
//        Graph.generateDL(djk, "Geographic500");
//
//        Graph barabasiAlbert30 = GraphGenerator.genBarabasiAlbert(30, 2, true, false);
//        barabasiAlbert30.toCsv("BarabasiAlbert30");
//        barabasiAlbert30.generateRandomEdgeValues(1.0f, 10.0f);
//        djk = barabasiAlbert30.dijkstra(barabasiAlbert30.getVertex("1"));
//        Graph.generateDL(djk, "BarabasiAlbert30");
//
//        Graph barabasiAlbert100 = GraphGenerator.genBarabasiAlbert(100, 3, true, false);
//        barabasiAlbert100.toCsv("BarabasiAlbert100");
//        barabasiAlbert100.generateRandomEdgeValues(1.0f, 10.0f);
//        djk = barabasiAlbert100.dijkstra(barabasiAlbert100.getVertex("1"));
//        Graph.generateDL(djk, "BarabasiAlbert100");
//
//        Graph barabasiAlbert500 = GraphGenerator.genBarabasiAlbert(500, 6, true, false);
//        barabasiAlbert500.toCsv("BarabasiAlbert500");
//        barabasiAlbert500.generateRandomEdgeValues(1.0f, 10.0f);
//        djk = barabasiAlbert500.dijkstra(barabasiAlbert500.getVertex("1"));
//        Graph.generateDL(djk, "BarabasiAlbert500");

        // 2nd Project Tests
//        Graph gilbert30 = GraphGenerator.genGilbert(30, 0.30, true, false);
//        gilbert30.toCsv("Gilbert30");
//        Graph.DFS_I(gilbert30.getVertex("1")).toCsv("GilbertDF30");
//        Graph.DFS_R(gilbert30.getVertex("1")).toCsv("GilbertDFR30");
//        Graph.BFS(gilbert30.getVertex("1")).toCsv("GilbertBF30");
//
//        Graph gilbert100 = GraphGenerator.genGilbert(100, 0.25, true, false);
//        gilbert100.toCsv("Gilbert100");
//        Graph.DFS_I(gilbert100.getVertex("1")).toCsv("GilbertDF100");
//        Graph.DFS_R(gilbert100.getVertex("1")).toCsv("GilbertDFR100");
//        Graph.BFS(gilbert100.getVertex("1")).toCsv("GilbertBF100");
//
//        Graph gilbert500 = GraphGenerator.genGilbert(500, 0.25, true, false);
//        gilbert500.toCsv("Gilbert500");
//        Graph.DFS_I(gilbert500.getVertex("1")).toCsv("GilbertDF500");
//        Graph.DFS_R(gilbert500.getVertex("1")).toCsv("GilbertDFR500");
//        Graph.BFS(gilbert500.getVertex("1")).toCsv("GilbertBF500");
//
//        Graph erdosRenyi30 = GraphGenerator.genErdosRenyi(30, 90, true, false);
//        erdosRenyi30.toCsv("ErdosRenyi30");
//        Graph.DFS_I(erdosRenyi30.getVertex("1")).toCsv("ErdosRenyiDF30");
//        Graph.DFS_R(erdosRenyi30.getVertex("1")).toCsv("ErdosRenyiDFR30");
//        Graph.BFS(erdosRenyi30.getVertex("1")).toCsv("ErdosRenyiBF30");
//
//        Graph erdosRenyi100 = GraphGenerator.genErdosRenyi(100, 300, true, false);
//        erdosRenyi100.toCsv("ErdosRenyi100");
//        Graph.DFS_I(erdosRenyi100.getVertex("1")).toCsv("ErdosRenyiDF100");
//        Graph.DFS_R(erdosRenyi100.getVertex("1")).toCsv("ErdosRenyiDFR100");
//        Graph.BFS(erdosRenyi100.getVertex("1")).toCsv("ErdosRenyiBF100");
//
//        Graph erdosRenyi500 = GraphGenerator.genErdosRenyi(500, 1500, true, false);
//        erdosRenyi500.toCsv("ErdosRenyi500");
//        Graph.DFS_I(erdosRenyi500.getVertex("1")).toCsv("ErdosRenyiDF500");
//        Graph.DFS_R(erdosRenyi500.getVertex("1")).toCsv("ErdosRenyiDFR500");
//        Graph.BFS(erdosRenyi500.getVertex("1")).toCsv("ErdosRenyiBF500");
//
//        Graph geographic30 = GraphGenerator.genGeographic(30, 0.25, true, false);
//        geographic30.toCsv("Geographic30");
//        Graph.DFS_I(geographic30.getVertex("1")).toCsv("GeographicDF30");
//        Graph.DFS_R(geographic30.getVertex("1")).toCsv("GeographicDFR30");
//        Graph.BFS(geographic30.getVertex("1")).toCsv("GeographicBF30");
//
//        Graph geographic100 = GraphGenerator.genGeographic(100, 0.25, true, false);
//        geographic100.toCsv("Geographic100");
//        Graph.DFS_I(geographic100.getVertex("1")).toCsv("GeographicDF100");
//        Graph.DFS_R(geographic100.getVertex("1")).toCsv("GeographicDFR100");
//        Graph.BFS(geographic100.getVertex("1")).toCsv("GeographicBF100");
//
//        Graph geographic500 = GraphGenerator.genGeographic(500, 0.25, true, false);
//        geographic500.toCsv("Geographic500");
//        Graph.DFS_I(geographic500.getVertex("1")).toCsv("GeographicDF500");
//        Graph.DFS_R(geographic500.getVertex("1")).toCsv("GeographicDFR500");
//        Graph.BFS(geographic500.getVertex("1")).toCsv("GeographicBF500");
//
//        Graph barabasiAlbert30 = GraphGenerator.genBarabasiAlbert(30, 2, true, false);
//        barabasiAlbert30.toCsv("BarabasiAlbert30");
//        Graph.DFS_I(barabasiAlbert30.getVertex("1")).toCsv("BarabasiAlbertDF30");
//        Graph.DFS_R(barabasiAlbert30.getVertex("1")).toCsv("BarabasiAlbertDFR30");
//        Graph.BFS(barabasiAlbert30.getVertex("1")).toCsv("BarabasiAlbertBF30");
//
//        Graph barabasiAlbert100 = GraphGenerator.genBarabasiAlbert(100, 3, true, false);
//        barabasiAlbert100.toCsv("BarabasiAlbert100");
//        Graph.DFS_I(barabasiAlbert100.getVertex("1")).toCsv("BarabasiAlbertDF100");
//        Graph.DFS_R(barabasiAlbert100.getVertex("1")).toCsv("BarabasiAlbertDFR100");
//        Graph.BFS(barabasiAlbert100.getVertex("1")).toCsv("BarabasiAlbertBF100");
//
//        Graph barabasiAlbert500 = GraphGenerator.genBarabasiAlbert(500, 6, true, false);
//        barabasiAlbert500.toCsv("BarabasiAlbert500");
//        Graph.DFS_I(barabasiAlbert500.getVertex("1")).toCsv("BarabasiAlbertDF500");
//        Graph.DFS_R(barabasiAlbert500.getVertex("1")).toCsv("BarabasiAlbertDFR500");
//        Graph.BFS(barabasiAlbert500.getVertex("1")).toCsv("BarabasiAlbertBF500");

        // 1rst Project Tests
//        GraphGenerator.genGilbert(50, 0.10, true, false).toCsv("Gilbert30");
//        GraphGenerator.genGilbert(100, 0.01, true, false).toCsv("Gilbert100");
//        GraphGenerator.genGilbert(500, 0.001, true, false).toCsv("Gilbert500");
//        GraphGenerator.genErdosRenyi(50, 150, true, false).toCsv("ErdosRenyi30");
//        GraphGenerator.genErdosRenyi(100, 300, true, false).toCsv("ErdosRenyi100");
//        GraphGenerator.genErdosRenyi(500, 1500, true, false).toCsv("ErdosRenyi500");
//        GraphGenerator.genGeographic(50, 0.20, true, false).toCsv("Geographic30");
//        GraphGenerator.genGeographic(100, 0.20, true, false).toCsv("Geographic100");
//        GraphGenerator.genGeographic(500, 0.20, true, false).toCsv("Geographic500");
//        GraphGenerator.genBarabasiAlbert(50, 2, true, false).toCsv("BarabasiAlbert30");
//        GraphGenerator.genBarabasiAlbert(100, 3, true, false).toCsv("BarabasiAlbert100");
//        GraphGenerator.genBarabasiAlbert(500, 6, true, false).toCsv("BarabasiAlbert500");
    }
}
