package ru.manasowalbert.springboot.crudapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.manasowalbert.springboot.crudapp.dao.UserDao;
import ru.manasowalbert.springboot.crudapp.model.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    private final UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userDao.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userDao.deleteById(id);

    }

    @Override
    public User findById(Long id) {
        return userDao.getOne(id);
    }
}
