package PatternPrototype;

class Circle implements Dub {
    private double radius;

    public Circle(double radius) {this.radius = radius;}
    public double getRadius() {return radius;}
    public void setRadius(double radius) {this.radius = radius;}

    @Override
    public Dub clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "src5.Circle" +
                "radius=" + radius ;
    }
}