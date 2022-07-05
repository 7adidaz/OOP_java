public class Rectangle {
  public double width, height;

  public Rectangle() {
    this.width = 1;
    this.height = 1;
  }

  public Rectangle(int w, int h) {
    this.width = w;
    this.height = h;

  }

  public double getArea() {
    return this.height * this.width;
  }

  public double getPerimeter() {
    return 2 * (this.height * this.width);
  }

  public static void main(String[] args) {

    Rectangle r = new Rectangle();

    System.out.println(r.getPerimeter());

  }
}
