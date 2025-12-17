package utils;

import data.models.User;
import dtos.requests.AddUserRequest;
import dtos.responses.AddUserResponse;

public class AddUserMapper {
    public AddUserRequest addUserRequest(User user){
        AddUserRequest addUserRequest = new AddUserRequest();
        addUserRequest.setName(user.getName());
        addUserRequest.setAddress(user.getAddress());
        addUserRequest.setPhoneNubmber(user.getPhoneNubmber());
        addUserRequest.setId(user.getId());
        addUserRequest.setBorrowedBooks(user.getBorrowedBooks());
        return addUserRequest;
    }

    public AddUserResponse addUserResponse(AddUserRequest addUserRequest){
        AddUserResponse addUserResponse = new AddUserResponse();
        addUserResponse.setName(addUserRequest.getName());
        addUserResponse.setId(addUserRequest.getId());
        return addUserResponse;
    }
}
