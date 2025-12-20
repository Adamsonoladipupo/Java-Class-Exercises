package services;

import dtos.requests.AddUserRequest;
import dtos.responses.AddUserResponse;

public interface UserService {
    AddUserResponse addUser(AddUserRequest addUserRequest);
}
