package utils;

import data.models.User;
import dtos.requests.AddUserRequest;
import dtos.responses.AddUserResponse;

public class UserMapper {
    // i am converting request dto from the users to model/entity that can be understood by the system
    public User addUserRequestMapper(AddUserRequest userRequest){
        User user = new User();
        user.setName(userRequest.getName());
        user.setAddress(userRequest.getAddress());
        user.setBorrowedBooks(userRequest.getBorrowedBooks());
        user.setPhoneNubmber(userRequest.getPhoneNubmber());
        return user;
    }

    // i am converting model/entity from the system to dto that will be sent as a response to the user
    public AddUserResponse addUserResponseMapper(User user){
        AddUserResponse newAddUserResponse = new AddUserResponse();
        newAddUserResponse.setId(user.getId());
        newAddUserResponse.setName(user.getName());
        return newAddUserResponse;
    }
}
