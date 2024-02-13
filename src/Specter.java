public class Specter {
    private boolean electricImmunity;
    private boolean explosionImmunity;

    public Specter(boolean electricImmunity,boolean explosionImmunity) {
        this.electricImmunity = electricImmunity;
        this.explosionImmunity = explosionImmunity;
    }

    public void printDamage() {
        int baseDamage = new Bow().getDamage();
        int damageElectric = new ElectricBow().getDamage();
        int damageExplosive = new ExplosiveBow().getDamage();

        if (!electricImmunity) {
            System.out.println("Нанесен урон: " + damageElectric);
        }

        if (!explosionImmunity) {
            System.out.println("Нанесен урон: " + damageExplosive);
        }

        if (electricImmunity && explosionImmunity) {
            System.out.println("Нанесен урон: " + baseDamage);
        }
    }
}
