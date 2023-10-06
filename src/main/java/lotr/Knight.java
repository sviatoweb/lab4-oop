package lotr;

import java.util.Random;

public class Knight extends Character{
    public Knight() {
        super(6, 6);
    }

    @Override
    public void kick(Character c) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(12) + 2;
        c.setHp(c.getHp()-randomNumber);
    }

}
