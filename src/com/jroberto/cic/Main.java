package com.jroberto.cic;

public class Main {

    public static void main(String[] args) {
        // 3rd Project Tests
        Graph gilbert30 = GraphGenerator.genGilbert(30, 0.30, true, false);
        gilbert30.toCsv("Gilbert30");
        gilbert30.generateRandomEdgeValues(1.0f, 10.0f);
        Graph djk = gilbert30.dijkstra(gilbert30.getVertex("1"));
        Graph.generateDL(djk, "Gilbert30");

        Graph gilbert100 = GraphGenerator.genGilbert(100, 0.25, true, false);
        gilbert100.toCsv("Gilbert100");
        gilbert100.generateRandomEdgeValues(1.0f, 10.0f);
        djk = gilbert100.dijkstra(gilbert100.getVertex("1"));
        Graph.generateDL(djk, "Gilbert100");

        Graph gilbert500 = GraphGenerator.genGilbert(500, 0.25, true, false);
        gilbert500.toCsv("Gilbert500");
        gilbert500.generateRandomEdgeValues(1.0f, 10.0f);
        djk = gilbert500.dijkstra(gilbert500.getVertex("1"));
        Graph.generateDL(djk, "Gilbert500");

        Graph erdosRenyi30 = GraphGenerator.genErdosRenyi(30, 90, true, false);
        erdosRenyi30.toCsv("ErdosRenyi30");
        erdosRenyi30.generateRandomEdgeValues(1.0f, 10.0f);
        djk = erdosRenyi30.dijkstra(erdosRenyi30.getVertex("1"));
        Graph.generateDL(djk, "ErdosRenyi30");

        Graph erdosRenyi100 = GraphGenerator.genErdosRenyi(100, 300, true, false);
        erdosRenyi100.toCsv("ErdosRenyi100");
        erdosRenyi100.generateRandomEdgeValues(1.0f, 10.0f);
        djk = erdosRenyi100.dijkstra(erdosRenyi100.getVertex("1"));
        Graph.generateDL(djk, "ErdosRenyi100");

        Graph erdosRenyi500 = GraphGenerator.genErdosRenyi(500, 1500, true, false);
        erdosRenyi500.toCsv("ErdosRenyi500");
        erdosRenyi500.generateRandomEdgeValues(1.0f, 10.0f);
        djk = erdosRenyi500.dijkstra(erdosRenyi500.getVertex("1"));
        Graph.generateDL(djk, "ErdosRenyi500");

        Graph geographic30 = GraphGenerator.genGeographic(30, 0.25, true, false);
        geographic30.toCsv("Geographic30");
        geographic30.generateRandomEdgeValues(1.0f, 10.0f);
        djk = geographic30.dijkstra(geographic30.getVertex("1"));
        Graph.generateDL(djk, "Geographic30");

        Graph geographic100 = GraphGenerator.genGeographic(100, 0.25, true, false);
        geographic100.toCsv("Geographic100");
        geographic100.generateRandomEdgeValues(1.0f, 10.0f);
        djk = geographic100.dijkstra(geographic100.getVertex("1"));
        Graph.generateDL(djk, "gGographic100");

        Graph geographic500 = GraphGenerator.genGeographic(500, 0.25, true, false);
        geographic500.toCsv("Geographic500");
        geographic500.generateRandomEdgeValues(1.0f, 10.0f);
        djk = geographic500.dijkstra(geographic500.getVertex("1"));
        Graph.generateDL(djk, "Geographic500");

        Graph barabasiAlbert30 = GraphGenerator.genBarabasiAlbert(30, 2, true, false);
        barabasiAlbert30.toCsv("BarabasiAlbert30");
        barabasiAlbert30.generateRandomEdgeValues(1.0f, 10.0f);
        djk = barabasiAlbert30.dijkstra(barabasiAlbert30.getVertex("1"));
        Graph.generateDL(djk, "BarabasiAlbert30");

        Graph barabasiAlbert100 = GraphGenerator.genBarabasiAlbert(100, 3, true, false);
        barabasiAlbert100.toCsv("BarabasiAlbert100");
        barabasiAlbert100.generateRandomEdgeValues(1.0f, 10.0f);
        djk = barabasiAlbert100.dijkstra(barabasiAlbert100.getVertex("1"));
        Graph.generateDL(djk, "BarabasiAlbert100");

        Graph barabasiAlbert500 = GraphGenerator.genBarabasiAlbert(500, 6, true, false);
        barabasiAlbert500.toCsv("BarabasiAlbert500");
        barabasiAlbert500.generateRandomEdgeValues(1.0f, 10.0f);
        djk = barabasiAlbert500.dijkstra(barabasiAlbert500.getVertex("1"));
        Graph.generateDL(djk, "BarabasiAlbert500");

        // 2nd Project Tests
//        Graph gilbert30 = GraphGenerator.genGilbert(30, 0.30, true, false);
//        gilbert30.toCsv("Gilbert30");
//        gilbert30.getDfTree().toCsv("GilbertDF30");
//        gilbert30.getDfrTree().toCsv("GilbertDFR30");
//        gilbert30.getBfTree().toCsv("GilbertBF30");
//
//        Graph gilbert100 = GraphGenerator.genGilbert(100, 0.25, true, false);
//        gilbert100.toCsv("Gilbert100");
//        gilbert100.getDfTree().toCsv("GilbertDF100");
//        gilbert100.getDfrTree().toCsv("GilbertDFR100");
//        gilbert100.getBfTree().toCsv("GilbertBF100");
//
//        Graph gilbert500 = GraphGenerator.genGilbert(500, 0.25, true, false);
//        gilbert500.toCsv("Gilbert500");
//        gilbert500.getDfTree().toCsv("GilbertDF500");
//        gilbert500.getDfrTree().toCsv("GilbertDFR500");
//        gilbert500.getBfTree().toCsv("GilbertBF500");
//
//        Graph erdosRenyi30 = GraphGenerator.genErdosRenyi(30, 90, true, false);
//        erdosRenyi30.toCsv("ErdosRenyi30");
//        erdosRenyi30.getDfTree().toCsv("ErdosRenyiDF30");
//        erdosRenyi30.getDfrTree().toCsv("ErdosRenyiDFR30");
//        erdosRenyi30.getBfTree().toCsv("ErdosRenyiBF30");
//
//        Graph erdosRenyi100 = GraphGenerator.genErdosRenyi(100, 300, true, false);
//        erdosRenyi100.toCsv("ErdosRenyi100");
//        erdosRenyi100.getDfTree().toCsv("ErdosRenyiDF100");
//        erdosRenyi100.getDfrTree().toCsv("ErdosRenyiDFR100");
//        erdosRenyi100.getBfTree().toCsv("ErdosRenyiBF100");
//
//        Graph erdosRenyi500 = GraphGenerator.genErdosRenyi(500, 1500, true, false);
//        erdosRenyi500.toCsv("ErdosRenyi500");
//        erdosRenyi500.getDfTree().toCsv("ErdosRenyiDF500");
//        erdosRenyi500.getDfrTree().toCsv("ErdosRenyiDFR500");
//        erdosRenyi500.getBfTree().toCsv("ErdosRenyiBF500");
//
//        Graph geographic30 = GraphGenerator.genGeographic(30, 0.25, true, false);
//        geographic30.toCsv("Geographic30");
//        geographic30.getDfTree().toCsv("GeographicDF30");
//        geographic30.getDfrTree().toCsv("GeographicDFR30");
//        geographic30.getBfTree().toCsv("GeographicBF30");
//
//        Graph geographic100 = GraphGenerator.genGeographic(100, 0.25, true, false);
//        geographic100.toCsv("Geographic100");
//        geographic100.getDfTree().toCsv("GeographicDF100");
//        geographic100.getDfrTree().toCsv("GeographicDFR100");
//        geographic100.getBfTree().toCsv("GeographicBF100");
//
//        Graph geographic500 = GraphGenerator.genGeographic(500, 0.25, true, false);
//        geographic500.toCsv("Geographic500");
//        geographic500.getDfTree().toCsv("GeographicDF500");
//        geographic500.getDfrTree().toCsv("GeographicDFR500");
//        geographic500.getBfTree().toCsv("GeographicBF500");
//
//        Graph barabasiAlbert30 = GraphGenerator.genBarabasiAlbert(30, 2, true, false);
//        barabasiAlbert30.toCsv("BarabasiAlbert30");
//        barabasiAlbert30.getDfTree().toCsv("BarabasiAlbertDF30");
//        barabasiAlbert30.getDfrTree().toCsv("BarabasiAlbertDFR30");
//        barabasiAlbert30.getBfTree().toCsv("BarabasiAlbertBF30");
//
//        Graph barabasiAlbert100 = GraphGenerator.genBarabasiAlbert(100, 3, true, false);
//        barabasiAlbert100.toCsv("BarabasiAlbert100");
//        barabasiAlbert100.getDfTree().toCsv("BarabasiAlbertDF100");
//        barabasiAlbert100.getDfrTree().toCsv("BarabasiAlbertDFR100");
//        barabasiAlbert100.getBfTree().toCsv("BarabasiAlbertBF100");
//
//        Graph barabasiAlbert500 = GraphGenerator.genBarabasiAlbert(500, 6, true, false);
//        barabasiAlbert500.toCsv("BarabasiAlbert500");
//        barabasiAlbert500.getDfTree().toCsv("BarabasiAlbertDF500");
//        barabasiAlbert500.getDfrTree().toCsv("BarabasiAlbertDFR500");
//        barabasiAlbert500.getBfTree().toCsv("BarabasiAlbertBF500");

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
