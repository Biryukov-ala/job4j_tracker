package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class PointRefactTest {

    @Test
    public void distance3d() {
        PointRefact a = new PointRefact(0, 1, 4);
        PointRefact b = new PointRefact(1, 2, 1);
        double dist = a.distance3d(b);
        assertThat(dist, closeTo(3.3166, 0.001));
    }
}