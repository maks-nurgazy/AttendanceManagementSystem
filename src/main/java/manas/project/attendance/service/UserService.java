package manas.project.attendance.service;

import manas.project.attendance.entity.User;

import java.util.Optional;

public interface UserService {
    void save(User user);
    Optional<User> findOneByUserName(String userName);
}
