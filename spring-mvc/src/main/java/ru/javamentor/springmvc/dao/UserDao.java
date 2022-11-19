package ru.javamentor.springmvc.dao;


import ru.javamentor.springmvc.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUserById(long id);

    void updateUser(Long id, User user);
}
