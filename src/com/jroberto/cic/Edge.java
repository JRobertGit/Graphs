package com.jroberto.cic;

public class Edge {

    private Vertex from;

    private Vertex to;

    private double cost;

    public Edge(Vertex from, Vertex to, double cost) {
        this.cost = cost;
        this.from = from;
        this.to = to;
    }

    public Vertex getFrom() {
        return this.from;
    }

    public Vertex getTo () {
        return this.to;
    }

    public String getFromId() {
        return this.from.getId();
    }

    public String getToId() {
        return this.to.getId();
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
