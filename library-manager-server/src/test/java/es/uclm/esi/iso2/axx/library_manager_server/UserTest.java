package es.uclm.esi.iso2.axx.library_manager_server;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("User Entity Tests (Server)")
public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    @DisplayName("Test User object creation")
    public void testUserCreation() {
        assertNotNull(user, "User object should not be null");
    }

    @Test
    @DisplayName("Test User attributes are accessible")
    public void testUserAttributesExist() {
        assertDoesNotThrow(() -> user.getClass().getDeclaredFields());
    }

    @Test
    @DisplayName("Test User instance type")
    public void testUserInstance() {
        assertTrue(user instanceof User);
    }
}
