package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character{
    private int numberOfArrows;

    public Archer(Point position, Random random) {
        super(position, random);
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }
    private int getActualSecondaryDamage(){
        return getRandom().nextInt(1, 5 + 1);
    }
    private void shootingAnArrow(Character enemy){
        numberOfArrows--;
        hit(enemy,getActualSecondaryDamage());
    }
    public int getNumberOfArrows() {
        return numberOfArrows;
    }
}
