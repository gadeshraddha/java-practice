public class RpgCharacter {
    public static void main (String [] args) {
        int health = 100;
        int mana = 50;
        double momentSpeed = 5.5;
        boolean isAlive = true;
        char characterClass = 'W';

        System.out.println("Warrior is alive. HP: " + health + ", mana: " + mana + ", speed: " + momentSpeed + ", class: " + characterClass);
    }
}