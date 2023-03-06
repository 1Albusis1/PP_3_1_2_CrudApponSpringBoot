package ru.manasowalbert.springboot.crudapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.manasowalbert.springboot.crudapp.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
