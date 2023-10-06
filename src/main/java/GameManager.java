public class GameManager {
    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("Current hp of character №1 (" + c1.getClass().getSimpleName() + ")" + " = " + c1.getHp());
            System.out.println("Current hp of character №2 (" + c2.getClass().getSimpleName() + ")" + " = " + c2.getHp());

            System.out.println("Fight!");
            c1.kick(c2);
            c2.kick(c1);
        }
    }
}
