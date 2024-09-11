package org.ethz;

class Node {
    private double x;
    private double y;
    private String id;

    public Node (double x, double y, String id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getId() {
        return id;
    }
}
