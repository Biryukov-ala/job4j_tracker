package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest extends TestCase {

@Test
    public void testDistance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist, closeTo(2.0, 0.001));
    }
}