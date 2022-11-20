public class BaseHero {

  protected String state;
  protected int attack;
  protected int protect;
  protected float health;
  protected int speed;
  protected int[] damage;

  public BaseHero(
    String state,
    int attack,
    int protect,
    float health,
    int speed,
    int[] damage
  ) {
    this.attack = attack;
    this.damage = damage;
    this.health = health;
    this.state = state;
    this.protect = protect;
    this.speed = speed;
  }

  @Override
  public String toString() {
    return (
      "Attack: " +
      attack +
      " Protеct: " +
      protect +
      " Damage: " +
      (damage[0] + damage[1]) /
      2 +
      " Health: " +
      health +
      " Speed: " +
      speed
    );
  }
}
