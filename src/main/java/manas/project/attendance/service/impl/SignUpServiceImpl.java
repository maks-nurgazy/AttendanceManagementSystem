package manas.project.attendance.service.impl;

import manas.project.attendance.entity.User;
import manas.project.attendance.form.UserForm;
import manas.project.attendance.repository.UsersRepository;
import manas.project.attendance.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void signUp(UserForm userForm) {
        String hashPassword = passwordEncoder.encode(userForm.getPassword());

        User user = User.builder()
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .hashPassword(hashPassword)
                .userName(userForm.getUserName())
                .role(userForm.getRole())
                .build();

        usersRepository.save(user);
    }
}