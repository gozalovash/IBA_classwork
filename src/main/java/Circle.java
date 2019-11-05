public class Circle extends Figure {
    public Point centre;
    public double radius;

    public Circle(double cx,double cy, double radius) {
        this.centre = new Point(cx,cy);
        this.radius = radius;
    }

    public Point getCentre() {
        return centre;
    }

    public double getRadius() {
        return radius;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle"+ '(' + centre + ',' + radius +')';
    }
}
