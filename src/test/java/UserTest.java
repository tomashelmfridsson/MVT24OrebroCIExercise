import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    public void addUser() {
        User user = new User("Kalle", "abc123");
    }

    @Test
    public void getName() {
        User user = new User("Kalle", "abc123");
        assertEquals("Kalle", user.getName());
    }

    @Test
    public void getPassword() {
        User user = new User("Kalle", "abc123");
        assertEquals("abc123", user.getPassword());
    }

    @Test
    public void changeName() {
        User user = new User("Kalle", "abc123");
        user.changeName("Olle");
        assertEquals("Olle", user.getName());

    }
}
/*
Git övningen är alltså att
Skapa en branch
Rätta felet
Commit och Push till Github
I Github, se att testet går bra (Actions)
Skapa en PR
Merga koden till main
I din IDE, byt  till main branch och gör pull
Se att fixen är där
 */