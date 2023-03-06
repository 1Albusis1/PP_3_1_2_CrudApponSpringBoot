package ru.manasowalbert.springboot.crudapp.service;

import ru.manasowalbert.springboot.crudapp.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User saveUser(User user);
    void deleteById(Long id);
    User findById(Long id);
}
