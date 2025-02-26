package agh.ics.oop.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Vector2dTest {
    Vector2d vector0 = new Vector2d(0, 0);
    Vector2d vector1 = new Vector2d(1, 1);
    Vector2d vector2 = new Vector2d(1, 1);
    Vector2d vector3 = new Vector2d(2, 3);

    Vector2d vector4 = new Vector2d(1, 4);

    @Test
    public void testEquals(){
        assertEquals(vector1, vector2);
        assertNotEquals(vector1, vector3);
        assertNotEquals(vector2, vector3);
    }

    @Test
    public void testToString(){
        assertEquals("(1, 1)", vector1.toString());
        assertEquals("(1, 1)", vector2.toString());
        assertEquals("(2, 3)", vector3.toString());
    }

    @Test
    public void testPrecedes(){
        assertTrue(vector1.precedes(vector2));
        assertTrue(vector1.precedes(vector3));
        assertFalse(vector1.precedes(vector0));
    }

    @Test
    public void testFollows(){
        assertTrue(vector1.follows(vector2));
        assertFalse(vector1.follows(vector3));
        assertTrue(vector1.follows(vector0));
    }

    @Test
    public void testUpperRight(){
        assertEquals(new Vector2d(1, 1), vector1.upperRight(vector2));
        assertEquals(new Vector2d(2, 3), vector0.upperRight(vector3));
        assertEquals(new Vector2d(2, 4), vector3.upperRight(vector4));
    }

    @Test
    public void testLowerLeft(){
        assertEquals(new Vector2d(1, 1), vector1.lowerLeft(vector2));
        assertEquals(new Vector2d(0, 0), vector0.lowerLeft(vector3));
        assertEquals(new Vector2d(1, 3), vector3.lowerLeft(vector4));
    }

    @Test
    public void testAddition(){
        assertEquals(new Vector2d(2, 2), vector1.add(vector2));
        assertEquals(new Vector2d(3, 7), vector3.add(vector4));
    }

    @Test
    public void testSubtraction(){
        assertEquals(new Vector2d(0, 0), vector1.subtract(vector2));
        assertEquals(new Vector2d(-2, -3), vector0.subtract(vector3));
    }

    @Test
    public void testOpposite(){
        assertEquals(new Vector2d(0, 0), vector0.opposite());
        assertEquals(new Vector2d(-1, -4), vector4.opposite());
    }


}
