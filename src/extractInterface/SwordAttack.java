package extractInterface;
import java.util.Random;

public class SwordAttack implements Attack{
    private static final Random rand = new Random();
    private final int swordMinDamage, swordMaxDamage;

    SwordAttack(int swordMinDamage,int swordMaxDamage){
        this.swordMinDamage = swordMinDamage;
        this.swordMaxDamage = swordMaxDamage;
    }
    @Override
    public String Attack(GameCharacter attacker, GameCharacter target) {
        int damage = rand.nextInt(swordMaxDamage - swordMinDamage + 1) + swordMinDamage;
        target.takeDamage(damage);
        return attacker.getName() + " struck " + target.getName() + " with a sword for " + damage + " points of damage";
    }
}
