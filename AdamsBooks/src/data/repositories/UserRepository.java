package data.repositories;

import data.models.User;

public interface UserRepository {


    int amountOfUsers();

    User save(User user);

    void delete(User user);

    User findUserByID(int userID);

    void deleteByID(int userID);

    void deleteAllUsers();

    boolean existByUserID(int userID);

    void updateUser(User newUser);
}
