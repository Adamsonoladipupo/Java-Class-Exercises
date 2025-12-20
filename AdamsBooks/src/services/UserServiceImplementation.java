package services;

import data.models.User;
import data.repositories.UserRepository;
import data.repositories.UserRepositoryImplementation;
import dtos.requests.AddUserRequest;
import dtos.responses.AddUserResponse;
import utils.UserMapper;

public class UserServiceImplementation implements  UserService{
    private UserRepository userRepository = new UserRepositoryImplementation();

    @Override
    public AddUserResponse addUser(AddUserRequest addUserRequest) {
        UserMapper mapUser = new UserMapper();
        User newEntity = mapUser.addUserRequestMapper(addUserRequest);
        userRepository.save(newEntity);
        AddUserResponse newAddUserResponse = mapUser.addUserResponseMapper(newEntity);
        return newAddUserResponse;
    }

    public int getNumberOfUsers(){
        return this.userRepository.getCount();
    }
}
