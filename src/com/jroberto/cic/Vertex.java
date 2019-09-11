package com.jroberto.cic;

public class Vertex<T> {
    private String label;

    private T data;

    Vertex(String label) {
        this.label = label;
    }

    Vertex(String label, T data) {
        this.label = label;
        this.data = data;
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

    @Override
    public boolean equals(Object o) {
        if (o instanceof Vertex) {
            return ((Vertex)o).label.equals(this.label);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.label.hashCode();
    }
}
