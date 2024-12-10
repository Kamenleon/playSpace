import java.util.List;
import java.util.ArrayList;

class TipCalculator {
  private List<String> names = new ArrayList<>();
  private int tipPercentage = 0;

  public void addPErson(String name) {
    names.add(name);
    if(names.size() > 5) {
      tipPercentage = 20;
    } else if (names.size() > 0) {
      tipPercentage = 10;
    }
  }

  public List<String> getNames() {
    return names;
  }

  public int getTipPersentage() {
    return tipPercentage;
  }
}
