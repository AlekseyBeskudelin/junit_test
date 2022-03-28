import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import weapon.Player;

class PlayerTest {
    @Test
    public void getSlotCountSuccess() {
        // given:
        Player player = new Player();
        int expected = 3;

        int result = player.getSlotCount();
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shotWithWeaponSuccess() {
        // given:
        Player player = new Player();
        String targetMessage = "Номер слота введён некорректно!";
        int slot = 2;

        // when:
        String result = player.shotWithWeapon(slot);

        // then:
        Assertions.assertEquals(targetMessage, result);
    }
}