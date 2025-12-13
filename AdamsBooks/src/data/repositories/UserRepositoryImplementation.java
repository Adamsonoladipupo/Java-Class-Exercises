package data.repositories;

import data.models.User;

import java.util.ArrayList;

public class UserRepositoryImplementation implements UserRepository{
    private int count = 0;
    private ArrayList <User> users = new ArrayList<>();

    @Override
    public int amountOfUsers() {
        return users.size();
    }


    @Override
    public User save(User user) {
        if (isNew(user)){
            saveNew(user);
        } else {
            updateUser(user);
        }
        return user;
    }

    @Override
    public void updateUser(User newUser) {
        for (User user : users){
            if (newUser.getId() == user.getId()){
                user = newUser;
            }
        }
    }

    @Override
    public void delete(User user) {
        users.remove(user);
        count--;
    }

    @Override
    public User findUserByID(int userID) {
        for (User user : users){
            if(userID == user.getId()){
                return user;
            } else return null;
        }
        return null;
    }

    @Override
    public void deleteByID(int userID) {
        int userIndex = 0;
        for (User user : users){
            if (user.getId() == userID){
                userIndex = users.indexOf(user);
            }
        }
        users.remove(userIndex);

    }

    @Override
    public void deleteAllUsers() {
        users.clear();
    }

    @Override
    public boolean existByUserID(int userID) {
        for (User user : users){
            if (user.getId() == userID){
                return true;
            }
        }
        return false;
    }

    public void saveNew(User user){
        count++;
        user.setId(count);
        users.add(user);

    }
    public boolean isNew(User user){
        return user.getId() == 0;
    }
}
