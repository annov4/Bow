public class ExplosiveBow extends Bow {
    @Override
    public int getDamage() {
        int damageExplosive = super.getDamage() * 5;
        return damageExplosive;
    }
}
