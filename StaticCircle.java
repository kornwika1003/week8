class StaticCircle {
    static int numberOfObjects;
    double radius;

    static int getNumberObjects() {
        return numberOfObjects;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}
