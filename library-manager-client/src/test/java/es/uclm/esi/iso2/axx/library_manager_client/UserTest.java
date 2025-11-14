package es.uclm.esi.iso2.axx.library_manager_client;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("User Entity Tests")
public class UserTest {
    
    private User user;
    
    @BeforeEach
    public void setUp() {
        user = new User();
    }
    
    @Test
    @DisplayName("Test User creation with default constructor")
    public void testUserCreation() {
        assertNotNull(user, "User object should not be null");
    }
    
    @Test
    @DisplayName("Test setting and getting user name")
    public void testSetAndGetName() {
        String expectedName = "John Doe";
        user.setName(expectedName);
        assertEquals(expectedName, user.getName(), "Name should match");
    }
    
    @Test
    @DisplayName("Test setting and getting user ID")
    public void testSetAndGetID() {
        String expectedID = "USER001";
        user.setID(expectedID);
        assertEquals(expectedID, user.getID(), "ID should match");
    }
    
    @Test
    @DisplayName("Test setting and getting user email")
    public void testSetAndGetEmail() {
        String expectedEmail = "john.doe@example.com";
        user.setEmail(expectedEmail);
        assertEquals(expectedEmail, user.getEmail(), "Email should match");
    }
    
    @Test
    @DisplayName("Test User with parameterized constructor")
    public void testUserWithParameters() {
        User paramUser = new User("Jane Smith", "USER002", "jane@example.com");
        
        assertEquals("Jane Smith", paramUser.getName());
        assertEquals("USER002", paramUser.getID());
        assertEquals("jane@example.com", paramUser.getEmail());
    }
    
    @Test
    @DisplayName("Test User with null values")
    public void testUserWithNullValues() {
        user.setName(null);
        user.setID(null);
        user.setEmail(null);
        
        assertNull(user.getName(), "Name should be null");
        assertNull(user.getID(), "ID should be null");
        assertNull(user.getEmail(), "Email should be null");
    }
    
    @Test
    @DisplayName("Test User with empty strings")
    public void testUserWithEmptyStrings() {
        user.setName("");
        user.setID("");
        user.setEmail("");
        
        assertEquals("", user.getName(), "Name should be empty");
        assertEquals("", user.getID(), "ID should be empty");
        assertEquals("", user.getEmail(), "Email should be empty");
    }
    
    @Test
    @DisplayName("Test User email validation format")
    public void testEmailValidation() {
        String validEmail = "test@domain.com";
        user.setEmail(validEmail);
        
        assertTrue(user.getEmail().contains("@"), "Email should contain @");
        assertTrue(user.getEmail().contains("."), "Email should contain .");
    }
}
