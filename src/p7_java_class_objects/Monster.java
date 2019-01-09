package p7_java_class_objects;

public class Monster {
    public final String TOMBSTONE = "Here Lies a Dead monster";

    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPositoin = 0;
    private int yPosition = 0;
    private boolean alive = true;

    public String name = "Big Monster";

    public int getAttack() {
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int decreaseHealth) {
        health = health - decreaseHealth;
        if (health <= 0) alive = false;
    }

    public void setHealth(double decreaseHealth) {
        int intDecreaseHealth = (int) decreaseHealth;
        if (health <= 0) alive = false;
    }

    public Monster() {
    }

    public Monster(int health, int attack, int movement) {
        this.health = health;
        this.attack = attack;
        this.movement = movement;
    }
}
