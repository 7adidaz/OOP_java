public class Fan {

  private int SLOW = 1, MEDIUM = 2, FAST = 3;
  private int speed;
  private boolean on;
  private double radius;
  private String color;

  Fan() {
    this.speed = SLOW;
    this.on = false;
    this.radius = 5;
    this.color = "blue";
  }

  Fan(int speed, boolean on, double radius, String color) {
    this.speed = speed;
    this.radius = radius;
    this.on = on;
    this.color = color;
  }

  public int getSpeed() {
    return speed;
  }

  public boolean getOn() {
    return on;
  }

  public double getRadius() {
    return radius;
  }

  public String getColor() {
    return color;
  }

  public void setSpeed(int speed) {
    if (on) {

      if (speed > 0 && speed < 4) {

        this.speed = speed;

        System.out.println("speed changed to : " + speed);

      } else {

        System.out.println("speed has to be between 1 and 3 ");
      }
    } else
      System.out.println("turn fan on to use change the speed");

  }

  public void setRadius(double radius) {
    if (radius > 0) {

      this.radius = radius;
    } else
      System.out.println("radius has to be larger than 0");
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setOn(boolean on) {
    this.on = on;
  }

  public String toString() {

    if (on) {

      return ("fan speed is : " + this.speed + ", with radius : " +
          this.radius + ", and it's color is : " + this.color);
    } else
      return ("Fan is off" + ", with radius : " +
          this.radius + ", and it's color is : " + this.color);

  }

  public static void main(String[] args) {

    Fan f = new Fan();
    f.setOn(true);
    System.out.println(f.toString());

  }
}
