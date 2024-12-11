import java.util.List;
import java.util.ArrayList;

public class Coffee_3_7 {

  public static void main(String[] args) {

    ArrayList<Double> lapTimes = new ArrayList<>();
    lapTimes.add(31.0);
    lapTimes.add(20.9);
    lapTimes.add(21.1);
    lapTimes.add(21.3);

    System.out.println("lapTimes: " + lapTimes.toString());
    System.out.printf("Total: %.1fs\n", totalTime(lapTimes));
    System.out.println("lapTimes: " + lapTimes.toString());
    System.out.printf("Avg:: %.1fs\n", avgTime(lapTimes));
  }

  public static double totalTime(List<Double> lapTimeList) {
    ArrayList<Double> lapTimes = new ArrayList<>(lapTimeList); //add row
 
    lapTimes.remove(0);
    double sum = 0;
    for (double x: lapTimes) {
      sum += x;
    }
    return sum;
  }

  public static double avgTime(List<Double> lapTimes) {
    final int WITHOUT_WARMUP_LAP = 1; // add row

    double time = totalTime(lapTimes);
    int laps = lapTimes.size() - WITHOUT_WARMUP_LAP; // add minus
    System.out.println("time: " + time);
    System.out.println("laps: " + laps);
    return time / laps;
  }
}
