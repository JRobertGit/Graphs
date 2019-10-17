package com.jroberto.cic;

import java.util.ArrayList;

public class Vertex<T> {
    private String id;

    private String label;

    private T data;

    private ArrayList<Edge> edges;

    Vertex(String id) {
        this.id = id;
        this.edges = new ArrayList<>();
    }

    Vertex(String id, T data) {
        this.id = id;
        this.data = data;
        this.edges = new ArrayList<>();
    }

    public String getId () {
        return this.id;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String newLabel) {
        this.label = newLabel;
    }

    public ArrayList<Edge> getEdges() {
        return this.edges;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Vertex) {
            return ((Vertex)o).id.equals(this.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
}
