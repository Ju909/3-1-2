package ru.javamentor.springmvc.service;


import ru.javamentor.springmvc.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void removeUserById(long id);

    List<User> getAllUser();

    User getUserById(long id);

    void updateUser(Long id, User user);

}
