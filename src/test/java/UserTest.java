import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UserTest {
    @Test
    public void addUser(){
        User user = new User("Kalle","abc123");
    }

    @Test
    public void getName(){
        User user = new User("Kalle","abc123");
        assertEquals("Kalle",user.getName());
    }

    @Test
    public void getPassword(){
        User user = new User("Kalle","abc123");
        assertEquals("abc123",user.getPassword());
    }
}
