package com.jroberto.cic;

public class Main {

    public static void main(String[] args) {
        // 2nd Project Tests
        GraphGenerator.genGilbert(50, 0.10, true, false).getDfTree().toCsv("GilbertDF30");
        GraphGenerator.genGilbert(50, 0.10, true, false).getDfrTree().toCsv("GilbertDFR30");
        GraphGenerator.genGilbert(50, 0.10, true, false).getBfTree().toCsv("GilbertBF30");

        GraphGenerator.genGilbert(100, 0.01, true, false).getDfTree().toCsv("GilbertDF100");
        GraphGenerator.genGilbert(100, 0.01, true, false).getDfrTree().toCsv("GilbertDFR100");
        GraphGenerator.genGilbert(100, 0.01, true, false).getBfTree().toCsv("GilbertBF100");

        GraphGenerator.genGilbert(500, 0.001, true, false).getDfTree().toCsv("GilbertDF500");
        GraphGenerator.genGilbert(500, 0.001, true, false).getDfrTree().toCsv("GilbertDFR500");
        GraphGenerator.genGilbert(500, 0.001, true, false).getBfTree().toCsv("GilbertBF500");

        GraphGenerator.genErdosRenyi(50, 150, true, false).getDfTree().toCsv("ErdosRenyiDF30");
        GraphGenerator.genErdosRenyi(50, 150, true, false).getDfrTree().toCsv("ErdosRenyiDFR30");
        GraphGenerator.genErdosRenyi(50, 150, true, false).getBfTree().toCsv("ErdosRenyiBF30");

        GraphGenerator.genErdosRenyi(100, 300, true, false).getDfTree().toCsv("ErdosRenyiDF100");
        GraphGenerator.genErdosRenyi(100, 300, true, false).getDfrTree().toCsv("ErdosRenyiDFR100");
        GraphGenerator.genErdosRenyi(100, 300, true, false).getBfTree().toCsv("ErdosRenyiBF100");

        GraphGenerator.genErdosRenyi(500, 1500, true, false).getDfTree().toCsv("ErdosRenyiDF500");
        GraphGenerator.genErdosRenyi(500, 1500, true, false).getDfrTree().toCsv("ErdosRenyiDFR500");
        GraphGenerator.genErdosRenyi(500, 1500, true, false).getBfTree().toCsv("ErdosRenyiBF500");

        GraphGenerator.genGeographic(50, 0.20, true, false).getDfTree().toCsv("GeographicDF30");
        GraphGenerator.genGeographic(50, 0.20, true, false).getDfrTree().toCsv("GeographicDFR30");
        GraphGenerator.genGeographic(50, 0.20, true, false).getBfTree().toCsv("GeographicBF30");

        GraphGenerator.genGeographic(100, 0.20, true, false).getDfTree().toCsv("GeographicDF100");
        GraphGenerator.genGeographic(100, 0.20, true, false).getDfrTree().toCsv("GeographicDFR100");
        GraphGenerator.genGeographic(100, 0.20, true, false).getBfTree().toCsv("GeographicBF100");

        GraphGenerator.genGeographic(500, 0.20, true, false).getDfTree().toCsv("GeographicDF500");
        GraphGenerator.genGeographic(500, 0.20, true, false).getDfrTree().toCsv("GeographicDFR500");
        GraphGenerator.genGeographic(500, 0.20, true, false).getBfTree().toCsv("GeographicBF500");

        GraphGenerator.genBarabasiAlbert(50, 2, true, false).getDfTree().toCsv("BarabasiAlbertDF30");
        GraphGenerator.genBarabasiAlbert(50, 2, true, false).getDfrTree().toCsv("BarabasiAlbertDFR30");
        GraphGenerator.genBarabasiAlbert(50, 2, true, false).getBfTree().toCsv("BarabasiAlbertBF30");

        GraphGenerator.genBarabasiAlbert(100, 3, true, false).getDfTree().toCsv("BarabasiAlbertDF100");
        GraphGenerator.genBarabasiAlbert(100, 3, true, false).getDfrTree().toCsv("BarabasiAlbertDFR100");
        GraphGenerator.genBarabasiAlbert(100, 3, true, false).getBfTree().toCsv("BarabasiAlbertBF100");

        GraphGenerator.genBarabasiAlbert(500, 6, true, false).getDfTree().toCsv("BarabasiAlbertDF500");
        GraphGenerator.genBarabasiAlbert(500, 6, true, false).getDfrTree().toCsv("BarabasiAlbertDFR500");
        GraphGenerator.genBarabasiAlbert(500, 6, true, false).getBfTree().toCsv("BarabasiAlbertBF500");

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
