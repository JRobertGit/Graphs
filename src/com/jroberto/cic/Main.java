package com.jroberto.cic;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // TESTS
        GraphGenerator.genGilbert(30, 0.15, true, false).toCsv("Gilbert30");
        GraphGenerator.genGilbert(100, 0.01, true, false).toCsv("Gilbert100");
        GraphGenerator.genGilbert(500, 0.01, true, false).toCsv("Gilbert500");
        GraphGenerator.genErdosRenyi(30, 90, true, false).toCsv("ErdosRenyi30");
        GraphGenerator.genErdosRenyi(100, 300, true, false).toCsv("ErdosRenyi100");
        GraphGenerator.genErdosRenyi(500, 1500, true, false).toCsv("ErdosRenyi500");
        GraphGenerator.genGeographic(30, 0.15, true, false).toCsv("Geographic30");
        GraphGenerator.genGeographic(100, 0.15, true, false).toCsv("Geographic100");
        GraphGenerator.genGeographic(500, 0.15, true, false).toCsv("Geographic500");
        GraphGenerator.genBarabasiAlbert(30, 2, true, false).toCsv("BarabasiAlbert30");
        GraphGenerator.genBarabasiAlbert(100, 3, true, false).toCsv("BarabasiAlbert100");
        GraphGenerator.genBarabasiAlbert(500, 6, true, false).toCsv("BarabasiAlbert500");
    }
}
