public class Warrior extends Character{

    private static int defense = 2;
    private static String archetype = "Warrior";

    public static int getDefense() { return defense; }

    public static String getArchetype() { return archetype; }

    public static int damage(int opponentDamage) {
        int health = getHealth();
        int attack = opponentDamage - getDefense();
        health = getHealth() - attack;
        return health;
    }

    private static String toString (int attribute) { return "" + attribute; }

    public static void displayWarrior() {

        System.out.println("Class : " + getArchetype());
        damage= health = speed = 15;
        displayStats();
        System.out.println("Defense : " + getDefense());
        System.out.println(getDamage());
    }

}
