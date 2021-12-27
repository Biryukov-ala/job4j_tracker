package ru.job4j.oop;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PointRefact {
        private int x;

        private int y;

        private int z;

        public PointRefact(int first, int second, int third) {
            this.x = first;
            this.y = second;
            this.z = third;
        }

        public double distance3d(PointRefact that) {
            return sqrt(pow(this.x - that.x, 2)
                    + pow(this.y - that.y, 2)
                    + pow(this.z - that.z, 2));
        }
}
