package com.jroberto.cic;

public class Edge {

    private String fromId;

    private String toId;

    private double cost;

    public Edge(String fromId, String toId, double cost) {
        this.cost = cost;
        this.fromId = fromId;
        this.toId = toId;
    }

    public String getFrom() {
        return this.fromId;
    }

    public String getTo() {
        return this.toId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
