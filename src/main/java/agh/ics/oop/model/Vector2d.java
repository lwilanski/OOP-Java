package agh.ics.oop.model;

import java.util.Objects;

public class Vector2d {
    private final int x;
    private final int y;

    public Vector2d(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {return this.x;}

    public int getY() {return this.y;}

    public boolean precedes(Vector2d other){
        return this.x <= other.getX() && this.y <= other.getY();
    }

    public boolean follows(Vector2d other){
        return this.x >= other.getX() && this.y >= other.getY();
    }

    public Vector2d add(Vector2d other){
        return new Vector2d(this.x + other.getX(), this.y + other.getY());
    }

    public Vector2d subtract(Vector2d other){
        return new Vector2d(this.x - other.getX(), this.y - other.getY());
    }

    public Vector2d upperRight(Vector2d other){
        return new Vector2d(Math.max(this.x, other.getX()), Math.max(this.y, other.getY()));
    }

    public Vector2d lowerLeft(Vector2d other){
        return new Vector2d(Math.min(this.x, other.getX()), Math.min(this.y, other.getY()));
    }

    public Vector2d opposite(){
        return new Vector2d(-this.x, -this.y);
    }

    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y +  ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }

    public boolean equals(Object other){
        if (this == other)
            return true;
        if (!(other instanceof Vector2d that))
            return false;
        return this.x == that.getX() && this.y == that.getY();
    }

}
