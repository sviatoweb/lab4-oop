package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;

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

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
