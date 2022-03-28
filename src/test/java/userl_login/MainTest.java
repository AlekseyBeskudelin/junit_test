package userl_login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void testConcat_validArgument_success() throws UserNotFoundException {
        // given:
        User created = new User("Aleksandr", "pass7", 16, "polya@gmail.com");
        String name = "Ivan";
        String pass = "pass3";
        // when:
        User user3 = Main.getUserByLoginAndPassword(name, pass);

        // then:
        Assertions.assertNotEquals(created, user3);
    }



}