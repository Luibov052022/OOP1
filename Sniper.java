public class Sniper extends BaseHero {

  private int shoots;

  public Sniper() {
    super("Stand", 12, 10, 15, 9, new int[] { 8, 10 });
    this.shoots = 32;
  }

  @Override
  public String toString() {
    return (
      this.getClass() +
      " " +
      super.toString() +
      " Shoots: " +
      shoots +
      ", " +
      state
    );
  }
}
