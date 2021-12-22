package ru.job4j.oop;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PointRefact {
        private int x;

        private int y;

        public PointRefact(int first, int second) {
            this.x = first;
            this.y = second;
        }

        public double distance(PointRefact that) {
            return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
        }

        public static void main(String[] args) {
            PointRefact a = new PointRefact(0, 0);
            PointRefact b = new PointRefact(0, 2);
            double dist = a.distance(b);
            System.out.println(dist);
        }
}
