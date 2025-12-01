package es.uclm.esi.iso2.axx.library_manager_server;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import Control.User;

@DisplayName("User Entity Tests (Server)")
public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    @DisplayName("Test User creation")
    public void testUserCreation() {
        assertNotNull(user);
    }

    @Test
    @DisplayName("User should have name, ID, and email fields")
    public void testUserFields() {
        assertEquals(3, user.getClass().getDeclaredFields().length);
    }
}
