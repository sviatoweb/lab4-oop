package lotr;
import java.util.Random;

public class King extends Character{
    public King() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(15) + 5;
        c.setHp(c.getHp()-randomNumber);
    }


}
