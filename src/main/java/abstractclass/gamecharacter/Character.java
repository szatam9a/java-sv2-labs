package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private static final int MAX_DAMAGE = 10;
    private static final int MAX_DEFENCE = 5;

    private Point position;
    private int hitPoint = 100;
    private Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public boolean isAlive() {
        if (hitPoint > 0) {
            return true;
        } else
            return false;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(1, MAX_DAMAGE + 1);
    }

    private int getActualDefense() {
        return random.nextInt(0, MAX_DEFENCE + 1);
    }

    protected void hit(Character enemy, int damage) {
        if (enemy.getActualDefense() < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }
    public void primaryAttack(Character enemy){
        hit(enemy,getActualPrimaryDamage());
    }
    private void decreaseHitPoint(int diff){
        hitPoint-=diff;
    }
    abstract public void secondaryAttack(Character enemy);
}
