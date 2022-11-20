public class Spearman extends BaseHero {

  public Spearman() {
    super("Stand", 4, 5, 10, 4, new int[] { 1, 3 });
  }

  @Override
  public String toString() {
    return this.getClass() + " " + super.toString() + ", " + state;
  }
}
