public class Monk extends BaseHero{
    private boolean magic;

  public Monk() {
    super("Stand", 17, 12, 30, 9, new int[] { -5, -5 });
    magic = true;
  }

  @Override
  public String toString() {
    return (
      this.getClass() +
      " " +
      super.toString() +
      " magic: " +
      magic +
      ", " +
      state
    );
  }
    
}
