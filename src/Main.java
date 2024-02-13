public class Main {
    public static void main(String[] args) {
        Bow bow = new Bow();
        int damage = bow.getDamage();
        System.out.println("Обычный лук наносит " + damage + " урона");

        ElectricBow electricBow = new ElectricBow();
        int damageElectric = electricBow.getDamage();
        System.out.println("Электро лук наносит " + damageElectric + " урона");

        ExplosiveBow explosiveBow = new ExplosiveBow();
        int explosiveDamage = explosiveBow.getDamage();
        System.out.println("Лук со взрывом наносит " + explosiveDamage + " урона");

        Specter specter = new Specter(true, false); // создание объекта хищника с параметрами: иммунитет к электричеству, иммунитет к взрыву
        specter.printDamage();

        Rebel rebel = new Rebel(true, true); // создание объекта мятежника с параметрами: иммунитет к электричеству, иммунитет к взрыву, здоровье
        rebel.printDamage();
    }
}


