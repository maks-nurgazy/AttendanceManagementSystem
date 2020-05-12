package manas.project.attendance.service.impl;

import manas.project.attendance.entity.User;
import manas.project.attendance.repository.UserRepository;
import manas.project.attendance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> findOneByUserName(String userName) {
        return userRepository.findOneByUserName(userName);
    }
}
