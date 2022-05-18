package com.example.Revizie.Tehnica.repository;

import com.example.Revizie.Tehnica.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersModel, Long> {

    Optional<UsersModel> findByLoginAndPassword(String login, String password);
    Optional<UsersModel> findFirstByLogin(String login);
}
