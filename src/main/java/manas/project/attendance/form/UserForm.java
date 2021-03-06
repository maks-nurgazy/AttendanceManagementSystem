package manas.project.attendance.form;

import lombok.Data;
import manas.project.attendance.model.Role;

@Data
public class UserForm {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private Role role;
}