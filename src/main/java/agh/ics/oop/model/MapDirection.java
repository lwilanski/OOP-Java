package agh.ics.oop.model;

public enum MapDirection {
    NORTH("N", new Vector2d(0, 1)),
    EAST("E", new Vector2d(1, 0)),
    SOUTH("S", new Vector2d(0, -1)),
    WEST("W", new Vector2d(-1, 0));

    private final String displayName;
    private final Vector2d vector;

    MapDirection(String displayName, Vector2d vector){
        this.displayName = displayName;
        this.vector = vector;
    }

    @Override
    public String toString(){
        return this.displayName;
    }

    public MapDirection next(){
        return values()[(this.ordinal() + 1) % values().length];
    }

    public MapDirection previous(){
        return values()[(this.ordinal() + values().length - 1) % values().length];
    }

    public Vector2d toUnitVector(){
        return this.vector;
    }
}
