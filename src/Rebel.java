public class Rebel {
        private boolean electricImmunity;
        private boolean explosionImmunity;

        public Rebel(boolean electricImmunity,boolean explosionImmunity) {
            this.electricImmunity = electricImmunity;
            this.explosionImmunity = explosionImmunity;
        }
    public void printDamage() {
        int baseDamage = new Bow().getDamage();
        int damageElectric = new ElectricBow().getDamage();
        int damageExplosive = new ExplosiveBow().getDamage();

        if (!electricImmunity) {
            System.out.println("Нанесен урон: " + damageElectric * 2);
        }

        if (!explosionImmunity) {
            System.out.println("Нанесен урон: " + damageExplosive * 2);
        }

        if (electricImmunity && explosionImmunity) {
            System.out.println("Нанесен урон: " + baseDamage * 2);
        }
    }
}
