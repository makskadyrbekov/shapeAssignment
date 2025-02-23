class RightTriangle extends Shape implements Polygon {
    protected double base, height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }

    @Override
    double getPerimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}