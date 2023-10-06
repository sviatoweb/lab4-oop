import java.util.Random;


public class CharacterFactory {
    public static void main(String[] args) {
        Character c = createCharacter();
        System.out.println(c);
    }

    public static Character createCharacter() { 
        Character[] Characters = {new King(), new Knight(), new Elf(), new Hobbit()};

        Random rand = new Random();
        int randomIndex = rand.nextInt(4);

        Character randomCharacter = Characters[randomIndex];
        return randomCharacter;
    }
}
