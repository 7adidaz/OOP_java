// import java.util.Date;

public class StopWatch {

  private long startTime, endTime;

  public long getEndTime() {
    return endTime;
  }

  public long getStartTime() {
    return startTime;
  }

  StopWatch() {
    this.startTime = System.currentTimeMillis();
  }

  public void start() {

    this.startTime = System.currentTimeMillis();
  }

  public void stop() {

    this.endTime = System.currentTimeMillis();

  }

  public long getElapsedTime() {
    return this.endTime - this.startTime;
  }

  public static void main(String[] args) {
    StopWatch s = new StopWatch();
    s.start();
    System.out.println(s.getStartTime());
    for (int i = 0; i < 1000000000; i++) {

    }
    s.stop();

    System.out.println(s.getEndTime());
    System.out.println(s.getElapsedTime());

  }
}
