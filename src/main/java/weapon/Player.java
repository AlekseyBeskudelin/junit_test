package weapon;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Pistol(),
                new Slingshot(),
                new Automat()
        };
    }

    public int getSlotCount() {
        return weaponSlots.length;
    }


    public String shotWithWeapon(int slot) {

        if (slot > weaponSlots.length - 1) {
           return "Номер слота введён некорректно!";
        } else {
            Weapon weapon = weaponSlots[slot];
            return weapon.shot();

        }


    }
}
