package weapon;

public class Weapon {
    public static String name;

    public void Weapon(String name) {
        this.name = name;
    }

    public String shot() {
        return "звук_выстрела";
    }
}
