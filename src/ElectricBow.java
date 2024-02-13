class ElectricBow extends Bow {
    @Override
    public int getDamage() {
        int damageElectric = super.getDamage() + (int) (Math.random() * 100) + 1;
        return damageElectric;
    }
}