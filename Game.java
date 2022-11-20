import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

  public static void main(String[] args) {
    List<BaseHero> units = new ArrayList<>();
    for (int i = 0; i < 51; i++) {
      units.add(getHero());
    }

    //units.forEach(n -> System.out.println(n.toString()));
    List result = setFilter(units, "Peasant");
    result.forEach(n -> System.out.println(n.toString()));
  }

  private static BaseHero getHero() {
    int num = new Random().nextInt(7);
    return switch (num) {
      case 0 -> new Peasant();
      case 1 -> new Robber();
      case 2 -> new Sniper();
      case 3 -> new Wizard();
      case 4 -> new Spearman();
      case 5 -> new Xbowman();
      case 6 -> new Monk();
      default -> new Peasant();
    };
  }

  private static List setFilter(List<BaseHero> list, String type) {
    List<BaseHero> newList = new ArrayList<>();
    for (BaseHero i : list) {
      if (i.toString().split(" ")[1].equals(type)) {
        newList.add(i);
      }
    }

    return newList;
  }
}
