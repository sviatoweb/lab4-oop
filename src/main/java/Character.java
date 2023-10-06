

// @Setter @Getter @AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;

    Character ( int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    public abstract void kick(Character c);

    public boolean isAlive(){
        return getHp() > 0;
    };

    public int getHp() {
        if (hp < 0) {
            return 0;
        } else {
            return hp;
        }
    }

    public void setHp(int val) {
        hp = val;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int val) {
        power = val;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
