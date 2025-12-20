package services;

import data.models.User;
import data.repositories.UserRepository;
import data.repositories.UserRepositoryImplementation;
import dtos.requests.AddUserRequest;
import dtos.responses.AddUserResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.UserMapper;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplementationTest {
    UserRepository userRepository;
    UserServiceImplementation userServiceImplementation;
    AddUserRequest addUserRequest;
    UserMapper newUserMapper;

    @BeforeEach
    public void setUp(){
        userRepository = new UserRepositoryImplementation();
        userServiceImplementation = new UserServiceImplementation();
        addUserRequest = new AddUserRequest();
        newUserMapper = new UserMapper();

    }

    @Test
    public void CheckIfUserRepositoryIsEmptyTest(){
        assertEquals(0, userServiceImplementation.getNumberOfUsers());
    }

    @Test
    public void AddANewUserToTheUserRepositoryTest(){
        addUserRequest.setPhoneNubmber("09022334455");
        addUserRequest.setName("Adams");
        addUserRequest.setPhoneNubmber("semicolon Yava Lagos");
        userServiceImplementation.addUser(addUserRequest);
        AddUserResponse newUserRespnse = newUserMapper.addUserResponseMapper(newUserMapper.addUserRequestMapper(addUserRequest));
        //assertEquals(1, userRepository.getCount());
        assertEquals(1, userServiceImplementation.getNumberOfUsers());
        assertEquals("Adams", newUserRespnse.getName());
        System.out.print(newUserRespnse.getId());
    }

}