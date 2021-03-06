package edu.kosolobov.shapes.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Point3D {
    private static final Logger log = LogManager.getLogger();
    private final Double x;
    private final Double y;
    private final Double z;

    public Point3D(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        log.log(Level.INFO, "{} was created", this);
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Double getZ() {
        return z;
    }

    public Point3D copy() {
        return new Point3D(x, y, z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point = (Point3D) o;
        return x.equals(point.x) && y.equals(point.y) && z.equals(point.z);
    }

    @Override
    public int hashCode() {
        double prime = 4.2;
        double result = 1.0;
        result = result * prime + x;
        result = result * prime + y;
        result = result * prime + z;
        return (int) result;
    }

    @Override
    public String toString() {
        return String.format("Point{X: %.2f, Y: %.2f, Z: %.2f}", x, y, z);
    }

    public static class PointBuilder {
        private Point3D point3D;
        private Double delta;
        private Double x;
        private Double y;
        private Double z;

        public PointBuilder() {
            super();
        }

        public void setZeroPoint(Point3D point3D) {
            this.point3D = point3D;
            x = point3D.x;
            y = point3D.y;
            z = point3D.z;
        }

        public void setDelta(Double delta) {
            this.delta = delta;
        }

        public PointBuilder moveX() {
            x+=delta;
            return this;
        }

        public PointBuilder moveY() {
            y+=delta;
            return this;
        }

        public PointBuilder moveZ() {
            z+=delta;
            return this;
        }

        public Point3D build() {
            Point3D result = new Point3D(x, y, z);
            x = point3D.x;
            y = point3D.y;
            z = point3D.z;
            return result;
        }
    }
}
