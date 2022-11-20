public class Robber extends BaseHero {

  public Robber() {
    super("Stand", 8, 3, 10, 6, new int[] { 2, 4 });
  }

  @Override
  public String toString() {
    return this.getClass() + " " + super.toString() + ", " + state;
  }
}
