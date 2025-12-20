package data.repositories;

import data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplementationTest {
    UserRepositoryImplementation newUserRepository;

    @BeforeEach
    public void setUp(){
        newUserRepository = new UserRepositoryImplementation();
    }

    @Test
    public void CheckIfUserRepositoryIsEmptyIsEmptyTest(){
        assertEquals(0, newUserRepository.amountOfUsers());
    }

    @Test
    public void AddNewUserToTheUserRepositoryTest(){
        User user1 = new User();
        newUserRepository.save(user1);
        assertEquals(1, newUserRepository.amountOfUsers());
        assertEquals(1, newUserRepository.getCount());

    }

    @Test
    public void AddTwoUsersToTheUserRepositoryThenDeleteAUserTest(){
        User user1 = new User();
        newUserRepository.save(user1);
        User user2 = new User();
        newUserRepository.save(user2);
        assertEquals(2, newUserRepository.amountOfUsers());
        newUserRepository.delete(user1);
        assertEquals(1, newUserRepository.amountOfUsers());
    }

    @Test
    public void AddUsersToTheUserRespositoryThenFindUserByIDTest(){
        User user1 = new User();
        newUserRepository.save(user1);
        User user2 = new User();
        newUserRepository.save(user2);
        assertEquals(2, newUserRepository.amountOfUsers());
        User foundUser = newUserRepository.findUserByID(1);
        assertEquals(1, foundUser.getId());
    }

    @Test
    public void AddUsersToTheUserRepositoryThenDeleteAUserUsingItUserIDTest(){
        User user1 = new User();
        newUserRepository.save(user1);
        User user2 = new User();
        newUserRepository.save(user2);
        assertEquals(2, newUserRepository.amountOfUsers());
        newUserRepository.deleteByID(2);
        assertEquals(1, newUserRepository.amountOfUsers());
    }

    @Test
    public void AddMultipleUserToTheUserRepositoryAndDeleteAllUsers(){
        User user1 = new User();
        newUserRepository.save(user1);
        User user2 = new User();
        newUserRepository.save(user2);
        User user3 = new User();
        newUserRepository.save(user3);
        assertEquals(3, newUserRepository.amountOfUsers());
        newUserRepository.deleteAllUsers();
        assertEquals(0, newUserRepository.amountOfUsers());
    }

    @Test
    public void AddMultipleUsersToTheUserRepositoryAddFindIfAParticularUserExitsTest(){
        User user1 = new User();
        newUserRepository.save(user1);
        User user2 = new User();
        newUserRepository.save(user2);
        User user3 = new User();
        newUserRepository.save(user3);
        assertEquals(3, newUserRepository.amountOfUsers());
        assertTrue(newUserRepository.existByUserID(3));
    }

    @Test
    public void AddMultipleUsersToTheUserRepositoryAddFindANonExisitngUserTest(){
        User user1 = new User();
        newUserRepository.save(user1);
        User user2 = new User();
        newUserRepository.save(user2);
        User user3 = new User();
        newUserRepository.save(user3);
        assertEquals(3, newUserRepository.amountOfUsers());
        assertFalse(newUserRepository.existByUserID(5));
    }

    @Test
    public void AddMultipleUsersToTheUserRepositoryAAndUpdateAUserDetailsTest(){
        User user1 = new User();
        newUserRepository.save(user1);
        User user2 = new User();
        user2.setName("Bola");
        newUserRepository.save(user2);
        User user3 = new User();
        newUserRepository.save(user3);
        assertEquals(3, newUserRepository.amountOfUsers());
        user2.setName("Ola");
        assertEquals("Ola",user2.getName());
    }



}